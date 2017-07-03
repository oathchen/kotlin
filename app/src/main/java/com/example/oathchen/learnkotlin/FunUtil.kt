package com.example.oathchen.learnkotlin

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
/**
 * Created by oathchen on 2017/6/28.
 */

/**
 * let's test every kind of the fun.that's will be interesting
 */
class FunUtil{


}

/**
 * 使用中缀表达式进行转换
 */
//infix inline fun<T,R>  List<T>.mapDouble(transform: (T) -> R) = TestUtil().mapDouble(this,transform)

//what i want is println -> String



val SELF:String = "_SELF_PRINT"
infix inline fun Any.printTest(a:Any) = test(this,a)

/**
 *
 */
fun printTheTest(any:Any,printTest:Any){

    if(printTest == null ||printTest == SELF )
        println(any.toString())
    else
        println(printTest.toString())
}
var _printString:String = ""
var printString:String
    get() = printGet()
    set(value){
        println("use set")
        _printString = value
    }

fun printGet():String{
    println(":$_printString")
    return _printString
}

//var p: Any by TestUtil()
var p:Any by Delegate1()


fun test(any:Any,printTest: Any){

    p = printTest

//    printTest by Delegates.observable("<no name>"){
//        pro,old,new ->
//        println("$old -> $new")
//    }

    if(printTest == null ||printTest == SELF )
        println(any.toString())
    else
        println(any.toString())
}

class Delegate1 {
    operator fun  getValue(thisRef: Any?, property: KProperty<*>): Any {

        println("you are using '${property.name}' for getValue '${thisRef}'")
        return thisRef.toString()
    }

    operator fun  setValue(thisRef: Any?, property: KProperty<*>, s: Any) {

    }
}

//提供委托
class ResourceLoader<T>(){

    var tempValue:Any ?= null

    operator fun provideDelegate(
            thisRef: Any?,prop: KProperty<*>
    ):ReadWriteProperty<Any?,T>{

        return null!!
    }

    operator fun  getValue(thisRef: Any?, prop: KProperty<*>):Any{
//        tempValue = thisRef
        println("you are get the value:'${thisRef}' of '${prop.name}'")
        return tempValue.toString()
    }

    operator fun  setValue(myUI: MyUI, property: KProperty<*>, t: T){
        println("you are set the value:'${myUI}' of '${property.name}'")
        tempValue = t
        return null!!
    }
}

fun <T> bindResource(): ResourceLoader<String> {
    return ResourceLoader<String>()
}

class MyUI{
    val image by bindResource<String>()
    var text by bindResource<String>()


    var name: String by Delegates.observable("<no name>"){
        prop,old,new ->
        println("$old ->$new")
    }

    fun example(computeFoo:() -> Unit){
        val memizedFoo by lazy(computeFoo)

        //
    }

    }



