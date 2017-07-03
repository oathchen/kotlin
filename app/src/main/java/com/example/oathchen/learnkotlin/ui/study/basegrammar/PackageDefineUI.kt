package com.example.oathchen.learnkotlin.ui.study.basegrammar

import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.learnkotlin.ui.base.BaseUI
import org.jetbrains.anko.*


/**
 * Created by oathchen on 2017/6/20.
 */

/**
 * 基本语法学习-定义包
 */
class PackageDefineUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("定义包"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView("包的声明应处于源文件顶部:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView("package my.demo" +"\r\n\r\n" + "import java.util.*"){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }


            }
        }
    }
}


