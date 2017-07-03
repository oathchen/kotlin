package com.example.oathchen.learnkotlin
import android.content.Context
import android.view.View
import android.widget.ListView
import com.example.oathchen.learnkotlin.R
import com.example.oathchen.learnkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/5/23.
 */
class TestUI: BaseUI() {

    lateinit  var testListView: ListView;

    fun initAdapter(){
        testListView.adapter;
    }

    override fun createView(ui: AnkoContext<Context>): View {
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

                testListView = listView {

                }.lparams {
                    height = matchParent
                    width = matchParent
                }
            }

        }
    }
}

