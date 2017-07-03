package com.example.oathchen.learnkotlin.ui
import android.content.Context
import android.text.InputType
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.oathchen.learnkotlin.MyUI
import com.example.oathchen.learnkotlin.R
import com.example.oathchen.learnkotlin.TestUtil
import com.example.oathchen.learnkotlin.bindResource
import com.example.oathchen.learnkotlin.ui.base.BaseUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/5/23.
 */

class LoginUI : BaseUI(){
//    lateinit var et_password:EditText
    lateinit var et_account:EditText
    lateinit var iv_test:ImageView



    object Resource{
        var et_password:EditText ?= null
        var contextView:View ?= null
        var instance:LoginUI ?= null
    }

    override fun getInstance(): BaseUI {
        return super.getInstance()
    }


    override fun afterCreateView(view: View) {
        super.afterCreateView(view)
        Glide.with(view.getContext()).load(R.mipmap.test8).asGif().diskCacheStrategy(DiskCacheStrategy.NONE).into(iv_test)

        var testUtil: TestUtil = TestUtil(view.context)

//        testUtil.stringRepresentation = "aaaa"
//        println(testUtil.stringRepresentation)

//        println (testUtil.eval(TestUtil.Expr.Sum(TestUtil.Expr.Const(3.4),TestUtil.Expr.Const(6.5))))

        println("testDSL:")
        var ints:List<Int> = arrayListOf(3,4,5)

//        println(testUtil.mapDouble(ints,{value -> value *2}))


//        ints mapDouble {value -> value*4} printTest SELF


//        var t = MyUI().image
//        t = "aa"
//        println("print the result:"+ t)


            var t by bindResource<String>()

        MyUI().example {
            println("你好")
        }

    }
    override fun createView(ui: AnkoContext<Context>):View{
        return with(ui) {

            relativeLayout {
                iv_test = imageView {

                }.lparams {
                    width = matchParent
                    height = matchParent
                }
                verticalLayout {
                    backgroundColor = context.resources.getColor(R.color.trans)
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

                    verticalLayout {
                        leftPadding = dip(20)

                        linearLayout {
                            orientation = 0
                            textView("账号") {
                                gravity = Gravity.CENTER
                                textColor = context.resources.getColor(R.color.white)
                            }.lparams {
                                height = matchParent
                            }
                            editText {
                                hint = "手机号/邮箱/用户名"
                                hintTextColor= context.resources.getColor(R.color.white)
                                textColor = context.resources.getColor(R.color.white)
                                background = null
                                gravity = Gravity.LEFT
                            }.lparams {
                                width = dip(200)
                                leftMargin = dip(30)
                            }
                        }.lparams {
                            height = dip(50)
                        }

                        view {
                            backgroundColor = context.resources.getColor(R.color.material_blue_grey_950)

                        }.lparams {
                            width = matchParent
                            height = 1

                        }
                    }

                    verticalLayout {
                        leftPadding = dip(20)
                        linearLayout() {
                            orientation = 0
                            textView("密码") {
                                gravity = Gravity.CENTER
                                textColor = context.resources.getColor(R.color.white)
                            }.lparams {
                            }


                            if(Resource.et_password == null){
                                Resource.et_password = editText {
                                    hint = "请输入密码"
                                    hintTextColor = context.resources.getColor(R.color.white)
                                    textColor = context.resources.getColor(R.color.white)
                                    background = null
                                    gravity = Gravity.LEFT
                                    inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

                                }.lparams {
                                    weight = 1.0f
                                    leftMargin = dip(30)
                                }
                            }

                            imageView {
                                var hidden: Boolean = true
                                image = context.resources.getDrawable(R.mipmap.pwdhidden)
                                onClick {
                                    hidden = !hidden

                                    if (hidden) {//密码隐藏
                                        Resource.et_password!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                                        image = context.resources.getDrawable(R.mipmap.pwdhidden)
                                    } else {//密码显示
                                        Resource.et_password!!.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
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


                        view {
                            backgroundColor = context.resources.getColor(R.color.material_blue_grey_950)

                        }.lparams {
                            width = matchParent
                            height = 1

                        }
                    }


                    button("登陆") {
                        gravity = Gravity.CENTER
                        backgroundResource = R.drawable.shape_corner
                        textColor = context.resources.getColor(R.color.white)
                        textSize = 20.0f
                    }.lparams {
                        width = matchParent
                        margin = dip(20)
                    }



                    linearLayout {
                        orientation = 0

                        textView("忘记密码?") {
                            gravity = Gravity.LEFT
                            textColor = context.resources.getColor(R.color.forget)
                        }.lparams {
                            weight = 1.0f
                            leftMargin = dip(20)

                        }

                        textView("立即注册") {
                            gravity = Gravity.RIGHT
                            textColor = context.resources.getColor(R.color.regist)
                        }.lparams {
                            weight = 1.0f
                            rightMargin = dip(20)
                        }

                    }

                }.lparams {
                    width = matchParent
                    height = matchParent
                }

            }

        }
    }

}




