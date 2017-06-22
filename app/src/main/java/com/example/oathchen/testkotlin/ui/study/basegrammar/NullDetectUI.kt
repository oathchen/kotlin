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
 * 基本语法学习-使用可空值及null检测
 */
class NullDetectUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {

            scrollView {
                verticalLayout {

                    textView("使用可空值及null检测") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                    }
                    textView(
                            "当某个变量的值可以为null的时候，必须在声明的类型后面添加?来标识该引用可为空。" +
                                    "\r\n\r\n" +
                                    "如果str的内容不是数字返回的null:"
                    ) {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView(
                            "fun parseInt(str:String):Int?{" +
                                    "\r\n" +
                                    "   //" +
                                    "\r\n" +
                                    "}"
                    ) {
                        backgroundColor = Color.LTGRAY
                        padding = 20
                    }.lparams {
                        width = matchParent
                        height = wrapContent
                    }

                    textView("使用返回可空值的函数:") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView(
                            "fun printProduct(arg1:String),arg2:String){" +
                                    "\r\n" +
                                    "   val x = parseInt(arg1)" +
                                    "\r\n" +
                                    "   val y = parseInt(arg2)" +
                                    "\r\n\r\n" +
                                    "   //直接使用‘x * y’可能会报错，因为他们可能为null" +
                                    "\r\n" +
                                    "   if(x != null && y != null){" +
                                    "\r\n" +
                                    "       //在空检测后。x和y会自动转换为非空值(non-nullable)" +
                                    "\r\n" +
                                    "       println(x * y)" +
                                    "\r\n" +
                                    "}" +
                                    "   else {" +
                                    "\r\n"+
                                    "       println(\"either '\$arg1' or '\$arg2' is not a number\")" +
                                    "\r\n" +
                                    "   }" +
                                    "\r\n" +
                                    "}"
                    ) {
                        backgroundColor = Color.LTGRAY
                        padding = 20
                    }.lparams {
                        width = matchParent
                        height = wrapContent
                    }

                    textView("或者") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView(
                            "//" +
                                    "\r\n" +
                                    "if(x == null){" +
                                    "\r\n" +
                                    "   println(\"Wrong number format in arg1: '\${arg1}'\")" +
                                    "\r\n" +
                                    "   return" +
                                    "\r\n" +
                                    "}" +
                                    "\r\n" +
                                    "if(y == null){" +
                                    "\r\n" +
                                    "   println(\"Wrong number format in arg2: '\${arg2}'\")" +
                                    "\r\n" +
                                    "   return" +
                                    "\r\n" +
                                    "}" +
                                    "\r\n\r\n" +
                                    "// 在空检测后，x和y会自动转换为非空值" +
                                    "\r\n" +
                                    "println(x * y)"
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
