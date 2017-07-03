package com.example.oathchen.learnkotlin.ui.study.basetype
import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.learnkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/23.
 */
/**
 * 基本类型
 */
class BaseTypeUI : BaseUI() {


    override fun afterCreateView(view: View) {
        super.afterCreateView(view)

        val asc = Array(5,{i -> (i * i).toString()})

        val text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()

        println(text)
    }

    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {

            scrollView {
            verticalLayout {

                textView("基本类型") {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView(
                        "在Kotlin中，所有东西都是对象，在这个意义上讲所以我们可以在任何变量上调用成员函数和属性。有些类型是内" +
                                "置的，因为他们的实现是优化过的。但是用户看起来他们就像普通的类。本节我们会描述大多数这些类型：数字、" +
                                "字符、布尔和数组。" +
                                "\r\n\r\n" +
                                "数字" +
                                "\r\n\r\n" +
                                "Kotlin处理数字在某种程度上接近Java,但是并不完全相同。例如，对于数字没有隐式拓宽转换(如java中int可以" +
                                "隐式转换为long--译者注),另外有些情况的字面值略有不同。" +
                                "\r\n\r\n" +
                                "Kotlin提供了如下的内置类型来表示数字(与java很相近):" +
                                "\r\n\r\n" +
                                "Type   Bit width" +
                                "\r\n" +
                                "Double 64" +
                                "\r\n" +
                                "Float  32" +
                                "\r\n" +
                                "Long   64" +
                                "\r\n" +
                                "Int    32" +
                                "\r\n" +
                                "Short 16" +
                                "\r\n" +
                                "Byte   8" +
                                "\r\n\r\n" +
                                "注意在Kotlin中字符不是数字" +
                                "\r\n\r\n" +
                                "字面常量" +
                                "\r\n\r\n" +
                                "数值常量字面值有以下几种：" +
                                "\r\n" +
                                "--十进制：123" +
                                "\r\n" +
                                "       --Long类型用大写 L 标记： 123L" +
                                "\r\n" +
                                "--十六进制：0x0F" +
                                "\r\n" +
                                "--二进制：0b00001011" +
                                "\r\n\r\n" +
                                "注意：不支持八进制" +
                                "\r\n\r\n" +
                                "Kotlin同样支持浮点数的常规表示方法：" +
                                "\r\n" +
                                "--默认double:123.5、123.5e10" +
                                "\r\n" +
                                "--Float用f或者F标记：123.5f" +
                                "\r\n\r\n" +
                                "数字字面值中的下划线(自1.1起)" +
                                "\r\n" +
                                "你可以使用下划线使数字常量更易读:"

                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val oneMillion = 1_000_000" +
                                "\r\n" +
                                "val creditCardNumber = 1234_5678_9012_3456L" +
                                "\r\n" +
                                "val socialSecurityNumber = 999_99_9999L" +
                                "\r\n" +
                                "val hexBytes = 0xFF_EC_DE_5E" +
                                "\r\n" +
                                "val bytes = 0b11010010_01101001_10010100_10010010"

                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "\r\n\r\n" +
                                "表达方式" +
                                "\r\n\r\n" +
                                "在java平台数字是物理存储为JVM的原生类型，除非我们需要一个可空的引用(如 Int?)或泛型。后者情况下会把数字装箱。" +
                                "\r\n\r\n" +
                                "注意数字装箱不必保留同一性:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val a : Int = 10000" +
                                "\r\n" +
                                "print(a == a) // 输出\"true\"" +
                                "\r\n" +
                                "val boxedA: Int? = a" +
                                "\r\n" +
                                "val anotherBoxedA: Int? = a" +
                                "\r\n" +
                                "print(boxedA == anotherBoxedA) // 输出\"true\""
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "\r\n\r\n" +
                                "显式转换" +
                                "\r\n\r\n" +
                                "由于不同的表达方式，较小类型并不是较大类型的子类型。如果它们是的话，就会出现下述问题:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "//假想的代码，实际上并不能编译：" +
                                "\r\n" +
                                "val a: Int? = 1 //一个装箱的 Int(java.lang.Integer)" +
                                "\r\n" +
                                "val b: Long? = a //隐式转换产生一个装箱的Long(java.lang.Long)" +
                                "\r\n" +
                                "print(a == b) //惊！这将输出\"false\"鉴于Long的 equals() 检测其他部分也是 Long"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "所以同一性还有相等性都会在所有地方悄无声息地失去。" +
                                "\r\n" +
                                "因此较小的类型不能隐式转换为较大的类型。这意味着在不进行显示转换的情况下我们不能把Byte型值赋给一个Int变量。"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val b: Byte = 1 //OK,字面值是静态检测的" +
                                "\r\n" +
                                "val i: Int = b //错误"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "我们可以显式转换来拓宽数字"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val i: Int = b.toInt() // OK:显式拓宽"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "每个数字类型支持如下的转换" +
                                "\r\n" +
                                "--toByte():Byte" +
                                "\r\n" +
                                "--toShort():Short" +
                                "\r\n" +
                                "--toInt():Int" +
                                "\r\n" +
                                "--toLong():Long" +
                                "\r\n" +
                                "--toFloat():Float" +
                                "\r\n" +
                                "--toDouble():Double" +
                                "\r\n" +
                                "--toChar():Char" +
                                "\r\n\r\n" +
                                "缺乏隐式类型转换并不显著，因为类型会从上下文推断出来，而算数运算符会有重载做适当转换，例如："
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val l = 1L + 3 // Long + Int => Long"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }



                textView(
                        "\r\n\r\n" +
                                "运算" +
                                "\r\n\r\n" +
                                "Kotlin支持数字运算的标准集，运算被定义为相应的类成员(但编译器会将函数调用优化为相应的指令)。参见运算符重载。" +
                                "\r\n" +
                                "对于位运算符，没有特殊字符来表示，而只可用中缀方式调用命名函数，例如:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val x = (1 shl 2) and 0x000FF000"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "这是完整的位运算列表(只用于 Int和 Long):" +
                                "\r\n\r\n" +
                                "--shl(bits)-有符号左移(java的<<)" +
                                "\r\n" +
                                "--shr(bits)-有符号右移(java的>>)" +
                                "\r\n" +
                                "--ushr(bits)-无符号右移(java的>>>)" +
                                "\r\n" +
                                "--and(bits)-位与" +
                                "\r\n" +
                                "--or(bits)-位或" +
                                "\r\n" +
                                "--xor(bits)-位异或" +
                                "\r\n" +
                                "--inv()-位非" +
                                "\r\n\r\n" +
                                "字符" +
                                "\r\n" +
                                "字符用Char类型表示。它们不能直接当作数字"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fun check(c: Char) {" +
                                "\r\n" +
                                "   if(c == 1) //错误：类型不兼容" +
                                "\r\n" +
                                "       // ..." +
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


                textView(
                        "字符字面值用单引号括起来：'1'。特殊字符可以用反斜杠转义。支持这几个转义序列：\\t、\\b、\\n、" +
                                "\\r、\\'、\\\"、\\\\和\\\$。编码其他字符要用Unicode转义序列语法:'\\uFF00'。" +
                                "\r\n\r\n" +
                                "我们可以显式把字符转换成 Int 数字:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fun decimalDigitValue(c: Char): Int{" +
                                "\r\n" +
                                "   if( c!in '0'..'9')" +
                                "\r\n" +
                                "       throw IllegalArgumentException(\"Out of range\")" +
                                "\r\n" +
                                "   return c.toInt() - '0'.toInt() //显式转换为数字" +
                                "\r\n" +
                                "}"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "当需要可空引用时，像数字、字符会被装箱。装箱操作不会保留同一性。" +
                                "\r\n\r\n" +
                                "布尔" +
                                "\r\n\r\n" +
                                "布尔用Boolean类型表示，它有两个值:true和false." +
                                "\r\n" +
                                "若需要可空引用布尔会被装箱。" +
                                "\r\n" +
                                "内置的布尔运算有:" +
                                "\r\n" +
                                "-- || -短路逻辑或" +
                                "\r\n" +
                                "-- && -短路逻辑与" +
                                "\r\n" +
                                "-- ! -逻辑非" +
                                "\r\n\r\n" +
                                "数组" +
                                "\r\n" +
                                "数组在Kotlin中使用Array类来表示，它定义了get和set函数(按照运算符重载约定这会转变为[])和" +
                                "size属性，以及一些其他有用的成员函数:"
                        ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "class Array<T> private constructor() {" +
                                "\r\n" +
                                "   val size: Int" +
                                "\r\n" +
                                "   operator fun get(index: Int): T" +
                                "\r\n" +
                                "   operator fun set(index: Int, value: T): Unit" +
                                "\r\n\r\n" +
                                "   operator fun iterator(): Iterator<T>" +
                                "\r\n" +
                                "   // ..." +
                                "}"

                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                    "我们可以使用库函数arrayOf()来创建一个数组并传递元素值给它，这样arrayOf(1,2,3)创建了array[1,2,3]。或者，库函数arrayOfNulls可以"+
                            "用于创建一个指定大小、元素都为空的数组。"+
                            "\r\n\r\n"+
                            "另一个选项是用接受数组大小和一个函数参数的工厂函数，用作参数的函数能够返回给定索引的每个元素初始值:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "//创建一个Array<String>初始化为:[\"0\",\"1\",\"4\",\"9\",\"16\"]"+
                                "\r\n"+
                                "val asc = Array(5,{ i -> (i * i).toString() })"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "如上所述,[]运算符代表调用成员函数get()和set()。"+
                                "\r\n\r\n"+
                                "注意:与Java不同的是，Kotlin中数组是不变型的(invariant)。这意味着Kotlin不让我们把Array<String>赋值给Array<Any>,"+
                                "以防止可能的运行时失败(但是你可以使用Array<out Any>,参见类型投影)。"+
                                "\r\n\r\n"+
                                "Kotlin也有无装箱开销的专门类来表示原生类型数组:ByteArray、ShortArray、IntArray等等。这些类和Array并没有继承关系，但它们"+
                                "有相同的属性集。它们也都有相应的工厂方法:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val x: IntArray = intArrayOf(1,2,3)"+
                                "\r\n"+
                                "x[0] = x[1] + x[2]"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }



                textView(
                        "字符串"+
                                "\r\n\r\n"+
                                "字符串用String类型表示。字符串是不可变的。字符串的元素--字符可以使用索引运算符访问:s[i]。可以"+
                                "用for循环迭代字符串："
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "for(c in str)"+
                                "\r\n"+
                                "   println(c)"+
                                "\r\n"+
                                "}"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "字符串字面值"+
                                "\r\n\r\n"+
                                "Kotlin有两种类型的字符串字面值：转义字符串可以有转义字符，以及原生字符串可以包含换行和任意文本。转义字符串"+
                                "很像Java字符串:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val s = \"Hello, world!\\n\""
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "转义采用传统的反斜杠方式。参见上面的字符查看支持的转义序列。"+
                                "\r\n\r\n"+
                                "原生字符串使用三个引号(\"\"\")分界符括起来，内部没有转义并且可以包含换行和任何其他字符:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val text = \"\"\""+
                                "\r\n"+
                                "   for(c in \"foo\")"+
                                "\r\n"+
                                "       print(c)"+
                                "\r\n"+
                                "\"\"\""
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "你可以通过trimMargin()函数去除前导空格:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val text = \"\"\""+
                                "\r\n"+
                                "   |Tell me and I forget."+
                                "\r\n"+
                                "   |Teach me and I remember."+
                                "\r\n"+
                                "   |Involve me and I learn."+
                                "\r\n"+
                                "   |(Benjamin Franklin)"+
                                "\r\n"+
                                "\"\"\".trimMargin()"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "默认|用作边界前缀，但你可以选择其他字符并作为参数传入，比如trimMargin(\">\")。"+
                                "\r\n\r\n"+
                                "字符串模板"+
                                "\r\n\r\n"+
                                "字符串可以包含模板表达式，即一小段代码，会求值并把结果合并到字符串中。模板表达式以美元符(\$)开"+
                                "头，由一个简单的名字构成:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val i = 10"+
                                "\r\n"+
                                "val s = \"i = \$i\" //求值结果为 \"i = 10\""
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "或者用花括号扩起来的任意表达式:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val s = \"abc\""+
                                "\r\n"+
                                "val str = \"\$s.length is  \${s.length}\" // 求值结果为:\"abc.length is 3\""
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "原生字符串和转义字符串内部都支持模板。如果你需要在原生字符串中表示字面值\$字符(它不支持反斜杠转义),你可以用下列语法:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val price = \"\"\""+
                                "\r\n"+
                                "\${'\$'}9.99"+
                                "\r\n"+
                                "\"\"\""
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
