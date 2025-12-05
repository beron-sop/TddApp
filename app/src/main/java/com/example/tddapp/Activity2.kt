package com.example.tddapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tddapp.adapters.ItemAdapter
import com.example.tddapp.models.ItemModel

class Activity2 : AppCompatActivity(), ItemLoader.Callback {

    private lateinit var adapter: ItemAdapter
    private lateinit var app: MyApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)

        app = application as MyApp

        adapter = ItemAdapter { item ->
            val i = Intent(this, Activity3::class.java)
            i.putExtra("clicked", item.text)
            startActivity(i)
        }

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter

        val count = intent.getIntExtra("count", 0)

        app.itemLoader.load(count, this)
    }

    override fun onLoaded(items: List<ItemModel>) {
        runOnUiThread {
            adapter.submit(items)
        }
    }
}
