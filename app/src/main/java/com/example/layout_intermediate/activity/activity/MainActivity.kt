package com.example.layout_intermediate.activity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.layout_intermediate.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    private fun initViews(){
        val openDetailButtom = findViewById<Button>(R.id.btn_open_detail)

        openDetailButtom.setOnClickListener(){
            openRecyclerActivity()
        }
    }
    private fun openListViewActivity(){
        startActivity(Intent(this, listViewActivity::class.java))
    }
    private fun openRecyclerActivity(){
        startActivity(Intent(this, RecyclerActivity::class.java))
    }
}