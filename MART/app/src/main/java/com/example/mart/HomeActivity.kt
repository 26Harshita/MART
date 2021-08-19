package com.example.mart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        button7.setOnClickListener {
            val i = Intent(this, FreshArrivals::class.java)
            startActivity(i)

        }
        button4.setOnClickListener {
            val j = Intent(this, DalActivity::class.java)
            startActivity(j)
        }
        button5.setOnClickListener {
            val k = Intent(this, BakeryActivity::class.java)
            startActivity(k)
        }
        button6.setOnClickListener {
            val l = Intent(this, BakeryActivity::class.java)
            startActivity(l)
        }

        imageButton.setOnClickListener {
            val m = Intent(this, ContactActivity::class.java)
            startActivity(m)
        }


    }
}