package com.example.oathchen.testkotlin.ui.study.basegrammar

import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.testkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/22.
 */
/**
 * 基本语法学习-使用while循环
 */
class WhileLoopUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("使用while循环"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }

                textView(
                        "val items = listOf(\"apple\",\"banana\",\"kiwi\")" +
                        "\r\n" +
                        "var index = 0"+
                        "\r\n"+
                        "while(index < items.size) {"+
                        "\r\n"+
                        "   println(\"item at \$index is \${ites[inex]}\")"+
                        "\r\n"+
                        "   index++"+
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

