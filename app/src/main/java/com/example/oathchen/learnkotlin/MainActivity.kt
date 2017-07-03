package com.example.oathchen.learnkotlin
import android.os.Bundle
import android.view.KeyEvent
import android.view.WindowManager
import com.example.oathchen.learnkotlin.ui.MainActivityUI
import com.example.oathchen.learnkotlin.ui.UIManager
import com.example.oathchen.learnkotlin.ui.base.BaseActivity


class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var testUtil = TestUtil(this)

//        testUtil.toastText("这里是toast内容")
//        testUtil.testAdd(30,40)
//        testUtil.testMax(7,6)

        UIManager.register(this, MainActivityUI()).createUI()
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }




    override fun dispatchKeyEvent(event: KeyEvent?): Boolean {

        if(event!!.keyCode == KeyEvent.KEYCODE_BACK){//点击的是返回键
            if(event.action == KeyEvent.ACTION_DOWN && event.repeatCount == 0){//按键的按下事件
//                UIManager.register(this,MainActivityUI()).createUI()
                UIManager.pop()
                return false;
            }else if(event.action == KeyEvent.ACTION_UP && event.repeatCount == 0){//按键的抬起事件

                return false;
            }
        }
        return super.dispatchKeyEvent(event)
    }
}


