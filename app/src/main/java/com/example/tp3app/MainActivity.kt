package com.example.tp3app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tp3app.models.User
import kotlinx.android.synthetic.main.activity_main.*
import com.example.tp3app.data.data

class MainActivity : AppCompatActivity() {

    var user : User = User()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        continueButton.setOnClickListener{
            user.Name = PersonName.text.toString()
            data.add(user)

            setContentView(R.layout.activity_question)

        }
    }
}