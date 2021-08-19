package com.example.mart


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_view_design.*


class DalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dal)
        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel1>()

        // This loop will create 20 Views containing
        // the image with the count of view
        data.add(ItemsViewModel1(R.drawable.photo, "Arhaar Dal", "210"))
        data.add(ItemsViewModel1(R.drawable.photo, "Moong Dal", "100"))
        data.add(ItemsViewModel1(R.drawable.photo, "Malka Dal", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Udhat Dal", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Kashmiri Lal Mirch", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Haldi", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Rajma", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Chana", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Namak", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Senda Namak", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Kashori Mirch", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Ghee", "150"))
        data.add(ItemsViewModel1(R.drawable.photo, "Refiend", "150"))





        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        
    }
}

