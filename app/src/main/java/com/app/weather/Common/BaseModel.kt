package app.w8r.Common

import android.app.Dialog
import android.os.Handler
import android.util.Log
import androidx.lifecycle.ViewModel
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import com.app.weather.Common.Loading
import okhttp3.OkHttpClient
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.util.*
import java.util.concurrent.TimeUnit

open class BaseModel: ViewModel() {

    var baseActivity: BaseActivity? = null
    val loading_dialog: Dialog? = null
    var ffmpegLoading: Loading? = null
    var oldUrl: String? = null
    var oldObject: JSONObject? = null
    val oldParams: Map<String, String>? = null
    val oldParamsFiles: Map<String, File>? = null
    var method = ""

    var isRunning = false

    fun openLoading(){
        ffmpegLoading = Loading()
        ffmpegLoading!!.show(baseActivity!!.fragmentManager.beginTransaction(), "loading")
    }
    fun closeLoading(){
        if (ffmpegLoading != null) {
            ffmpegLoading!!.dismissAllowingStateLoss()
        }
    }
    fun Get(url: String?, map: MutableMap<String?, String?>) {
        // Toast.makeText(baseActivity,"continue",Toast.LENGTH_SHORT);
        if (!isRunning) {
            isRunning = true

            Log.i("datadata",url+"\n"+map);
            ffmpegLoading = Loading()
            ffmpegLoading!!.show(baseActivity!!.fragmentManager.beginTransaction(), "loading")
            method = "get"
            oldUrl = url
           // oldObject = jsonObject

            val okHttpClient = OkHttpClient().newBuilder()
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .readTimeout(120, TimeUnit.SECONDS)
                    .writeTimeout(120, TimeUnit.SECONDS)
                    .build()
            AndroidNetworking.initialize(baseActivity, okHttpClient)
            AndroidNetworking.get(url)
                    .addQueryParameter(map)

                    .addHeaders("User-Agent", "android")
                    .setTag("test")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setUploadProgressListener { bytesUploaded, totalBytes ->
                        ////Log.i("datadata_per",bytesUploaded+" "+totalBytes);
                        //                        loading.setPercent(""+((bytesUploaded/totalBytes)*100));
                    }
                    .getAsJSONObject(object : JSONObjectRequestListener {
                        override fun onResponse(response: JSONObject) {
                            // do anything with response
                            try {
                                successObject(response)
                                if (ffmpegLoading != null) {
                                    ffmpegLoading!!.dismissAllowingStateLoss()
                                }
                            } catch (e: JSONException) {
                                e.printStackTrace()
                            }
                            Handler().postDelayed({
                                isRunning = false
                                //Log.i("datadata_running 2 ", isRunning + "");
                            }, 500)

                             Log.i("datadata", response.toString());
                        }

                        override fun onError(error: ANError) {

                            if (ffmpegLoading != null) {
                                ffmpegLoading!!.dismissAllowingStateLoss()
                            }
                            else {
                                Failed(error)
                            }
                            Handler().postDelayed({
                                isRunning = false
                                //Log.i("datadata_running 2 ", isRunning + "");
                            }, 500)
                            //Log.i("datadata",error.getMessage()+" "+error.getErrorBody());
                        }
                    })
        }
    }
    fun getWithoutToken(url: String?, map: MutableMap<String?, String?>) {
        // Toast.makeText(baseActivity,"continue",Toast.LENGTH_SHORT);
        if (!isRunning) {
            isRunning = true

            Log.i("datadata",url+"\n"+map);
            ffmpegLoading = Loading()
            ffmpegLoading!!.show(baseActivity!!.fragmentManager.beginTransaction(), "loading")
            method = "get"
            oldUrl = url
            // oldObject = jsonObject

            val okHttpClient = OkHttpClient().newBuilder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .writeTimeout(120, TimeUnit.SECONDS)
                .build()
            AndroidNetworking.initialize(baseActivity, okHttpClient)
            AndroidNetworking.get(url)
                .addQueryParameter(map)
                .addHeaders("User-Agent", "android")
                .setTag("test")
                .setPriority(Priority.MEDIUM)
                .build()
                .setUploadProgressListener { bytesUploaded, totalBytes ->
                    ////Log.i("datadata_per",bytesUploaded+" "+totalBytes);
                    //                        loading.setPercent(""+((bytesUploaded/totalBytes)*100));
                }
                .getAsJSONObject(object : JSONObjectRequestListener {
                    override fun onResponse(response: JSONObject) {
                        // do anything with response
                        try {
                            successObject(response)
                            if (ffmpegLoading != null) {
                                ffmpegLoading!!.dismissAllowingStateLoss()
                            }
                        } catch (e: JSONException) {
                            e.printStackTrace()
                        }
                        Handler().postDelayed({
                            isRunning = false
                            //Log.i("datadata_running 2 ", isRunning + "");
                        }, 500)

                        Log.i("datadata", response.toString());
                    }

                    override fun onError(error: ANError) {

                        if (ffmpegLoading != null) {
                            ffmpegLoading!!.dismissAllowingStateLoss()
                        }
                        Failed(error)
                        Handler().postDelayed({
                            isRunning = false
                            //Log.i("datadata_running 2 ", isRunning + "");
                        }, 500)
                        //Log.i("datadata",error.getMessage()+" "+error.getErrorBody());
                    }
                })
        }
    }
    fun getWithoutLoading(url: String?, map: MutableMap<String?, String?>) {
        // Toast.makeText(baseActivity,"continue",Toast.LENGTH_SHORT);
        if (!isRunning) {
            isRunning = true

            Log.i("datadata",url+"\n"+map);
            method = "get"
            oldUrl = url
            // oldObject = jsonObject


            //Log.i("datadata_token","token "+MySharedPref.getUserToken());
            val okHttpClient = OkHttpClient().newBuilder()
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .readTimeout(120, TimeUnit.SECONDS)
                    .writeTimeout(120, TimeUnit.SECONDS)
                    .build()
            AndroidNetworking.initialize(baseActivity, okHttpClient)

            AndroidNetworking.get(url)
                    .addQueryParameter(map)

                    .addHeaders("User-Agent", "android")
                    .setTag("test")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setUploadProgressListener { bytesUploaded, totalBytes ->
                        ////Log.i("datadata_per",bytesUploaded+" "+totalBytes);
                        //                        loading.setPercent(""+((bytesUploaded/totalBytes)*100));
                    }
                    .getAsJSONObject(object : JSONObjectRequestListener {
                        override fun onResponse(response: JSONObject) {
                            // do anything with response
                            try {
                                successObject(response)

                            } catch (e: JSONException) {
                                e.printStackTrace()
                            }
                            Handler().postDelayed({
                                isRunning = false
                                //Log.i("datadata_running 2 ", isRunning + "");
                            }, 500)

                             Log.i("datadata", response.toString());
                        }

                        override fun onError(error: ANError) {
                            isRunning = false
                            if (ffmpegLoading != null) {
                                ffmpegLoading!!.dismissAllowingStateLoss()
                            }
                            Failed(error)
                            //Log.i("datadata",error.getMessage()+" "+error.getErrorBody());
                        }
                    })
        }
    }


    fun postJson(url: String?, jsonObject: JSONObject) {
        // Toast.makeText(baseActivity,"continue",Toast.LENGTH_SHORT);
        if (!isRunning) {
            isRunning = true


            Log.i("datadata",url+"\n"+jsonObject);
            ffmpegLoading = Loading()
            ffmpegLoading!!.show(baseActivity!!.fragmentManager.beginTransaction(), "loading")
            method = "post"
            oldUrl = url
            oldObject = jsonObject

            val okHttpClient = OkHttpClient().newBuilder()
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .readTimeout(120, TimeUnit.SECONDS)
                    .writeTimeout(120, TimeUnit.SECONDS)
                    .build()
            AndroidNetworking.initialize(baseActivity, okHttpClient)
            AndroidNetworking.post(url)
                    .addJSONObjectBody(jsonObject)
                    .addHeaders("User-Agent", "android")
                    .setTag("test")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setUploadProgressListener { bytesUploaded, totalBytes ->
                        ////Log.i("datadata_per",bytesUploaded+" "+totalBytes);
                        //                        loading.setPercent(""+((bytesUploaded/totalBytes)*100));
                    }
                    .getAsJSONObject(object : JSONObjectRequestListener {
                        override fun onResponse(response: JSONObject) {
                            // do anything with response
                            try {
                                successObject(response)
                                if (ffmpegLoading != null) {
                                    ffmpegLoading!!.dismissAllowingStateLoss()
                                }
                            } catch (e: JSONException) {
                                e.printStackTrace()
                            }
                            Handler().postDelayed({
                                isRunning = false
                                //Log.i("datadata_running 2 ", isRunning + "");
                            }, 500)

                             Log.i("datadata", response.toString());
                        }

                        override fun onError(error: ANError) {
                            isRunning = false
                            if (ffmpegLoading != null) {
                                ffmpegLoading!!.dismissAllowingStateLoss()
                            }
                            Failed(error)
                            //Log.i("datadata",error.getMessage()+" "+error.getErrorBody());
                        }
                    })
        }
    }










    open fun successObject(`object`: JSONObject) {
        try {

        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

    fun successArray(`object`: JSONObject?) {}

    open fun Failed(error: ANError) {
        ////Log.i("datadata_error_error",error.getMessage());
//
//            // baseActivity.startActivity(new Intent(baseActivity, firstActivity.class));
//            //MySharedPref.setUserToken("");
//        } else if (error.errorCode == -1) {
//            //baseActivity.startActivity(new Intent(baseActivity, Login.class));
//        }
    }


    open fun Start(activity: BaseActivity, data: Any?) {
        this.baseActivity = activity
    }
}
