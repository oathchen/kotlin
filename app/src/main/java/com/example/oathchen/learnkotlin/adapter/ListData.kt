package com.example.oathchen.learnkotlin.adapter

import com.example.oathchen.learnkotlin.ui.base.BaseUI

/**
 * Created by oathchen on 2017/6/19.
 */
data class Lession(val name:String, val ui: BaseUI, val needPreLoad:Boolean = false){

  fun Lession(name:String, ui: BaseUI, needPreLoad: Boolean){
      if(needPreLoad){
                ui.preLoadUI()
      }
  }
}