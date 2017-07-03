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
 * 基本语法学习-使用区间(range)
 */
class RangUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {

            scrollView {
            verticalLayout {

                textView("使用区间(range)") {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView("使用in运算符来检测某个数字是否在指定区间内：") {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val x = 10" +
                                "\r\n" +
                                "val y = 9" +
                                "\r\n" +
                                "if (x in 1..y+1) {" +
                                "\r\n" +
                                "   println(\"fits in range\")" +
                                "\r\n" +
                                "}"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

                textView("检测某个数字是否在指定区间外：") {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val list = listOf(\"a+\", \"b\", \"c\")" +
                                "\r\n\r\n" +
                                "if (-1 !in 0..list.lastIndex) {" +
                                "\r\n" +
                                "   println(\" -1 is out of rang \")" +
                                "\r\n" +
                                "if (list.size !in list.indices) {" +
                                "\r\n" +
                                "   println(\"list size is out of valid list indices range too\")"+
                                "\r\n"+
                                "}"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

                textView("区间迭代：") {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "for (x in 1..5)" +
                                "\r\n" +
                                "   print(x)" +
                                "\r\n" +
                                "}"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView("或数列迭代：") {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "for (x in 1..10 step 2) {" +
                                "\r\n" +
                                "   print(x)" +
                                "\r\n" +
                                "}" +
                        "for (x in 9 downTo 0 step 3) {"+
                                "\r\n"+
                                "   print(x)"+
                                "\r\n"+
                                "}"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

            }
            }
        }
    }
}

