package com.example.oathchen.testkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.oathchen.testkotlin.ui.LoginUI
import com.example.oathchen.testkotlin.ui.MainActivityUI
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        var testUtil = TestUtil(this)

//        testUtil.testAdd(30,40)
//        testUtil.testMax(7,6)

        LoginUI().setContentView(this@MainActivity)

//        alert("我是dialog"){
//            yesButton{
//                toast("yes")
//            }
//            noButton{
//                toast("no")
//            }
//        }.show()


    }

    inner class UI:AnkoComponent<MainActivity>{
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
                            toast("Hello,${name.text}!")
                        }
                    }
                }
            }
        }
    }


}


