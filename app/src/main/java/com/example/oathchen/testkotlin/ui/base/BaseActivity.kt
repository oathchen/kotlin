package com.example.oathchen.testkotlin.ui.base

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.oathchen.testkotlin.ui.base.BaseUI
import com.example.oathchen.testkotlin.ui.UIManager

open class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var intent: Intent = getIntent();
        var ui = intent.getSerializableExtra("UI")

        if(ui != null){
            UIManager.register(this,ui as BaseUI).createUI()
        }
    }
}
