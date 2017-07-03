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
 * 基本语法学习-注释
 */
class AnnotationUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("注释"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView("正如Java和JavaScript,Kotlin支持行注释及块注释。"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "//这是一个行注释" +
                        "\r\n\r\n" +
                        "/* 这是一个多行的" +
                        "\r\n"+
                        "块注释。 */"
                ){
                    backgroundColor = Color.LTGRAY
                    padding =20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }


            }
        }
    }
}