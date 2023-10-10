package com.example.tms_an_15_homework_lesson18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tms_an_15_homework_lesson18.MainActivity.Companion.PASSWORD
import com.example.tms_an_15_homework_lesson18.MainActivity.Companion.USERNAME

class ResultOfRegistrationCorrect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_of_registration_correct)

        val resultUser = findViewById<TextView>(R.id.resultUserName)
        resultUser.text =  intent.getStringExtra(USERNAME)

        val resultPassword = findViewById<TextView>(R.id.resultPassword)
        resultPassword.text =  intent.getStringExtra(PASSWORD)
    }
}