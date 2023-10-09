package com.example.tms_an_15_homework_lesson18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = findViewById<EditText>(R.id.userName)
        val password = findViewById<EditText>(R.id.password)
        val signUp = findViewById<Button>(R.id.btn_sign_up)

        val intent = Intent(this@MainActivity, ResultOfRegistration::class.java)

        userName.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(inputText: Editable?) {
                val resultUserName = inputText
                intent.putExtra("username", resultUserName.toString())
            }

        })

         password.addTextChangedListener(object : TextWatcher{
             override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

             }

             override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

             }

             override fun afterTextChanged(inputText: Editable?) {
                 val resultUserPassword = inputText
                 intent.putExtra("password", resultUserPassword.toString())
             }
         })






        signUp.setOnClickListener(){
            if(userName.length()>6 && password.length()>6){
                startActivity(intent)
            }
        }

    }
}