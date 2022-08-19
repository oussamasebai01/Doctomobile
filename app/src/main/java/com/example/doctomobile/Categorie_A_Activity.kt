package com.example.doctomobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Categorie_A_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorie_a_activity)
        val textView2 = findViewById<TextView>(R.id.textView2)

        val l = intent.getStringArrayListExtra("L1")
        val t = 5
        val liste = ArrayList<String>()
        liste.add("oussama")
        liste.add("wejden")
        textView2.text = liste.size.toString()
    }
}