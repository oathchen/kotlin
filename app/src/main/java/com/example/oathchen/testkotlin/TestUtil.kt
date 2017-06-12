package com.example.oathchen.testkotlin

import android.content.Context
import android.widget.Toast

/**
 * Created by oathchen on 2017/5/22.
 */
class TestUtil{

    var context:Context? = null;

     constructor(context: Context){
        this.context = context;
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
}