package app.w8r.Common

import android.R.attr
import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.graphics.Matrix
import android.graphics.drawable.ColorDrawable
import android.text.Spannable
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.util.Base64
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.animation.doOnEnd
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.time.Period
import android.app.NotificationManager
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


object MyUtils{


    fun multiTextColor(textview:TextView,word1:String,word2:String,color1:Int,color2:Int){
        val word: Spannable = SpannableString(word1)

        word.setSpan(
            ForegroundColorSpan(color1),
            0,
            word.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        textview.setText(word)
        val wordTwo: Spannable = SpannableString(" "+word2)
        wordTwo.setSpan(
            ForegroundColorSpan(color2),
            0,
            wordTwo.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textview.append(wordTwo)
    }
    fun multiTextColor(textview:TextView,words:Array<String>,colors:Array<Int>){
        textview.setText("")
        var start=0
        for (i in words.indices) {
            val word: Spannable = SpannableString(words[i])

            word.setSpan(
                    ForegroundColorSpan(colors[i]),
                    0,
                    word.length,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            start=start+word.length
            textview.append(word)
        }

    }

    fun animateHeight(view: View,valueTo:Float){
        var animator = ValueAnimator.ofFloat(view.height.toFloat(),valueTo)
        animator.addUpdateListener { animation: ValueAnimator? ->
            var param=view.layoutParams
            param.height=animation!!.animatedValue.toString().toFloat().toInt()
            view.layoutParams=param
        }
        animator.duration=500
        animator.start()
    }
    fun animateRotation(view: View,valueTo:Float){
        var animator = ValueAnimator.ofFloat(view.rotation,valueTo)
        animator.addUpdateListener { animation: ValueAnimator? ->
            view.rotation=animation!!.animatedValue.toString().toFloat()

        }
        animator.duration=500
        animator.start()
    }
    fun animateWidth(view: View,valueTo:Float){
        var animator = ValueAnimator.ofFloat(view.width.toFloat(),valueTo)
        animator.addUpdateListener { animation: ValueAnimator? ->
            var param=view.layoutParams
            param.width=animation!!.animatedValue.toString().toFloat().toInt()
            view.layoutParams=param
        }
        animator.duration=500
        animator.start()
    }
    fun animateTranslateY(view: View,valueTo:Float){
        var animator = ValueAnimator.ofFloat(view.translationY,valueTo)
        animator.addUpdateListener { animation: ValueAnimator? ->
            view.translationY=animation!!.animatedValue as Float
        }
        animator.duration=1000
        animator.start()
    }
    fun animateTranslateYDownUp(view: View){
        var animator = ValueAnimator.ofFloat(view.translationY,-50.0f,0.0f)
        animator.addUpdateListener { animation: ValueAnimator? ->
            view.translationY=animation!!.animatedValue as Float
        }
        animator.duration=500
        animator.start()
    }
    fun animateColor(view: ImageView,colorTo: Int){
        Log.i("datadata",view.toString()+" "+colorTo.toString());
        val colorAnimation =
            ValueAnimator.ofObject(ArgbEvaluator(),(view.background as ColorDrawable).color ,colorTo)
        colorAnimation.duration = 500 // milliseconds

        colorAnimation.addUpdateListener { animator ->
            Log.i("datadata",animator.animatedValue.toString());
            view.setColorFilter(animator.animatedValue as Int) }
        colorAnimation.start()
    }

    fun animateAlpha(view: View,valueTo:Float){
        var animator = ValueAnimator.ofFloat(view.alpha,valueTo)
        //view.visibility=View.VISIBLE
        animator.addUpdateListener { animation: ValueAnimator? ->

            view.alpha=animation!!.animatedValue.toString().toFloat()
        }
        animator.duration=500
        animator.start()
    }

    fun animateAlpha(view: View,valueTo:Float,duration:Long,delay:Long){
        var animator = ValueAnimator.ofFloat(view.alpha,valueTo)
        //view.visibility=View.VISIBLE
        animator.addUpdateListener { animation: ValueAnimator? ->

            view.alpha=animation!!.animatedValue.toString().toFloat()
        }
        animator.duration=duration
        animator.startDelay=delay
        animator.start()
    }
    fun animateScale(view: View,valueTo:Float,duration:Long,delay:Long){
        var animator = ValueAnimator.ofFloat(view.alpha,valueTo)
        //view.visibility=View.VISIBLE
        animator.addUpdateListener { animation: ValueAnimator? ->

            view.scaleX=animation!!.animatedValue.toString().toFloat()
            view.scaleY=animation!!.animatedValue.toString().toFloat()
        }
        animator.duration=duration
        animator.startDelay=delay
        animator.start()
    }
    fun isValidEmail(target: CharSequence?): Boolean {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()
    }

    fun imageToBase64(bitmap: Bitmap): String? {
        var bitmap = bitmap
        val maxWidth = 1400
        if (bitmap.width > maxWidth) {
            // Log.i("datadata_size",bitmap.getWidth()+" "+bitmap.getHeight());
            val new_width = maxWidth
            val new_height = (maxWidth.toDouble() / bitmap.width * bitmap.height).toInt()
            val matrix = Matrix()
            // RESIZE THE BIT MAP
            matrix.postScale(maxWidth.toFloat() / bitmap.width, maxWidth.toFloat() / bitmap.width)

            // "RECREATE" THE NEW BITMAP
            bitmap = Bitmap.createBitmap(
                    bitmap, 0, 0, bitmap.width, bitmap.height, matrix, false)
            //Log.i("datadata_size",bitmap.getWidth()+" "+bitmap.getHeight());
        }
        val baos = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, baos)
        val imageBytes = baos.toByteArray()
        val base64 = Base64.encodeToString(imageBytes, Base64.DEFAULT)
        var baseNoEnter = base64.replace("\n", "")
        baseNoEnter = baseNoEnter.replace(" ", "")
        return baseNoEnter
    }

    fun bitmapToFile(bitmap: Bitmap,activity: Activity):File?{
        var file=File(activity.cacheDir,"w8rFile.png")
        file.createNewFile()
        val bos = ByteArrayOutputStream()
        bitmap.compress(CompressFormat.PNG, 0 /*ignored for PNG*/, bos)
        val bitmapdata = bos.toByteArray()

        //Log.i("datadata_size",size.toString())
        val fos = FileOutputStream(file)
        fos.write(bitmapdata)
        fos.flush()
        fos.close()

        return file
    }
    fun toISoFormat(date: String?): String? {
        //String dtStart = "2022-06-01T11:25:02.172Z"
        val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH)
        try {
            val time = sdf.parse(date).toString().split(" ").toTypedArray()[3]
            val gmt = sdf.parse(date).toString().split(" ").toTypedArray()[4].replace("GMT", "")
            var offset = 0
            offset = if (gmt.startsWith("+")) {
                gmt.replace("+", "").split(":").toTypedArray()[0].toInt()
            } else {
                -gmt.replace("+", "").split(":").toTypedArray()[0].toInt()
            }
            var hour = time.split(":").toTypedArray()[0].toInt()
            hour += offset
            if (hour > 24) {
                hour = hour - 24
            } else if (hour < 0) {
                hour = 24 + hour
            }
            //Log.i("datadata_date","ISO 1801 date/time: "++" "+sdf.parse(date).toGMTString()); // all done
            return hour.toString() + ":" + time.split(":").toTypedArray()[1] + ":" + time.split(":")
                .toTypedArray()[2]
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return ""
    }


    fun getMonthString(index:Int):String{
        var month= arrayOf("Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec")

        return month[index]
    }

    fun cancelNotification(ctx: Context, notifyId: Int) {
        val ns: String = Context.NOTIFICATION_SERVICE
        val nMgr = ctx.getSystemService(ns) as NotificationManager
        nMgr.cancel(notifyId)
    }

    fun isOnline(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (connectivityManager != null) {
            val capabilities =
                connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
            if (capabilities != null) {
                if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                    return true
                }
            }
        }
        return false
    }
}