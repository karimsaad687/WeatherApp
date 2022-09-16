package com.app.weather.FullImageDialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment
import com.app.weather.R
import com.app.weather.databinding.DialogFullImageBinding

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
}