package com.app.weather.CustomViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import com.app.weather.R;


/**
 * Created by karim on 11/28/18.
 */

public class DownLoadCircle extends View {
    Paint grey,green,background;
    float percentage=0f;
    public DownLoadCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs,context);
    }

    public DownLoadCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs,context);
    }
    public void init(AttributeSet attrs, Context context){
        grey=new Paint();
        grey.setColor(Color.parseColor("#d0d0d0"));
        grey.setAntiAlias(true);
        grey.setStrokeWidth(context.getResources().getDisplayMetrics().density*6);


        background=new Paint();
        background.setColor(Color.parseColor("#000000"));
        background.setAntiAlias(true);
        background.setStrokeWidth(context.getResources().getDisplayMetrics().density*6);

        green=new Paint();
        green.setColor(context.getResources().getColor(R.color.colorPrimary));
        green.setAntiAlias(true);
        green.setStrokeWidth(context.getResources().getDisplayMetrics().density*6);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.MyElement, 0, 0);
        try {
            int color = ta.getColor(R.styleable.MyElement_circle_inner_color, Color.parseColor("#000000"));
            background.setColor(color);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ta.recycle();
        }
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/2,grey);
        canvas.drawLine(0,getHeight()-8,getWidth(),getHeight()-8,grey);
        canvas.drawLine(0,getHeight()-8,getWidth()*percentage,getHeight()-8,green);
        Log.i("datdata_progress",percentage+"");
        //canvas.drawArc(0,0,getWidth(),getHeight(),0,360*percentage,true,green);
        //canvas.drawCircle(getWidth()/2,getHeight()/2,(getWidth()-background.getStrokeWidth())/2,background);
    }
}
