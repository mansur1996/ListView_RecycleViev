package com.example.layout_intermediate.activity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.layout_intermediate.R
import com.example.layout_intermediate.activity.model.Member

class MemberAdapter(var context: Context, var members : ArrayList<Member>) : BaseAdapter() {

    var inflater : LayoutInflater ?= null

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return members.size
    }

    override fun getItem(position: Int): Any {
        return members.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val convertView  = inflater!!.inflate(R.layout.item_member_list, parent, false)
        val imageView = convertView.findViewById<ImageView>(R.id.iv_profile)
        val textView = convertView.findViewById<TextView>(R.id.tv_fullName)

        val member = members[position]

        imageView.setImageResource(member.profile)
        textView.setText(member.fulName)
        return convertView
    }

}