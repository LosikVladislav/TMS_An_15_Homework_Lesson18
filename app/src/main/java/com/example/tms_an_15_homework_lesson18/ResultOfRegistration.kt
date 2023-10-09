package com.example.tms_an_15_homework_lesson18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ResultOfRegistration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_of_registration)

        val resultUserName = findViewById<TextView>(R.id.resultUserName)
        val resultUserData = intent.getStringExtra("username")
        if(intent != null){
            resultUserName.text ="login: " + resultUserData
        }



        val resultPassword = findViewById<TextView>(R.id.resultPassword)
        val resultUserPassword = intent.getStringExtra("password")
        if(intent != null){
            resultPassword.text ="password: " + resultUserPassword
        }


    }
}