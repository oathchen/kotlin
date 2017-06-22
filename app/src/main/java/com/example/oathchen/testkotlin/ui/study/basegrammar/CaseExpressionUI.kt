package com.example.oathchen.testkotlin.ui.study.basegrammar

import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.testkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/21.
 */
/**
 * 基本语法学习-使用条件表达式
 */
class CaseExpressionUI : BaseUI() {
    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("使用条件表达式"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView("fun maxOf(a:Int, b:Int): Int{" +
                         "\r\n" +
                         "  if(a > b){"+
                         "\r\n"+
                         "      return a"+
                         "\r\n"+
                         "  } else {"+
                         "\r\n"+
                         "      return b"+
                         "\r\n"+
                         "  }"+
                         "\r\n"+
                        "}"
                        )
                        {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }


                textView("使用if作为表达式:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fun maxOf(a:Int,b:Int) = if(a>b) a else b"
                )
                {
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