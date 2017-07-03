package com.example.oathchen.learnkotlin.ui.study.habits

import android.content.Context
import android.graphics.Color
import android.view.View
import com.example.oathchen.learnkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/22.
 */
/**
 * 习惯用法
 */
class HabitsUI : BaseUI() {


    override fun afterCreateView(view: View) {
        super.afterCreateView(view)
//        var data1 =  listOf("aaa","aaa","aaa","aaa")
//        var map1 = mapOf("a" to 1,"email" to 2)
//        val email = map1["email"] ?: println("i don't have this element")

        TestHabits().apply {
            var test = testApply1()
            testApply2(test)
        }
    }


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {

            scrollView {
            verticalLayout {

                textView("习惯用法") {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                }
                textView(
                        "一些Kotlin中广泛使用的语法习惯，如果你有更喜欢的语法习惯或风格，建一个pull request贡献给我们吧！" +
                                "\r\n\r\n" +
                                "创建DTOs(POJOs/POCOs)"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "data class Customer(val name: String, val email: String)"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }



                textView(
                        "会为Customer类提供以下功能:"+
                                "\r\n\r\n"+
                                "——所有属性的getters(对于var定义的还有setters)"+
                                "\r\n\r\n"+
                                "——hashCode()"+
                                "\r\n\r\n"+
                                "——toString()"+
                                "\r\n\r\n"+
                                "——copy()"+
                                "\r\n\r\n"+
                                "——所有属性的component1()、component2()......等等（参见数据类）"+
                                "\r\n\r\n"+
                                "函数的默认参数"+
                                "\r\n"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                  "fun foo(a: Int = 0, b: String = \"\"){ ...... }"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "过滤list"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val positives = list.filter { x -> x > 0 }"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "或者可以更短:"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val positives = list.filter {it > 0}"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "String内插"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "println(\"Name \$name\")"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "类型判断"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "when(x){"+
                                "\r\n"+
                                "   is Foo //-> ..."+
                                "\r\n"+
                                "   is Bar //-> ..."+
                                "\r\n"+
                                "   else //-> ..."+
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
                        "便利map/pair型list"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "for((k,v) in map)"+
                                "\r\n"+
                                "   println(\"\$k -> \$v\")"+
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
                        "k 、v可以改成任意名字。"+
                                "\r\n\r\n"+
                                "使用区间"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                   "for (i in 1..100) { ...} //闭区间：包含100"+
                           "\r\n"+
                           "for(i in 1 until 100) { ... } //半开区间：不包含100"+
                           "\r\n"+
                           "for(x in 2..10 step 2) { ... }"+
                           "\r\n"+
                           "for(x in 10 downTo 1){ ... }"+
                           "\r\n"+
                           "if( x in 1..10) { ... }"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "只读list"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                   "val list = listOf(\"a\",\"b\",\"c\")"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "只读map"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                    "val map = mapOf(\"a\" to 1, \"b\" to 2, \"c\" to 3)"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "访问map"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                     "println(map[\"key\"])"+
                             "\r\n"+
                             "map[\"key\"] = value"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "延迟属性"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val p:String by lazy {"+
                                "\r\n"+
                                "   //计算该字符串"+
                                "\r\n\r\n"+
                                "}"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "扩展函数"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fun String.spaceToCamelcase(){ ... }"+
                                "\r\n\r\n"+
                                "\"Convert this to camelcase\".spaceTocamelCase()"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "创建单例"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                       "object Resource {"+
                               "\r\n"+
                               "    val name = \"Name\""+
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
                        "If not null 缩写"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                    "val files = File(\"Test\").listFiles()"+
                            "\r\n\r\n"+
                            "println(files?.size)"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }


                textView(
                        "If not null and else缩写"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                    "val files = File(\"Test\").listFiles()"+
                            "\r\n\r\n"+
                            "println(files?.size ?: \"empty\")"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }



                textView(
                        "If null执行一个语句"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                    "val data = ..."+
                            "\r\n\r\n"+
                            "data?.let{"+
                            "\r\n"+
                            "   ...//代码会执行到此处，假如data不为null"+
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
                        "映射可空值(如果非空的话)"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val data = ..."+
                                "\r\n\r\n"+
                                "val mapped = data?.let{transformData(it)} ?: defaultValueIfDataIsNull"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "返回when表达式"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fun transform(color: String): Int{"+
                                "\r\n"+
                                "   return when (color){"+
                                "\r\n"+
                                       "\"Red\" -> 0"+
                                "\r\n"+
                                "       \"Green\" -> 1"+
                                "\r\n"+
                                "       \"Blue\" ->2"+
                                "\r\n"+
                                "       else -> throw IllegalArgumentException(\"Invalid color param value\")" +
                                "\r\n"+
                                "   }"+
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
                        "\"try/catch\"表达式"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fun test()"+
                                "\r\n"+
                                "   val resul;t = try{"+
                                "\r\n"+
                                "       count()"+
                                "\r\n"+
                                "   }catch(e: ArithmeticException) {"+
                                "\r\n"+
                                "       throw IllegalStateException(e)"+
                                "\r\n"+
                                "   }"+
                                "\r\n\r\n"+
                                "//使用result"+
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
                        "\"if\"表达式"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fun foo(param: Int){"+
                                "\r\n"+
                                "   val result = if(param == 1) {"+
                                "\r\n"+
                                "       \"one\""+
                                "\r\n"+
                                "   }else if (param == 2) {"+
                                "       \"two\""+
                                "\r\n"+
                                "   else {"+
                                "\r\n"+
                                "       \"three\""+
                                "\r\n"+
                                "   }"+
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
                        "返回类型为Unit的方法的Builder风格用法"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                       "fun arrayOfMinusOnes(size: Int): IntArray{"+
                               "\r\n"+
                               "return IntArray(size).apply { fill(-1) }"+
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
                        "单表达式函数"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "fun theAnswer() = 42"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }

                textView(
                        "等价于"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                       "fun theAnswer(): Int{"+
                               "\r\n"+
                               "    return 42"+
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
                        "单表达式函数与其它惯用法一起使用能简化代码，例如和when表达式一起使用："
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                      "fun transform(color: String): Int = when (color) {"+
                              "\r\n"+
                              " \"Red\" -> 0"+
                              "\r\n"+
                              " \"Green\" -> 1"+
                              "\r\n"+
                              " \"Blue\" ->2"+
                              "\r\n"+
                              " else -> throw IllegalArgumentException(\"Invalid color param value\")"+
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
                        "对一个对象实例调用多个方法（with）"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                     "class Trutle {"+
                             "\r\n"+
                             "  fun penDown()"+
                             "\r\n"+
                             "  fun penUp()"+
                             "\r\n"+
                             "  turn(degrees: Double)"+
                             "\r\n"+
                             "  fun forward(pixels: Double)"+
                             "\r\n"+
                             "}"+
                             "\r\n\r\n"+
                             "val myTurtle = Turtle()"+
                             "\r\n"+
                             "with(myTurtle) { // 画一个100像素的正方形"+
                             "\r\n"+
                             "      penDown()"+
                             "\r\n"+
                             "      for(i in 1..4)"+
                             "\r\n"+
                             "          forward(100.0)"+
                             "\r\n"+
                             "          turn(90.0)"+
                             "\r\n"+
                             "      }"+
                             "\r\n"+
                             "      penUp()"+
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
                        "Java 7的 try with resources"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                     "val stream = Files.newInputStream(Paths.get(\"/some/file.txt\"))"+
                             "\r\n"+
                             "stream.buffered().reader().use{ reader ->"+
                             "\r\n"+
                             "  println(reader.readText())"+
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
                        "对于需要泛型信息的泛型函数的适宜形式"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                    "// public final class Gson {"+
                            "\r\n"+
                            "// ..."+
                            "\r\n"+
                            "// public <T> T fromJson(JsonElement json, Class<T> classOfT) throws"+
                            "\r\n"+
                            "JsonSyntaxException {"+
                            "\r\n"+
                            "// ..."+
                            "\r\n\r\n"+
                            "inline fun <reified T: Any> Gson.fromJson(json): T = this.fromJson(json, T::class.java)"
                ) {
                    backgroundColor = Color.LTGRAY
                    padding = 20
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }



                textView(
                        "使用可空布尔"
                ) {

                }.lparams {
                    leftMargin = 20
                    topMargin = 20
                    bottomMargin = 20
                }

                textView(
                        "val b: Boolean? = ..."+
                                "\r\n"+
                                "if(b == true)"+
                                "\r\n"+
                                "   ..."+
                                "\r\n"+
                                "} else {"+
                                "\r\n"+
                                "   //  'b' 是 false 或者 null"+
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

