package com.app.weather.DashBoard


import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.w8r.Common.BaseActivity
import app.w8r.Common.MyUtils
import butterknife.ButterKnife
import com.app.weather.DashBoard.History.HistoryAdapter
import com.app.weather.DashBoard.History.HistoryModel
import com.app.weather.FullImageDialog.FullImageDialog
import com.app.weather.R
import com.app.weather.Room.WeatherDataBase
import com.app.weather.databinding.ActivityDashBoardBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch


class DashBoard : BaseActivity(), TextWatcher {
    lateinit var binding: ActivityDashBoardBinding

    var weatherController: GetWeatherController? = null
    var observer: Observer<WeatherModel>? = null

    lateinit var appDataBase:WeatherDataBase

    lateinit var weatherModel:WeatherModel

    lateinit var historyModels:List<HistoryModel>
    lateinit var adapter:HistoryAdapter

    var imagePath=""
    var conditionIcon=0
    var open=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDashBoardBinding.inflate(layoutInflater);

        setContentView(binding.root)
        ButterKnife.bind(this)

        //initalize room database
        appDataBase=WeatherDataBase.getDatabase(this)

        //call history from cooroutine
        CoroutineScope(IO).launch{
            loadHistory(false)
        }

        hideNavigationBar()

        //show camera box
        MyUtils.animateAlpha(binding.cameraIm,1.0f,1000,0)

        binding.cameraIm.setOnClickListener({
            openCameraGallery()
        })

        //initalize ViewModel and observer of weather controller
        weatherController = ViewModelProvider(this).get(GetWeatherController::class.java)
        observer = Observer<WeatherModel> { model ->
            weatherModel=model

            binding.tempTv.setText(model.temp+"°C")

            //in egypt we only need this 3 images
            if(model.desc.equals("clear sky")) {
                binding.weatherIm.setImageResource(R.drawable.ic_weather_sunny)
                conditionIcon=R.drawable.ic_weather_sunny
            }else if(model.desc.equals("few clouds")) {
                binding.weatherIm.setImageResource(R.drawable.ic_weather_few_clouds)
                conditionIcon=R.drawable.ic_weather_few_clouds
            }else {
                binding.weatherIm.setImageResource(R.drawable.ic_weather_rainy)
                conditionIcon=R.drawable.ic_weather_rainy
            }

            binding.conditionTv.setText(model.condition)
            //show history panel
            MyUtils.animateTranslateY(binding.topData,0.0f)

        }
        weatherController!!.getLinkedList().observe(this, observer!!)

        binding.locationEt.addTextChangedListener(this)

        //when press on history button
        binding.historyIm.setOnClickListener({
            if(!open) {
                MyUtils.animateHeight(binding.bottomData,350 * dp)
            }else{
                MyUtils.animateHeight(binding.bottomData,140 * dp)
            }
            open=!open
        })

        //when save pressed a new entry added the database
        //and return the view to original form to take another image
        binding.saveTv.setOnClickListener({
            if(binding.locationEt.text.toString().trim().length>0){
                binding.locationEt.isCursorVisible=false
                binding.saveTv.visibility=View.GONE
                var bitmap = createBitmapFromView(binding.photoCl)
                var path=convertBitmapToFilePath(bitmap)
                binding.locationEt.isCursorVisible=true
                var weatherDatabaseModel=HistoryModel(
                    0,
                    path,
                    weatherModel.temp,
                    binding.locationEt.text.toString(),
                    conditionIcon
                )
                CoroutineScope(IO).launch{
                    appDataBase.weatherDao().addWeatherModel(weatherDatabaseModel)

                    loadHistory(historyModels.size>0)
                    clearUI()

                }
                //historyModels.add(historyModel)
                adapter.notifyDataSetChanged()


                //shareImage(bitmap,"com.facebook.katana","Facebook")
            }
        })

        //to remove all entries from database
        binding.clearTv.setOnClickListener({
            CoroutineScope(IO).launch{
                appDataBase.weatherDao().removeAllData()
                loadHistory(false)
            }
        })
    }
    fun loadHistory(shake:Boolean){
        historyModels=appDataBase.weatherDao().readAllData()
        if(historyModels.size>0){
            //cannot run on looper thread so runonUiThread is needed
            runOnUiThread {
                MyUtils.animateTranslateY(binding.bottomData,0.0f)
                binding.clearTv.visibility=View.VISIBLE
            }


        }else{
            runOnUiThread {
                MyUtils.animateTranslateY(binding.bottomData,140.0f*dp)
                MyUtils.animateHeight(binding.bottomData,140 * dp)
                open=false
                binding.clearTv.visibility=View.GONE
            }

        }
        binding.recycler.post(Runnable {
            adapter = HistoryAdapter(this, historyModels)
            binding.recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
            binding.recycler.adapter = adapter
        })

        //shake the history panel to indicate thae a new entry is occured
        if(shake) {
            runOnUiThread {
                MyUtils.animateTranslateYDownUp(binding.bottomData)
            }
        }
    }

    override fun getPhoto(path: String) {
        super.getPhoto(path)
        Log.i("datadata_path",path)


        binding.photoIm.setImageURI(Uri.parse(path))
       // binding.photoIm.setImageURI(Uri.parse("/storage/emulated/0/Pictures/1663284119051.jpg"));
        imagePath=path;
        binding.cameraIm.visibility= View.GONE
        askForPermission()
    }


    override fun setLocation(lat: Float, lng: Float) {
        super.setLocation(lat, lng)
        // check for internet connection first before calling the weather api
        if(MyUtils.isOnline(this)) {
            weatherController!!.Start(this, arrayOf<Any>(lat, lng))
        }else{
            val toast= Toast.makeText(applicationContext,getString(R.string.check_internet_connection),
                Toast.LENGTH_LONG)
            toast.show()
            clearUI()
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        if(binding.locationEt.text!!.trim().length>0){
            binding.saveTv.visibility=View.VISIBLE
        }else{
            binding.saveTv.visibility=View.GONE
        }
    }

    override fun afterTextChanged(s: Editable?) {

    }

    fun openDialog(image:String){
        var dialog=FullImageDialog()
        dialog.addImage(image)
        dialog.show(supportFragmentManager,"dialog")
    }

    fun clearUI(){
        runOnUiThread {
            MyUtils.animateTranslateY(binding.topData,-210.0f*dp)
            binding.locationEt.setText("")
            binding.cameraIm.visibility= View.VISIBLE
            binding.photoIm.setImageResource(R.drawable.background)
        }
    }
}