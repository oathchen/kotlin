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
 * 基本语法学习-使用for循环
 */
class ForLoopUI : BaseUI() {


    override fun afterCreateView(view: View) {
        super.afterCreateView(view)
        testForLoop()
    }

    fun testForLoop(){
        val items = listOf("apple","banana","kiwi")
        for(index in items.indices){
            println("item at $index is ${items[index]}")
            println("item.indices is:" + items.indices)
        }
    }


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("使用for循环"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }

                textView(
                        "val items = listOf(\"apple\", \"banana\", \"kiwi\")" +
                        "\r\n" +
                        "for(item in items) {"+
                        "\r\n"+
                        "   println(item)"+
                        "\r\n"+
                        "}"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }

                textView("或者"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val items = listOf(\"apple\", \"banana\", \"kiwi\")" +
                        "\r\n" +
                        "for(index in items.indices) {"+
                        "\r\n"+
                        "   println(\"item at \$index is \${(items[index]}\")"+
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

