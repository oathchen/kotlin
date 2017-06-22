package com.example.oathchen.testkotlin.ui.study

import android.content.Context
import android.view.View
import com.example.oathchen.testkotlin.R
import com.example.oathchen.testkotlin.ui.base.BaseUI
import com.example.oathchen.testkotlin.ui.base.tagView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout


/**
 * Created by oathchen on 2017/6/20.
 */
class TagViewUI : BaseUI() {


    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            verticalLayout {

               tagView {
                   textView("Android"){
                    background = context.resources.getDrawable(R.drawable.bg_tagview_item)
                   }.lparams{
                       leftMargin = 2
                       rightMargin = 2
                   }

                   textView("Java"){
                       background = context.resources.getDrawable(R.drawable.bg_tagview_item)
                   }.lparams{
                       leftMargin = 2
                       rightMargin = 2
                   }

                   textView("Python"){
                       background = context.resources.getDrawable(R.drawable.bg_tagview_item)
                   }.lparams{
                       leftMargin = 2
                       rightMargin = 2
                   }

                   textView("JavaScript"){
                       background = context.resources.getDrawable(R.drawable.bg_tagview_item)
                   }.lparams{
                       leftMargin = 2
                       rightMargin = 2
                   }

                   textView("Html"){
                       background = context.resources.getDrawable(R.drawable.bg_tagview_item)
                   }.lparams{
                       leftMargin = 2
                       rightMargin = 2
                   }

               }.lparams{
                    width = matchParent
                    height = matchParent
               }
            }


        }
    }




}


