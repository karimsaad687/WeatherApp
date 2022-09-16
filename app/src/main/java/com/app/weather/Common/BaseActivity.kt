package app.w8r.Common

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.Canvas
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.app.weather.DashBoard.DashBoard
import com.app.weather.R
import locationprovider.davidserrano.com.LocationProvider
import java.io.File
import java.io.FileOutputStream
import java.util.*


open class BaseActivity : AppCompatActivity() {

    open var dp=0.0f
    lateinit var imageUri:Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dp=resources.displayMetrics.density

        //use dark status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
          //      View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

        if (Build.VERSION.SDK_INT >= 21) {
            window.statusBarColor = ContextCompat.getColor(
                this,
                R.color.black
            ) //status bar or the time bar at the top
        }

        //set light mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

    }
    open fun hideNavigationBar() {
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            val v = this.window.decorView
            v.systemUiVisibility = View.GONE
        } else if (Build.VERSION.SDK_INT >= 19) {
            //for new api versions.
            val decorView = window.decorView
            val uiOptions =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            decorView.systemUiVisibility = uiOptions
        }
    }
    open fun transparentStatusBar(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
            window.decorView.systemUiVisibility = (window.decorView.getSystemUiVisibility() and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv())
        }
    }
    open fun showStatusBar(){
        if (Build.VERSION.SDK_INT >= 21) {
            val w: Window = window
            w.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }
    open fun hideStatusBar(){
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }



    override fun onStop() {
        super.onStop()


    }

    override fun onResume() {
        super.onResume()


    }

    // check permission for camera and external storage
    // and if granted will open the camera
    open fun openCameraGallery() {
        if ((ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) || (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) || (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED)) {
            //ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE},12);
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA), 13)
        } else {
            takePhotoFromCamera()
        }
    }

    open fun takePhotoFromCamera() {
        var values = ContentValues()
        values.put(MediaStore.Images.Media.TITLE, "New Picture")
        values.put(MediaStore.Images.Media.DESCRIPTION, "From your Camera")
        imageUri = contentResolver.insert(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values
        )!!
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)
        startActivityForResult(intent, 2)
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==13 &&grantResults.size>0&&
            grantResults[0]==PackageManager.PERMISSION_GRANTED &&
            grantResults[1]==PackageManager.PERMISSION_GRANTED){
            openCameraGallery()
        }else if(requestCode == 19 && grantResults.size>0&&grantResults[0] == PackageManager.PERMISSION_GRANTED){
            //call location function
            location
        }else if(requestCode == 19 && grantResults.size>0&&grantResults[0] != PackageManager.PERMISSION_GRANTED){
            //location permission is denied to will return the view to original form
            val toast=Toast.makeText(applicationContext,getString(R.string.location_permission_denied),Toast.LENGTH_LONG)
            toast.show()
            (this as DashBoard).clearUI()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //Log.i("datadata_dialog"," "+requestCode);
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_CANCELED) {
            return
        }

        if (requestCode == 2) {
            //get originl path of the image
            getPhoto(getRealPathFromURI(imageUri)!!)
        }
    }

    open fun getRealPathFromURI(contentUri: Uri?): String? {
        val proj = arrayOf(MediaStore.Images.Media.DATA)
        val cursor: Cursor = managedQuery(contentUri, proj, null, null, null)
        val column_index: Int = cursor
            .getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
        cursor.moveToFirst()
        return cursor.getString(column_index)
    }

    open fun getPhoto(path:String) {}


    fun askForPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ////Log.i("datadata_loc","null");
            //ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE},12);

            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                19
            )
        }else {
            location
        }
    }

    //location library help to fetch current location
    //by using last known location or gps of network provider
    var callback: LocationProvider.LocationCallback = object : LocationProvider.LocationCallback {
        fun locationRequestStopped(lat: Float, lon: Float) {
            //location updates stopped
        }

        override fun onNewLocationAvailable(lat: Float, lon: Float) {
            Log.i("datadata_location_new",lat.toString()+" "+lon)
            setLocation(lat,lon)
        }

        override fun locationServicesNotEnabled() {
            //location service is turned off so the view will return to original form
            val toast=Toast.makeText(applicationContext,getString(R.string.location_service_is_turned_off),Toast.LENGTH_LONG)
            toast.show()
            (this@BaseActivity as DashBoard).clearUI()
        }

        override fun updateLocationInBackground(lat: Float, lon: Float) {
            //if a listener returns after the main locationAvailable callback, it will go here
        }

        override fun networkListenerInitialised() {
            //when the library switched from GPS only to GPS & network
        }

        override fun locationRequestStopped() {

        }
    }
       // //Log.i("datadata_loc","here");
    val location: Unit
        get() {
            val locationProvider = LocationProvider.Builder()
                .setContext(this)
                .setListener(callback)
                .create()

            //start getting location

            //start getting location
            locationProvider.requestLocation()
        }



    open fun setLocation(lat: Float,lng:Float) {}

    //convert view to bitmap to be share on facebook or twitter
    fun createBitmapFromView(view: View): Bitmap {

        view.layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
        val dm = resources.displayMetrics
        view.measure(
            View.MeasureSpec.makeMeasureSpec(dm.widthPixels, View.MeasureSpec.EXACTLY),
            View.MeasureSpec.makeMeasureSpec(dm.heightPixels, View.MeasureSpec.EXACTLY)
        )
        view.layout(0, 0, view.measuredWidth, view.measuredHeight)
        val bitmap = Bitmap.createBitmap(
            view.measuredWidth,
            view.measuredHeight,
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        view.layout(view.left, view.top, view.right, view.bottom)
        view.draw(canvas)
        return bitmap
    }

    fun convertBitmapToFilePath(bitmap:Bitmap):String{
        val file = File(this.externalCacheDir, Date().time.toString()+".png")
        val fileOutputStream = FileOutputStream(file)
        bitmap.compress(Bitmap.CompressFormat.PNG, 95, fileOutputStream)
        fileOutputStream.flush()
        fileOutputStream.close()
        file.setReadable(true, false)
        return file.path
    }



}