package com.app.weather.DashBoard.History

import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import app.w8r.Common.BaseActivity
import com.app.weather.DashBoard.DashBoard
import com.app.weather.R
import com.app.weather.databinding.AdapterHistoryItemBinding
import com.makeramen.roundedimageview.RoundedImageView
import com.squareup.picasso.Picasso
import java.io.File
import java.lang.Math.round
import java.util.*
import kotlin.math.roundToInt

open class HistoryAdapter: RecyclerView.Adapter<HistoryAdapter.Holder> {

    lateinit var baseActivity: BaseActivity
    lateinit var list: List<HistoryModel>
    lateinit var binding:AdapterHistoryItemBinding
    constructor(baseActivity: BaseActivity, linkedList: List<HistoryModel>) {

        this.baseActivity=baseActivity
        this.list = linkedList
    }
    val mRandom = Random()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        binding= AdapterHistoryItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false)


        return Holder(binding.root)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.onBind(list[position], position,baseActivity,binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Holder(itemView: View) :

        RecyclerView.ViewHolder(itemView) {


        fun onBind(model: HistoryModel, position: Int,baseActivity: BaseActivity,binding: AdapterHistoryItemBinding) {

            Picasso.get().load(File(model.image)).resize(100,100).into(binding.image)
            binding.tempTv.setText(model.temp)
            binding.locationTv.setText(model.location)
            binding.icon.setImageResource(model.icon)

            itemView.setOnClickListener({
                (baseActivity as DashBoard).openDialog(model.image)
            })
        }

        init {

        }

    }

}
