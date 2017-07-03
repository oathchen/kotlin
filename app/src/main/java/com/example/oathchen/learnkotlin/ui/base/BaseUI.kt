package com.example.oathchen.learnkotlin.ui.base
import android.content.Context
import android.view.View
import org.jetbrains.anko.AnkoContext
import java.io.Serializable

/**
 * Created by oathchen on 2017/6/14.
 */
open class BaseUI: Serializable {


    fun BaseUI(): BaseUI {
        return getInstance()
    }

    companion object{
        object Resource{
            var uiInstance: BaseUI?= null
            var contextView: View?= null
        }
    }

    open fun preLoadUI(){

    }

   open  fun beforeCreateView(){

    }

    open fun afterCreateView(view: View){
            Resource.contextView = view
    }

    open fun getInstance(): BaseUI {
        if(Resource.uiInstance == null){
            Resource.uiInstance = this
            println("初始化界面Instance")
        }

        System.out.println("获取界面Instance")
        return Resource.uiInstance!!
    }

    /**
     * 使用单例缓存界面
     */
    fun createViewCache(ui: AnkoContext<Context>): View {
//            if(Resource.contextView != null){
//                return Resource.contextView!!
//            }
            println("create new View")
           return createView(ui)
    }


    open fun createView(ui:AnkoContext<Context>): View {
            throw UnsupportedOperationException()
    }

}