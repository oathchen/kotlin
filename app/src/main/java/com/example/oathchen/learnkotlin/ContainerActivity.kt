package com.example.oathchen.learnkotlin

import android.os.Bundle
import android.view.WindowManager
import com.example.oathchen.learnkotlin.ui.base.BaseActivity

class ContainerActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }
}
