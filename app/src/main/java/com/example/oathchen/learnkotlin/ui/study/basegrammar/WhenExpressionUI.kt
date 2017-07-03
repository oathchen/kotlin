package com.example.oathchen.learnkotlin.ui.study.basegrammar

import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.learnkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/22.
 */
/**
 * 基本语法学习-使用when表达式
 */
class WhenExpressionUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("使用when表达式"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView(
                        "fun describe(obj : Any): String =" +
                        "\r\n" +
                        "when(obj){"+
                        "\r\n"+
                        "   i                     ->\"One\""+
                        "\r\n"+
                        "   \"Hello\"           ->\"Greeting\""+
                        "\r\n"+
                        "   is Long         ->\"Long\""+
                        "\r\n"+
                        "   !is String      ->\"Not a string\""+
                        "\r\n"+
                        "   else               ->\"unknown\""+
                        "\r\n"+
                        "}"
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

