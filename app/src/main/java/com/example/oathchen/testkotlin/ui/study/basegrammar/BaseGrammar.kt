package com.example.oathchen.testkotlin.ui.study.basegrammar

import android.content.Context
import android.view.View
import android.widget.ListView
import com.example.oathchen.testkotlin.LoginActivity
import com.example.oathchen.testkotlin.adapter.ListData.Lession
import com.example.oathchen.testkotlin.adapter.ListViewAdapter
import com.example.oathchen.testkotlin.ui.UIManager
import com.example.oathchen.testkotlin.ui.base.BaseActivity
import com.example.oathchen.testkotlin.ui.base.BaseUI
import com.example.oathchen.testkotlin.ui.study.PackageUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/6/19.
 */


/**
 * 基本语法学习
 */
class BaseGrammar: BaseUI() {

    lateinit  var testListView: ListView;

    fun initAdapter(){
        testListView.adapter;
    }

    public class Request{
        public fun runUI():List<Lession>{
            val items= listOf<Lession>(
                    Lession("定义包", PackageUI()),
                    Lession("定义函数", FunctionUI()),
                    Lession("定义局部变量",LocalVariableUI()),
                    Lession("注释",AnnotationUI()),
                    Lession("使用字符串模板", StringModuleUI()),
                    Lession("使用条件表达式", CaseExpressionUI()),
                    Lession("使用可空值及null检测", NullDetectUI()),
                    Lession("使用类型检测及自动类型转换", TypeDetectUI()),
                    Lession("使用for循环", ForLoopUI()),
                    Lession("使用wile循环", WhileLoopUI()),
                    Lession("使用when表达式", WhenExpressionUI()),
                    Lession("使用区间(range)", RangUI()),
                    Lession("使用集合", CollectionUI())
                    )
            return items
        }
    }



    override fun afterCreateView(contextView: View) {
        val request: Request = Request()
//        var list:List<String> ?= request.run()

        var list:List<Lession> ? = request.runUI()
        var listAdapter = ListViewAdapter(list!!,contextView.getContext())


        listAdapter.setOnItemClickListener {
            pos,viewHolder,lession->
            UIManager.push(contextView.getContext()as BaseActivity, LoginActivity(),lession.ui)
        }
        testListView.adapter = listAdapter
    }

    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui){
            verticalLayout {

                testListView = listView{
                }.lparams{
                    width= matchParent
                    height = wrapContent
                }
            }

        }
    }



}

