package com.example.oathchen.learnkotlin
import android.content.Context
import android.widget.Toast

/**
 * Created by oathchen on 2017/5/22.
 */
class TestUtil{

    var test = "test"

    var stringRepresentation: String
        get() = ccc()
        set(value){

            println("use set")
            this.test = value
            println("after use set:$test")
        }


    fun ccc():String{
        println("use get:$test")
        return this.test
    }

    var context:Context? = null;

     constructor(context: Context){
        this.context = context;
    }

    constructor(){

    }



    /**
     * Toast数据结果
     */
    fun toastText(text:String){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }

    /**
     * 测试加法
     */
    fun testAdd(a:Int,b:Int):Int{

        //定义加法方法
        fun sum( a:Int ,b:Int) = a + b
        //计算加法结果
        var result = sum(a,b);
        //输出测试打印信息
        toastText("${a} + ${b} = ${result}")
        return result;
    }


    /**
     * 测试条件语句
     */
    fun testMax(a:Int,b:Int):Int{
        if(a>b) {
            toastText("${a} > ${b}")
            return a
        }
        else {
            toastText("${a} < ${b}")
            return b
        }
    }

    /**
     * 测试空值null
     */
    fun testNull(){

    }


    /**
     * 测试@标签
     */
    fun testlabel(){
        loop@for(i in 1..100)
            for(j in 1..100){
                if(false){
                    break@loop
                }
            }

        var ints = arrayOf("1","2","3")

            ints.forEach  lit@{
            if( it == "2" )return@lit
            print(it)
        }
    }

    fun eval(expr: Expr) : Double = when(expr){
        is Expr.Const -> expr.number
        is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
        Expr.NotANumber -> Double.NaN
    }

    sealed class Expr {
        class Const(val number: Double) : Expr()
        class Sum(val e1: Expr, val e2: Expr) : Expr()
        object NotANumber : Expr()
        // 也可以：
        class Sub{}
    }



    interface Base{
        fun print()
        fun printX()
    }


    class BaseImpl(val x:Int):Base{
        override fun printX() {
            println("this is printX")
        }

        override fun print() {
            println(x)
        }

    }

    class Derived(b:Base):Base by b{
        override fun printX() {

        }
    }





}


/**
 * 高阶函数map
 */
inline  fun<T,R> TestUtil.mapDouble(list:List<T>,transform: (T) -> R): List<R>{
    val result = arrayListOf<R>()
    for(item in list)
        result.add(transform(item))
    return result
}



/**
 * 使用中缀表达式进行转换
 */
infix inline fun<T,R>  List<T>.mapDouble(transform: (T) -> R) = TestUtil().mapDouble(this,transform)



