package com.example.oathchen.learnkotlin.ui.study.habits

/**
 * Created by oathchen on 2017/6/22.
 */
class TestHabits{

    //数据类
    data class Customer(var name:String, var age: Int)


    //扩展函数
    fun String.spaceToCamelCase(){
        "Convert this to Camelcase".spaceToCamelCase()
    }

    //"if"表达式
    fun foo(param: Int){
        val result = if(param == 1){
            "one"
        }else if(param == 2){
            "two"
        }else{
            "three"
        }
    }

    fun testApply1(test:String ="testApply1"):String{
        println(test)
        return test
    }

    fun testApply2(test:String = "testApply2"):String{

        println(test)
        return test
    }


}