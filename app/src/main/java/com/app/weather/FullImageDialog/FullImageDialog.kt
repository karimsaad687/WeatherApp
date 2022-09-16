package com.app.weather.FullImageDialog

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.app.weather.R
import com.app.weather.databinding.DialogFullImageBinding
import java.io.File

class FullImageDialog : DialogFragment() {

    lateinit var binding:DialogFullImageBinding
    lateinit var image:String
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DialogFullImageBinding.inflate(inflater)
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        binding.image.setImageURI(Uri.parse(image))
        binding.closeIm.setOnClickListener({
            dismiss()
        })

        binding.facebookBtn.setOnClickListener({
            shareImage(image,"com.facebook.katana","Facebook")
        })
        binding.twitterBtn.setOnClickListener({
            shareImage(image,"com.twitter.android","Twitter")
        })
        return binding.root
    }

    fun addImage(image:String){
        this.image=image
    }

    override fun onStart() {
        super.onStart()
        dialog!!.window!!.setGravity(Gravity.CENTER)
        dialog!!.window!!
            .setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
    }

    override fun onActivityCreated(arg0: Bundle?) {
        super.onActivityCreated(arg0)
        dialog!!.window!!.getAttributes().windowAnimations = R.style.DialogAnimation
    }

    //share image on facebook
    open fun shareImage(path:String, packageName: String?,type:String) {
        try {
            val intent = Intent(Intent.ACTION_SEND)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(File(path)))
            intent.type = "image/*"
            intent.setPackage(packageName)
            startActivity(Intent.createChooser(intent, "Share image on "+type))
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(activity, "Error while sharing Image on "+type, Toast.LENGTH_SHORT).show()
        }
    }
}