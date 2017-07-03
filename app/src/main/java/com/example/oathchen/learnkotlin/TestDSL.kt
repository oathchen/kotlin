package com.example.oathchen.learnkotlin
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec

/**
 * Created by oathchen on 2017/6/27.
 */
class TestDSL: FunSpec(){

    init{
        test("String.length should return the length of the string"){
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }




    }

    fun good(){


    }


}