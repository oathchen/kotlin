package com.example.oathchen.learnkotlin.ui
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import com.example.oathchen.learnkotlin.ui.base.BaseActivity
import com.example.oathchen.learnkotlin.ui.base.BaseUI
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast
import java.util.*

/**
 * Created by oathchen on 2017/6/14.
 */


/**
 * 使用manager对界面进行统一管理
 */
class UIManager(activity: Activity):AnkoComponent<Context>{

    companion object{

        var activity:Activity ?=null
        var ui: BaseUI?=null

        var canExit = false //用于计算是否可以退出应用

        /**
         * activityMap用于存储某个activity对应的界面
         * activity和UI,activity为key,UI为value
         */
        var activityMap:HashMap<Activity, BaseUI> ?= HashMap()

        /**
         *uiMap用于存储某个ui对应生成的View
         * ui为key,view
         */

        var uiMap:HashMap<BaseUI,View> ?= HashMap()
        /**
         *stack用于存储所有的activity
         */
        var stack:Stack<Activity> ?= Stack();


        /**
         *使用栈来存储activity,将activity推入栈中
         */
        fun push(activityThis: BaseActivity, activity2Start: BaseActivity, ui: BaseUI){
            val intent = Intent();
            intent.putExtra("UI",ui)
            intent.setClass(activityThis,activity2Start.javaClass)
            activityThis.startActivity(intent)

        }

        /**
         * 使用栈来存储activity,将activity压出栈
         */
        fun pop(){

            if(stack!!.size == 1){

                var activity:Activity = stack!!.peek()

                if(canExit){
                    activity.finish();
                }
                canExit = true
                activity.toast("再点击一次退出应用")
                return
            }

            canExit = false
            var activity:Activity = stack!!.pop()

            if(activity != null){
                activity.finish()
            }
            return
        }

        /**
         *使界面和activity建立一一对应的关系,使用map存储在manager里面
         */
        fun register(activity:Activity,ui: BaseUI): Companion {
            activityMap!!.put(activity,ui)
            this.activity = activity
            this.ui = ui

            if(!stack!!.contains(activity)){
                stack!!.push(activity)
            }
            return this
        }
        /**
         * 移除manager里面界面的对应关系
         */
        fun unregister(activity: Activity):Companion{
            activityMap!!.remove(activity)
            this.activity = activity
            return this
        }


        /**
         * 创建界面,创建界面之前必须先注册，调用register方法
         */
        fun createUI(){
            UIManager(activity!!).createUI(activity!!)
        }

        /**
         * 在activity里创建存储在UIManager里面对应的界面
         */
        fun createUI(activity: Activity,activityInManager: Activity){
            UIManager(activityInManager!!).createUI(activity!!)
        }

    }

    var activity = activity





    /**
     * 创建界面
     */
    fun createUI(activity:Activity){
        this.setContentView(activity)
    }

    /**
     * 创建界面
     */
    fun createUI(){
        this.setContentView(activity)
    }

    override fun createView(ui: AnkoContext<Context>): View {

        if(activityMap!!.contains(activity)){
            var ui = activityMap!!.get(activity)
            ui!!.beforeCreateView()
            var contextView = ui!!.createViewCache(AnkoContext.Companion.create(activity,true))
            ui!!.afterCreateView(contextView)
            return contextView;
        }

        throw Exception( activity.toString()+ ":未注册，请先调用UIManager的register方法注册该activity")

        return null!!;
    }

}
