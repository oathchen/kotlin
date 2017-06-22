package com.example.oathchen.testkotlin.ui.study.basegrammar

import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.testkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/20.
 */

/**
 * 基本语法学习-定义局部变量
 */
class LocalVariableUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("定义局部变量"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView("一次赋值(只读)的局部变量:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView("val a: Int = 1 //立即赋值"+
                        "\r\n\r\n" +
                        "val b =2 //自动推断出'Int'类型"+
                        "\r\n\r\n" +
                        "val c: Int //如果没有初始类型不能省略"+
                        "\r\n\r\n" +
                        "c=3 //明确赋值"
                ){
                    backgroundColor = Color.LTGRAY
                    leftPadding = 20
                }.lparams{
                    width = matchParent
                    height = 200
                }

                textView("可变变量:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView("var x = 5 //自动推断出'Int'类型"+
                        "\r\n\r\n" +
                        "x +=1"
                ){
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