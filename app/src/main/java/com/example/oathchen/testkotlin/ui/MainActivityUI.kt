package com.example.oathchen.testkotlin.ui

import android.view.View
import com.example.oathchen.testkotlin.MainActivity
import com.example.oathchen.testkotlin.R
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/5/23.
 */
class MainActivityUI: AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View {
        return with(ui){
            verticalLayout {
                val textView = textView("我是一个textView"){
                    textSize  = sp(17).toFloat()
                    textColor = context.resources.getColor(R.color.colorAccent)
                }.lparams{
                    margin = dip(10)
                    height = dip(40)
                    width  = matchParent
                }
                val name = editText("EditText")
                button("Button"){
                    onClick{
                        toast("MainActivityUI,${name.text}!")
                    }
                }
            }
        }
    }
}

