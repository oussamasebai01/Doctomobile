package com.example.doctomobile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val catA = findViewById<Button>(R.id.btn1)
        val liste = ArrayList<String>()
        liste.add("oussama")
        liste.add("wejden")
        catA.setOnClickListener{
              val intentToCategorie_A_Activity  =  Intent( this , Categorie_A_Activity::class.java,)
            intentToCategorie_A_Activity.putStringArrayListExtra("l1",liste)
             startActivity(intentToCategorie_A_Activity)


        }
    }


}