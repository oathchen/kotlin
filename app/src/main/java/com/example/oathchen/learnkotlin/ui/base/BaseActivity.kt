package com.example.oathchen.learnkotlin.ui.base

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.oathchen.learnkotlin.ui.UIManager

open class BaseActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var intent: Intent = getIntent();
        var ui = intent.getSerializableExtra("UI")

        if(ui != null){
            UIManager.register(this,ui as BaseUI).createUI()
        }
    }
}
