package com.example.oathchen.testkotlin.ui.base

import android.content.Context
import android.widget.TextView
import java.util.jar.Attributes

/**
 * Created by oathchen on 2017/6/19.
 */
class BaseTextView(context: Context?) : TextView(context) {

    constructor(context:Context,attrs:Attributes):this(context){

    }

}