package com.example.oathchen.learnkotlin.ui.study.`package`

import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.learnkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/30.
 */
/**
 * 包
 */
class PackageUI : BaseUI() {

    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

                textView("包"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView("源文件通常以包声明开头:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "package foo.bar" +
                                "\r\n" +
                                "fun baz(){}"+
                                "\r\n"+
                                "class Goo{}"+
                                "\r\n"+
                                "// ..."
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }



                textView("源文件所有内容(无论是类还是函数)都包含在声明的包内。所以上例中baz()的全名是foo.bar.baz、Goo的全名是foo.bar.Goo。" +
                        "\r\n"+
                        "如果没有指明包，该文件的内容属于无名字的默认包。"+
                        "\r\n\r\n"+
                        "默认导入"+
                        "\r\n\r\n"+
                        "有多个包会默认导入到每个Kotlin文件中:"+
                        "\r\n"+
                        "--kotlin.*"+
                        "\r\n"+
                        "--kotlin.annotation.*"+
                        "\r\n"+
                        "--kotlin.collections.*"+
                        "\r\n"+
                        "--kotlin.comparisions.*(自1.1起)"+
                        "\r\n"+
                        "--kotlin.io.*"+
                        "\r\n"+
                        "--kotlin.ranges.*"+
                        "\r\n"+
                        "--kotlin.sequences.*"+
                        "\r\n"+
                        "--kotlin.text.*"+
                        "\r\n\r\n"+
                        "根据目标平台还会导入额外的包:"+
                        "\r\n\r\n"+
                        "--JVM:"+
                        "\r\n"+
                        "   --java.lang.*"+
                        "\r\n"+
                        "   --kotlin.jvm.*"+
                        "\r\n\r\n"+
                        "--JS:"+
                        "\r\n"+
                        "   --kotlin.js.*"+
                        "\r\n\r\n"+
                        "导入"+
                        "\r\n"+
                        "除了默认导入之外，每个文件可以包含它自己的导入命令。导入语法在语法中讲述。"+
                        "\r\n"+
                        "可以导入一个单独的名字,如:"
                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "import foo.Bar//   现在 Bar 可以不用限定符号访问"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "也可以导入一个作用域下的所有内容(包、类、对象等):"
                ){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "import foo.* //\"foo\"中的一切都可访问"
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }

                textView("如果出现名字冲突，可以使用as关键字在本地重命名冲突项来消歧义:"){

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "import foo.Bar //Bar 可访问"+
                                "\r\n"+
                                "import bar.Bar as bBar //bBar 代表\"bar.Bar\""
                ){
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "关键字import并不仅限于导入类;也可用它来导入其他声明:"+
                                "\r\n"+
                                "--顶层函数及属性"+
                                "\r\n"+
                                "--在对象声明中声明的函数和属性"+
                                "\r\n"+
                                "--枚举常量"+
                                "\r\n\r\n"+
                                "与Java不同，Kotlin没有单独的\"import static\"语法；所有这些声明都用import关键字导入。"+
                                "\r\n\r\n"+
                                "顶层声明的不可见性"+
                                "\r\n"+
                                "如果顶层声明是private的，它是声明它的文件所私有的(参见可见性修饰符)。"
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