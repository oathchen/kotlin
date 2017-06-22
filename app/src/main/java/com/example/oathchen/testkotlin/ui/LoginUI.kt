package com.example.oathchen.testkotlin.ui

import android.content.Context
import android.text.InputType
import android.view.Gravity
import android.view.View
import android.widget.EditText
import com.example.oathchen.testkotlin.R
import com.example.oathchen.testkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/5/23.
 */

class LoginUI : BaseUI(){
    lateinit var et_password:EditText;
    lateinit var et_account:EditText;
    override fun createView(ui: AnkoContext<Context>):View{
        return with(ui) {
            verticalLayout {
                backgroundColor = context.resources.getColor(R.color.white)

                textView("取消") {
                    textColor = context.resources.getColor(R.color.blue)
                    textSize = px2dip(50)
                }.lparams {
                    leftMargin = dip(20)
                    topMargin = dip(20)
                }
                imageView(R.mipmap.logo).lparams {
                    gravity = Gravity.CENTER
                    width = dip(100)
                    height = dip(100)
                    topMargin = dip(30)
                }

                verticalLayout{
                    leftPadding = dip(20)

                    linearLayout {
                        orientation = 0
                        textView("账号"){
                            gravity = Gravity.CENTER
                        }.lparams {
                            height= matchParent
                        }
                        editText {
                            hint = "手机号/邮箱/用户名"
                            background = null
                            gravity = Gravity.LEFT
                        }.lparams {
                            width = dip(200)
                            leftMargin = dip(30)
                        }
                    }.lparams {
                        height = dip(50)
                    }

                    view{
                        backgroundColor= context.resources.getColor(R.color.material_blue_grey_950)

                    }.lparams {
                        width = matchParent
                        height = 1

                    }
                }

                verticalLayout {
                    leftPadding = dip(20)
                    linearLayout() {
                        orientation = 0
                        textView("密码"){
                            gravity = Gravity.CENTER
                        }.lparams {
                        }

                      et_password =  editText {
                            hint = "请输入密码"
                            background = null
                            gravity = Gravity.LEFT
                            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

                        }.lparams {
                            weight = 1.0f
                            leftMargin = dip(30)
                        }

                        imageView {
                            var hidden:Boolean = true
                            image = context.resources.getDrawable(R.mipmap.pwdhidden)
                            onClick{
                                hidden = !hidden

                                if(hidden){//密码隐藏
                                    et_password.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                                    image = context.resources.getDrawable(R.mipmap.pwdhidden)
                                }
                                else{//密码显示
                                    et_password.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                                    image = context.resources.getDrawable(R.mipmap.pwdshow)
                                }
                            }
                        }.lparams {
                            width = dip(30)
                            height = matchParent
                            rightMargin = dip(20)
                            gravity = Gravity.CENTER or Gravity.RIGHT
                        }

                    }.lparams {
                        height = dip(50)
                        width = matchParent
                    }


                    view{
                        backgroundColor= context.resources.getColor(R.color.material_blue_grey_950)

                    }.lparams {
                        width = matchParent
                        height = 1

                    }
                }


                button("登陆"){
                    gravity = Gravity.CENTER
                    backgroundColor = context.resources.getColor(R.color.blue)
                }.lparams {
                    width = matchParent
                    margin = dip(20)
                }



                linearLayout{
                    orientation = 0

                    textView("忘记密码?"){
                        gravity = Gravity.LEFT
                        textColor = context.resources.getColor(R.color.forget)
                    }.lparams {
                        weight = 1.0f
                        leftMargin = dip(20)

                    }

                    textView("立即注册"){
                        gravity = Gravity.RIGHT
                        textColor = context.resources.getColor(R.color.regist)
                    }.lparams {
                        weight = 1.0f
                        rightMargin = dip(20)
                    }

                }

            }

        }
    }

}
