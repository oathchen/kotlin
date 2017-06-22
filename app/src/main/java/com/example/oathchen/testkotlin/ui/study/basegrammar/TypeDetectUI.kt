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
 * 基本语法学习-使用类型检测及自动类型转换
 */
class TypeDetectUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            scrollView {
                verticalLayout {

                    textView("使用类型检测及自动类型转换") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                    }
                    textView(
                            "is运算符检测一个表达式是否某类型的一个实例。如果以恶不可变的局部变量或属性已经判断出为某类型，那么检" +
                                    "\r\n" +
                                    "测后的分支中可以直接当作该类型使用，无需显式转换："
                    ) {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView("fun getStringLength(obj : Any): Int? {" +
                            "\r\n" +
                            "   if(obj is String){" +
                            "\r\n" +
                            "       // 'obj'在该条件分支内自动转换成'String'" +
                            "\r\n" +
                            "       return obj.length" +
                            "\r\n\r\n" +
                            "   // 在离开类型检测分支后，'obj' 仍然是 'Any' 类型"+
                            "\r\n"+
                            "   return null"+
                            "\r\n"+
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

                    textView("fun getStringLength(obj: Any): Int?{" +
                            "\r\n" +
                            "   if(obj is String) return null" +
                            "\r\n\r\n" +
                            "       // 'obj'在这一分支自动转换为'String'" +
                            "\r\n" +
                            "       return obj.length" +
                            "\r\n"+
                            "   }"
                    ) {
                        backgroundColor = Color.LTGRAY
                        padding = 20
                    }.lparams {
                        width = matchParent
                        height = wrapContent
                    }

                    textView("甚至") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView("fun getStringLength(obj: Any): Int?{" +
                            "\r\n" +
                            "   //'obj'在'&&'右边自动转换成'String'类型" +
                            "\r\n\r\n" +
                            "   if(obj is String && obj.length > 0){" +
                            "\r\n" +
                            "       return obj.length" +
                            "\r\n"+
                            "   }"+
                            "\r\n"+
                            "   return null"+
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