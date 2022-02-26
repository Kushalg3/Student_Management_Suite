package com.example.studentmanagementsuite

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import androidx.fragment.app.Fragment
import soup.neumorphism.NeumorphImageButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.host,LoginAs())
        fm.addToBackStack(null)
        fm.commit()
    }
    var db = FirebaseFirestore.getInstance();
}