package app.w8r.CustomViews

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Rect
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.AppCompatEditText
import com.app.weather.R

open class BaseEditTextView  @JvmOverloads constructor(
context: Context,
attrs: AttributeSet? = null,
defStyleAttr: Int = android.R.attr.editTextStyle //Otherwise, some attributes may not be used
) : AppCompatEditText(context, attrs, defStyleAttr) {


    var type=0;


    init {
        init(context,attrs!!)
    }

    fun init(context: Context, attrs: AttributeSet){
        setStyle()

    }
    fun setStyle(){
        setFont("Regular")
        setTextSize(14.0f);
        setTextColor(context.resources.getColor(R.color.white))
        setHintTextColor(context.resources.getColor(R.color.white_alpha))
        background=null
    }
    open fun setFont(word: String) {
        val font = context.getString(R.string.font_family)+word+".ttf"
        val face: Typeface
        ////Log.i("datadata", font+"");
        face = Typeface.createFromAsset(context.assets, font)
        setTypeface(face, Typeface.NORMAL)
    }



//    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
//        super.onFocusChanged(focused, direction, previouslyFocusedRect)
//        if(type==2){
//            setBackgroundResource(if(focused) R.drawable.custom_edit_text else R.drawable.custom_edit_text_stroke)
//        }
//    }
}