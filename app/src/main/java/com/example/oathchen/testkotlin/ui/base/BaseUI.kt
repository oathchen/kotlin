package com.example.oathchen.testkotlin.ui.base

import android.content.Context
import android.view.View
import org.jetbrains.anko.AnkoContext
import java.io.Serializable

/**
 * Created by oathchen on 2017/6/14.
 */
open class BaseUI: Serializable {

    companion object{

        //设置是否为单例模式
        var isSimpleInstance:Boolean = false;
        //单例

        var uiInstance: BaseUI?= null;

        fun createView(activity: Context): View {
            uiInstance = getInstance();
            uiInstance!!.beforeCreateView();
            var contextView = uiInstance!!.createView(AnkoContext.create(activity,true));
            uiInstance!!.afterCreateView(contextView)
            return contextView;
        }

        fun getInstance(): BaseUI {

            if(isSimpleInstance){//判断是否为单例模式

                if(uiInstance == null){
                    uiInstance = BaseUI()
                }
                return uiInstance as BaseUI;
            }

                uiInstance = BaseUI()
            return uiInstance as BaseUI
        }

    }

    open fun getInstance(): BaseUI {

        if(isSimpleInstance){//判断是否为单例模式

            if(uiInstance == null){
                uiInstance = BaseUI()
            }
            return uiInstance as BaseUI;
        }

        uiInstance = BaseUI()
        return uiInstance as BaseUI
    }



   open  fun beforeCreateView(){

    }

   open fun afterCreateView(view: View){

    }

    open fun createView(ui: AnkoContext<Context>): View {
        throw UnsupportedOperationException()
    }


}