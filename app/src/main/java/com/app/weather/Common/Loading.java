package com.app.weather.Common;

import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;

import com.app.weather.CustomViews.DownLoadCircle;
import com.app.weather.R;

import app.w8r.CustomViews.BaseTextView;


public class Loading extends DialogFragment {

    DownLoadCircle downLoadCircle;
    BaseTextView percentage_text;
    ProgressBar progressBar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.loading, container, false);
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        //getDialog().setCancelable(false);
        setCancelable(false);


        percentage_text= view.findViewById(R.id.percentage_text);
        progressBar= view.findViewById(R.id.progress_bar);



        return view;
    }




    @Override
    public void onStart() {
        super.onStart();
        getDialog().getWindow().setGravity(Gravity.CENTER);
        getDialog().getWindow().setLayout((int)(60*getActivity().getResources().getDisplayMetrics().density), (int)(60*getActivity().getResources().getDisplayMetrics().density));

    }
    @Override
    public void onActivityCreated(Bundle arg0) {
        super.onActivityCreated(arg0);
        getDialog().getWindow()
                .getAttributes().windowAnimations = R.style.DialogAnimation;
    }

}




