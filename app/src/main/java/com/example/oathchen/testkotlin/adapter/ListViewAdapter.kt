package com.example.oathchen.testkotlin.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView
import com.example.oathchen.testkotlin.R
import com.example.oathchen.testkotlin.adapter.ListData.Lession
/**
 * Created by oathchen on 2017/6/12.
 *
 * ListView适配器
 */

/**
 * @datas:List<String> List当中数据的集合
 * @context:Context 上下文
 */
class ListViewAdapter(val datas:List<Lession>, val context: Context): BaseAdapter(){

      var mListener:((pos:Int,viewHolder:ViewHolder,lession:Lession) ->Unit) ?= null


    /**
     * 设置监听点击事件
     */
    fun setOnItemClickListener(listener:((pos:Int,viewHolder:ViewHolder,lession:Lession)->Unit)){
        mListener = listener
    }

    /**
     *获取单个元素
     */
    override fun getItem(position: Int): Any {
        return datas.get(position)
    }

    /**
     * 获取单个元素的id
     */
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    /**
     * 获取所有元素的个数
     */
    override fun getCount(): Int {
        return datas.size ?: datas.size ?: 0
    }

    /**
     * 对获取的单个元素进行处理
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var viewHolder:ViewHolder?=null
        var view:View
        if(convertView == null){
            view = View.inflate(context, R.layout.list_item,null)
            viewHolder = ViewHolder(view,position)
            view.tag=viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        if(getItem(position) is Lession){
            //给textview赋值
            var item: Lession = getItem(position) as Lession;
            viewHolder.textView.text = item.name;
        }

//        System.out.println(getItem(position).toString()+":"+position)
        //隔行变色
        if((position+1)%2!=0){
            viewHolder.ll_item.setBackgroundColor(context.resources.getColor(R.color.accent_material_dark))
        }else{
            viewHolder.ll_item.setBackgroundColor(context.resources.getColor(R.color.blue))
        }

            viewHolder.ll_item.setOnClickListener {
                //设置点击事件
                mListener?.invoke(position, viewHolder!!,getItem(position) as Lession)
            }
        return view;
    }

    class ViewHolder(var view:View,position: Int){
        var position:Int = position;
        var textView:TextView = view.findViewById(R.id.textView) as TextView
        var ll_item:LinearLayout = view.findViewById(R.id.ll_item) as LinearLayout
    }
    

}
