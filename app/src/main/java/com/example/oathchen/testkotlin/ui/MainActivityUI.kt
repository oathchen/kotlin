package com.example.oathchen.testkotlin.ui

import android.content.Context
import android.view.View
import android.widget.ListView
import com.example.oathchen.testkotlin.LoginActivity
import com.example.oathchen.testkotlin.adapter.ListData.Lession
import com.example.oathchen.testkotlin.adapter.ListViewAdapter
import com.example.oathchen.testkotlin.ui.base.BaseActivity
import com.example.oathchen.testkotlin.ui.base.BaseUI
import com.example.oathchen.testkotlin.ui.study.TagViewUI
import com.example.oathchen.testkotlin.ui.study.basegrammar.BaseGrammar
import com.example.oathchen.testkotlin.ui.study.basetype.BaseTypeUI
import com.example.oathchen.testkotlin.ui.study.coderule.CodeRuleUI
import com.example.oathchen.testkotlin.ui.study.habits.HabitsUI
import org.jetbrains.anko.*

/**
 * Created by oathchen on 2017/5/23.
 */
class MainActivityUI: BaseUI() {

      lateinit  var testListView: ListView;

    fun initAdapter(){
        testListView.adapter;
    }

    public class Request{
        public fun runUI():List<Lession>{
            val items= listOf<Lession>(
                    Lession("基础语法", BaseGrammar()),
                    Lession("习惯用法",HabitsUI()),
                    Lession("编码规范",CodeRuleUI()),
                    Lession("基本类型", BaseTypeUI()),
                    Lession("测试登陆页面", LoginUI()),
                    Lession("自定义控件", TagViewUI())
            )
            return items;
        }
    }


    override fun afterCreateView(contextView: View) {
        val request:Request = Request()
//        var list:List<String> ?= request.run()

        var list:List<Lession> ? = request.runUI()
        var listAdapter = ListViewAdapter(list!!,contextView.getContext())


        listAdapter.setOnItemClickListener {
            pos,viewHolder,lession->
//            contextView.getContext().toast("$pos")
//            LoginUI<MainActivity>().setContentView(this@MainActivity)

            UIManager.push(contextView.getContext()as BaseActivity,LoginActivity(),lession.ui)
//            UIManager.register(contextView.getContext() as Activity,lession.ui).createUI()
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

