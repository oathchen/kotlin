package com.example.oathchen.testkotlin.ui.study.basegrammar

import android.content.Context
import android.graphics.Color
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.oathchen.testkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/20.
 */

/**
 * 基本语法学习-定义函数
 */
class FunctionUI : BaseUI() {


    lateinit var et_a: EditText
    lateinit var et_b: EditText
    lateinit var view_sum:TextView
    override fun afterCreateView(view: View) {
        super.afterCreateView(view)

        et_a.addTextChangedListener(MyTextWatcher(et_b,view_sum))

        et_b.addTextChangedListener(MyTextWatcher(et_a,view_sum))
    }

    class MyTextWatcher(editText: EditText,textView:TextView) : TextWatcher{

        var editText:EditText = editText
        var text:String ?= null;
        var textView:TextView = textView
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            text = editText.text.toString();
            if((text != null&&text!= "" )&& (s != null&& s!= "")){
                var intOther:Long =  text!!.toLong()
                var intNow:Long = s.toString().toLong()
                textView.text = printSum(intOther,intNow)
            }

        }

        fun sum(a:Long,b:Long):Long{
            return a + b
        }

        fun printSum(a:Long,b:Long):String{
            return "sum of $a and $b is ${a + b}"
        }

    }
    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {

            scrollView {
                verticalLayout {

                    textView("定义函数") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                    }
                    textView("带有两个Int参数。返回Int的函数：") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView(
                            "fun sum(a:Int,b: Int){" +
                                    "\r\n" +
                                    "   return a+b" +
                                    "\r\n" +
                                    "}"
                    ) {
                        backgroundColor = Color.LTGRAY
                        padding = 20
                    }.lparams {
                        width = matchParent
                        height = wrapContent
                    }

                    textView("将表达式作为函数体、返回类型自动推断的函数:") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView(
                            "fun sum(a:Int,b: Int) = a + b"
                    ) {
                        backgroundColor = Color.LTGRAY
                        padding = 20
                    }.lparams {
                        width = matchParent
                        height = wrapContent
                    }

                    textView("函数返回无意义的值:") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView(
                            "fun printSum(a:Int,b: Int):Unit{" +
                                    "\r\n" +
                                    "   println(\"sum of \$a and \$b is \${a+b}\")" +
                                    "\r\n" +
                                    "}"
                    ) {
                        backgroundColor = Color.LTGRAY
                        padding = 20
                    }.lparams {
                        width = matchParent
                        height = wrapContent
                    }

                    textView("Unit返回类型可以省略:") {

                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    textView(
                            "fun printSum(a:Int,b: Int){" +
                                    "\r\n" +
                                    "   println(\"sum of \$a and \$b is \${a+b}\")" +
                                    "\r\n" +
                                    "}"
                    ) {
                        backgroundColor = Color.LTGRAY
                        padding = 20
                    }.lparams {
                        width = matchParent
                        height = wrapContent
                    }

                    textView("测试方法：") {

                        isFocusable= true
                        isFocusableInTouchMode= true
                    }.lparams {
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                    et_a = editText("3") {
                        hint = "请输入a"
                        inputType = InputType.TYPE_CLASS_NUMBER
                    }

                    et_b = editText("4") {
                        hint = "请输入b"
                        inputType = InputType.TYPE_CLASS_NUMBER
                    }

                    view_sum = textView("输入数字将显示加法结果") {

                    }.lparams{
                        leftMargin = 20
                        topMargin = 20
                        bottomMargin = 20
                    }

                }
            }
        }
    }


}
