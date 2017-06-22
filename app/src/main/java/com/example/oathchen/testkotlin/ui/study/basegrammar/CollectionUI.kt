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
 * 基本语法学习-使用集合
 */
class CollectionUI : BaseUI() {


    override fun afterCreateView(view: View) {
        super.afterCreateView(view)
        TestCollection()
    }

    fun TestCollection(){
        var fruits = listOf("apple","avocado","bananas","orange")

        fruits
        .filter{it.startsWith("a")}
        .sortedBy{it}
        .map{it.toUpperCase()}
        .forEach{ println(it)}
    }

    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("使用集合"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView("对集合进行迭代:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "for (item in items) {" +
                                "\r\n" +
                                "println(item)"+
                                "\r\n"+
                                "}"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }

                textView("使用in运算符来判断集合内是否包含某实例:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "when {" +
                                "\r\n" +
                                "   \"orage\" in items -> println(\"juicy\")"+
                                "\r\n"+
                                "\"apple\" in items -> println(\"apple is fine too\")"+
                                "\r\n"+
                                "}"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }

                textView("使用lambda表达式来过滤(filter)和映射(map)集合:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fruits" +
                                "\r\n" +
                                ".filter{ it.startsWith(\"a\")}"+
                                "\r\n"+
                                ".sortedBy { it }"+
                                "\r\n"+
                                ".map { it.toUpperCase() }"+
                                "\r\n"+
                                ".forEach{ println(it) }"
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

