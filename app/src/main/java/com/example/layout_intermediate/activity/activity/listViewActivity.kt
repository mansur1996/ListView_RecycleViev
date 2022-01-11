package com.example.layout_intermediate.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.layout_intermediate.R
import com.example.layout_intermediate.activity.adapter.MemberAdapter
import com.example.layout_intermediate.activity.model.Member

class listViewActivity : AppCompatActivity() {
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initView()
    }
    private fun initView(){
        listView = findViewById(R.id.listView)

        val members : ArrayList<Member> = ArrayList<Member>()
        members.add(Member(R.mipmap.ic_launcher, "Xurshidber"))
        members.add(Member(R.mipmap.ic_launcher_round, "Begzodbek"))
        members.add(Member(R.mipmap.ic_launcher, "Xurshidber"))
        members.add(Member(R.mipmap.ic_launcher_round, "Begzodbek"))

        freshAdapter(members)
    }
    private fun freshAdapter(members: ArrayList<Member>){
        val adapter = MemberAdapter(this, members)
        listView.adapter = adapter
    }
}