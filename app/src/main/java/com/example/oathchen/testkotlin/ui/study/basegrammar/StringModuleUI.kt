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
 * 基本语法学习-使用字符串模板
 */
class StringModuleUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("使用字符串模板"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }

                textView("var a = 1"
                        +"\r\n" +
                        "//模板中的简单名称:"+
                        "\r\n"+
                        "val s1 = \"a is \$a\""+
                        "\r\n\r\n"+
                        "a = 2" +
                        "\r\n" +
                        "//模板中的任意表达式:"+
                        "\r\n"+
                        "val s2 = \"\${s1.replace(\"is\",\"was\")},but now is \$a\""
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