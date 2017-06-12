package com.example.oathchen.testkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.oathchen.testkotlin.ui.LoginUI
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var testUtil = TestUtil(this)

//        testUtil.toastText("这里是toast内容")
//        testUtil.testAdd(30,40)
//        testUtil.testMax(7,6)

        LoginUI().setContentView(this@MainActivity)
    }
}


