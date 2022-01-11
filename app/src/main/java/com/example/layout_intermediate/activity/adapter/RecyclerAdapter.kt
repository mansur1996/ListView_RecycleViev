package com.example.layout_intermediate.activity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.layout_intermediate.R
import com.example.layout_intermediate.activity.model.Member

class RecyclerAdapter(var context: Context, var members : ArrayList<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_member_list, parent, false)
        return MemberViewHolder(view)
    }
    public class MemberViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var profile : ImageView
        var fullname : TextView
        init{
            profile = view.findViewById(R.id.iv_profile)
            fullname = view.findViewById(R.id.tv_fullName)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]

        if(holder is MemberViewHolder){
            val profile = holder.profile
            val fullName = holder.fullname

            profile.setImageResource(member.profile)
            fullName.setText(member.fulName)
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

}