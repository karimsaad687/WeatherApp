package app.w8r.CustomViews

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.view.Gravity
import androidx.appcompat.widget.AppCompatTextView
import com.app.weather.R

open class BaseTextView : AppCompatTextView {

    constructor(context: Context) : super(context) {

    }
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(context,attrs)
    }

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0) {
        init(context, attrs)
    }

    fun init(context: Context, attrs: AttributeSet){
        val ta:TypedArray=context.obtainStyledAttributes(attrs, R.styleable.MyElement,0,0)

        val word = ta.getString(R.styleable.MyElement_my_style)

        setStyle(word.toString())
    }
    fun setStyle(word:String){
        if (word.contains("text") || word.contains("bebas")) {
            text_style(word)
        } else if (word.contains("primaryButton")) {
            primaryButton()
        }
    }
    open fun setFont(word: String) {
        val font = context.getString(R.string.font_family)+word+".ttf"
        val face: Typeface
        ////Log.i("datadata", font+"");
        face = Typeface.createFromAsset(context.assets, font)
        setTypeface(face, Typeface.NORMAL)
    }
    open fun text_style(word: String) {
        if (word.contains("med")) {
            setFont("Medium")
        }else if (word.contains("bold")) {
            setFont("Bold")
        }else if (word.contains("med")) {
            setFont("Medium")
        } else if (word.contains("semi")) {
            setFont("SemiBold")
        } else if (word.contains("reg")) {
            setFont("Regular")
        } else if (word.contains("black")) {
            setFont("Black")
        }
        setTextSize(
            TypedValue.COMPLEX_UNIT_DIP,
            word.split("_".toRegex()).toTypedArray()[1].toInt().toFloat()
        )
        if (word.split("_".toRegex()).toTypedArray().size == 4) {
            if (word.split("_".toRegex()).toTypedArray()[3] == "white") {
                setTextColor(context.resources.getColor(R.color.white))
            } else if (word.split("_".toRegex()).toTypedArray()[3] == "primary") {
                setTextColor(context.resources.getColor(R.color.colorPrimary))
            }else if (word.split("_".toRegex()).toTypedArray()[3] == "red") {
                setTextColor(context.resources.getColor(R.color.red))
            }
        }
    }

    fun primaryButton(){
        setFont("SemiBold")
        setTextSize(14.0f);
        setTextColor(context.resources.getColor(R.color.colorPrimary));
        gravity=Gravity.CENTER
        setBackgroundResource(R.drawable.custom_primary_button)
    }

}