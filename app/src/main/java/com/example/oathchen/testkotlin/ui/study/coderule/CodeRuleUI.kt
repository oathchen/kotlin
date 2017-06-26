package com.example.oathchen.testkotlin.ui.study.coderule

import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.testkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/23.
 */
/**
 * 编码规范
 */
class CodeRuleUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {

            scrollView {
            verticalLayout {

                textView("编码规范"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView(
                        "此页面包含当前kotlin语言的编码风格"+
                                "\r\n\r\n"+
                                "命名风格"+
                                "\r\n\r\n"+
                                "如果拿不准的时候，默认使用Java的编码规范,比如:"+
                                "\r\n\r\n"+
                                "--使用驼峰法命名(并避免命名含有下划线)"+
                                "\r\n"+
                                "--类型名以大写字母开头"+
                                "\r\n"+
                                "--方法和属性以小写字母开头"+
                                "\r\n"+
                                "--使用4个空格缩进"+
                                "\r\n"+
                                "公有函数应撰写函数文档，这样这些文档才会出现在Kotlin Doc中"+
                                "\r\n\r\n"+
                                "冒号"+
                                "\r\n"+
                                "类型和超类型之间的冒号前要有一个空格，而实例和类型之间的冒号前不要有空格:"
                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "interface Foo<out T : Any> : Bar {"
                                +"\r\n" +
                                "fun foo(a : Int): T"+
                                "\r\n"+
                                "}"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "Lambda表达式"+
                                "\r\n"+
                                "在lambda表达式中，大括号左右要加空格，分隔参数与代码体的箭头左右也要加空格。lambda表达应尽可能不要写在圆括号中"
                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "list.filter{ it > 10}.map{ element -> element * 2}"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "在非嵌套的短lambda表达式中，最好使用约定俗成的默认参数it来替代显式声明参数名。在嵌套的有参数的"+
                                "\r\n"+
                                "lambda表达式中，参数应该总是显式声明。"+
                                "\r\n\r\n"+
                                "类头格式化"+
                                "\r\n"+
                                "有少数几个参数的类可以写成一行:"
                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                   "class Person(id: Int, name: String)"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "具有较长类头的类应该格式化，以使每个主构造函数参数位于带有缩进的单独一行中。此外，右括号应该另起一"+
                                "\r\n"+
                                "行。如果我们使用继承，那么超类构造函数调用或者实现接口列表应位于与括号相同的行上:"
                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                       "class Person("+
                               "\r\n"+
                               "    id: Int,"+
                               "\r\n"+
                               "    name String,"+
                                "\r\n"+
                               "    surname: String"+
                                "\r\n"+
                               "): Human(id, name){"+
                               "\r\n"+
                               "    // ..."+
                               "\r\n"+
                               "}"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }

                textView(
                    "对于多个接口，应首先放置超类构造函数调用，然后每个接口应位于不同的行中:"

                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                    "class Person("+
                            "\r\n"+
                            "   id: Int,"+
                            "\r\n"+
                            "   name: String,"+
                            "\r\n"+
                            "   surname: String"+
                            "\r\n"+
                            "): Human(id , name),"+
                            "\r\n"+
                            "   KotlinMarker{"+
                            "\r\n"+
                            "   // ..."+
                            "\r\n"+
                            "}"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "构造函数参数可以使用常规缩进或连续缩进(双倍的常规缩进)。"+
                                "\r\n\r\n"+
                                "Unit"+
                                "\r\n"+
                                "如果函数返回Unit类型，该返回类型应该省略:"

                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                       "fun foo(){ //省略了\":Unit\""+
                               "\r\n\r\n"+
                               "}"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "函数还是属性"+
                                "\r\n\r\n"+
                                "很多场合无参的函数可与只读属性互换。尽量语义相近，也有一些取舍的风格约定。"+
                                "\r\n"+
                                "底层算法优先使用属性而不是函数:"+
                                "\r\n\r\n"+
                                "--不会抛异常"+
                                "\r\n"+
                                "--o(1)复杂度"+
                                "\r\n"+
                                "--计算廉价(或缓存第一次运行)"+
                                "\r\n"+
                                "--不同调用返回相同结果"
                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }


            }
        }
    }
    }
}

