package com.app.weather.DashBoard

import android.util.Log
import androidx.lifecycle.MutableLiveData
import app.w8r.Common.*
import com.androidnetworking.error.ANError
import com.app.weather.Common.ConstantsUrls
import com.app.weather.R
import org.json.JSONObject
import java.util.*

class GetWeatherController: BaseModel() {

    var activity: BaseActivity? = null
    var linkedList_: MutableLiveData<WeatherModel>? = null

    open fun getLinkedList(): MutableLiveData<WeatherModel> {
        if (linkedList_ == null) {
            linkedList_ = MutableLiveData()
        }
        return linkedList_!!
    }

    override fun Start(activity: BaseActivity, data: Any?) {
        super.Start(activity, data)
        this.activity = activity
        val objects = data as Array<Any>
        val map: MutableMap<String?, String?> =
            HashMap()
        map["lat"] = objects[0].toString()
        map["lon"] = objects[1].toString()
        map["units"] = "metric"
        map["appid"] = activity.getString(R.string.app_id)
        

        //map["countryCode"] = "+2"
       // map["notificationToken"] = FirebaseInstanceId.getInstance().getToken()
        Get(ConstantsUrls.weather, map)
    }

     override fun successObject(`object`: JSONObject) {
        super.successObject(`object`)
        try {

            getLinkedList().postValue(WeatherModel(`object`.toString()))
            //Log.i("datadata_token",`object`.getString("token"));
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun Failed(error: ANError) {
        super.Failed(error)
        try {
            Log.i("datadata_error", error.errorCode.toString() + "")
            val obj = JSONObject(error.errorBody)
            //fragment!!.ShowToast(obj.getString("message") + "", true)
        } catch (e: Exception) {
            e.printStackTrace()
        }


        //CustomToast.Show_Error_Toast(fragment.getActivity(),errorModel.getMessage());
        //fragment.updateView();
    }
}


