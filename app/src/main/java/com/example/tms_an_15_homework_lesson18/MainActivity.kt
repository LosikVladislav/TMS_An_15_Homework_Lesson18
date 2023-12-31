package com.example.tms_an_15_homework_lesson18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = findViewById<EditText>(R.id.userName)
        val password = findViewById<EditText>(R.id.password)
        val signUp = findViewById<Button>(R.id.btn_sign_up)

        signUp.setOnClickListener(){
            sendUserData(userName, password)
        }
    }
    private fun sendUserData(userName: EditText, password: EditText) {
        val intent = Intent(this, ResultOfRegistrationCorrect::class.java)
        intent.putExtra(USERNAME, userName.text.toString())
        intent.putExtra(PASSWORD, password.text.toString())
        if(userName.length()>6 && password.length()>6){
            startActivity(intent)
        }
    }
    companion object {
        const val USERNAME = "USERNAME"
        const val PASSWORD = "PASSWORD"
    }
}