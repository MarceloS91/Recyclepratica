package com.example.recycler_view_pratica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import models.ProfileAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var profileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAdapter()

        populateItems()
    }
   private fun populateItems(){
       val dataSource = data_source.createDataSet()
       profileAdapter.setDataSet(dataSource)
}
    private fun initAdapter() {
        profileAdapter = ProfileAdapter()

        recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerview.adapter = profileAdapter
    }
}