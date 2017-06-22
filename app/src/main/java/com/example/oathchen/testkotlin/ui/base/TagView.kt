package com.example.oathchen.testkotlin.ui.base

import android.content.Context
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import com.example.oathchen.testkotlin.R
import org.jetbrains.anko.custom.ankoView

/**
 * Created by oathchen on 2017/6/19.
 */
open class TagView(context:Context):ViewGroup(context){
    val TAG:String = "TagView"
    var mBackgroundDawable: Drawable?= null

    constructor(context:Context,attrs: AttributeSet):this(context){
        val ta : TypedArray = context!!.obtainStyledAttributes(attrs, R.styleable.TagView)
        mBackgroundDawable = ta.getDrawable(R.styleable.TagView_android_background)
        ta.recycle()

        if(mBackgroundDawable != null){
            setBackgroundDrawable(mBackgroundDawable)
        }
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        return MarginLayoutParams(context,attrs)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val suggestWidth = MeasureSpec.getSize(widthMeasureSpec)

        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        val suggestHeight = MeasureSpec.getSize(heightMeasureSpec)

        //测量子View尺寸信息
        measureChildren(widthMeasureSpec,heightMeasureSpec)

        /**
         * 主要处理width和height AT_MOST测量模式下的情况
         * 在width方面，TagView中的子元素要求出所有行中的宽度最大的一行，并且这个数值
         * 不能大于parent给出的建议宽度
         */
        var cWidth:Int
        var cHeight:Int
        var lineWidth : Int = paddingLeft + paddingRight
        var lineMaxWidth : Int = lineWidth
        var lineHeight : Int = paddingBottom  + paddingTop
        var childPara : MarginLayoutParams
        var resultW : Int = suggestWidth
        var resultH : Int = suggestHeight

        for(index in 0..childCount - 1){
            val view = getChildAt(index)
            childPara = view.layoutParams as MarginLayoutParams

            //子view的实际宽高包含它们的margin
            cWidth = view.measuredWidth + childPara.leftMargin + childPara.rightMargin
            cHeight = view.measuredHeight + childPara.topMargin + childPara.bottomMargin

            if(widthMode == MeasureSpec.AT_MOST){
                //如果此次排列后，这一行的宽度超过parent提供的size就表明要换行了
                if(lineWidth + cWidth > suggestWidth){
                    //换行后需要重置lineWidth
                    lineWidth = paddingLeft + paddingRight + cWidth
                    lineHeight += cHeight
                }else {
                    //lineWidth对于子View宽度进行累加
                    lineWidth += cWidth
                }

                if(lineWidth > lineMaxWidth){
                    //更新最大的行宽数值
                    lineMaxWidth = lineWidth
                }

            }
        }

        if(widthMode == MeasureSpec.AT_MOST){
            resultW = lineMaxWidth
        }

        if(heightMode == MeasureSpec.AT_MOST){
            resultH = lineHeight
            if(resultH > suggestHeight){
                resultH = suggestHeight
            }
        }

        setMeasuredDimension(resultW,resultH)
        Log.d(TAG,"onMeasure w:"+ resultW + "h:" + resultH)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        Log.d(TAG,"onLayout")
        var left : Int =  paddingLeft
        var right : Int = width - paddingRight
        var top : Int = paddingTop
        val bottom : Int = height - paddingBottom
        var lp : MarginLayoutParams
        var cw : Int
        var ch : Int

        for(index in 0..childCount - 1){
            var view = getChildAt(index)
            lp = view.layoutParams as MarginLayoutParams
            cw = view.measuredWidth + lp.leftMargin + lp.rightMargin
            ch = view .measuredHeight + lp.topMargin + lp.bottomMargin

            //该换行了
            if(left + cw > right){
                left = paddingLeft
                top +=ch
            }
            //如果高度超出了范围就退出绘制
            if(top>= bottom){
                break
            }

            view.layout(left + lp.leftMargin,top+lp.topMargin,left + cw,top + ch)
            left += cw
        }
    }




}

val VERTICAL_LAYOUT_FACTORY = { ctx: Context ->
    val view = _TagView(ctx)
    view
}
inline fun ViewManager.tagView(theme: Int = 0, init: _TagView.() -> Unit): TagView {
    return ankoView(VERTICAL_LAYOUT_FACTORY, theme, init)
}

open class _TagView(ctx: Context) : TagView(ctx) {

    val defaultInit: Any.() -> Unit = {}

    fun <T : View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: ViewGroup.MarginLayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = ViewGroup.MarginLayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }
}