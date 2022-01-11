package com.example.layout_intermediate.activity.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.layout_intermediate.R
import com.example.layout_intermediate.activity.adapter.RecyclerAdapter
import com.example.layout_intermediate.activity.model.Member

class RecyclerActivity : AppCompatActivity() {

    lateinit var context: Context
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        initViews()
    }
    private fun initViews(){
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(context, 2)

        val members = ArrayList<Member>()
        members.add(Member(R.mipmap.ic_launcher, "Usta bobo"))
        members.add(Member(R.mipmap.ic_launcher, "Maqsud"))
        members.add(Member(R.mipmap.ic_launcher, "Shag'zod"))
        members.add(Member(R.mipmap.ic_launcher, "Dilmurod"))
        members.add(Member(R.mipmap.ic_launcher, "Usta aka"))
        members.add(Member(R.mipmap.ic_launcher, "Mansur"))
        members.add(Member(R.mipmap.ic_launcher, "Usta bobo"))
        members.add(Member(R.mipmap.ic_launcher, "Maqsud"))
        members.add(Member(R.mipmap.ic_launcher, "Shag'zod"))
        members.add(Member(R.mipmap.ic_launcher, "Dilmurod"))
        members.add(Member(R.mipmap.ic_launcher, "Usta aka"))
        members.add(Member(R.mipmap.ic_launcher, "Mansur"))

        refreshAdapter(members)
    }
    private fun refreshAdapter(members : ArrayList<Member>){
        var adapter = RecyclerAdapter(context, members)
        recyclerView.adapter = adapter
    }
}