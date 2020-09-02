package com.example.tp3app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.example.tp3app.data.questions
import com.example.tp3app.MainActivity
import com.example.tp3app.data.data
import com.example.tp3app.models.User
import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.fragment_question0.*

class question0 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout para este fragmento
        return inflater.inflate(R.layout.fragment_question0, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var nav  = findNavController()

        val perguntasTextViews = p1_textview




        // Configura cada texto iterativamente
        perguntasTextViews.text = questions[0].Question
        r0_button.setText(questions[0].Answ0)
        r1_button.setText(questions[0].Answ1)
        r2_button.setText(questions[0].Answ2)
        r3_button.setText(questions[0].Answ3)

        r0_button.setOnClickListener{
            data[0].Score += 0
            nav.navigate(R.id.action_question02_to_question1)
        }
        r1_button.setOnClickListener{
            data[0].Score += 2
            nav.navigate(R.id.action_question02_to_question1)
        }
        r2_button.setOnClickListener{
            data[0].Score += 3
            nav.navigate(R.id.action_question02_to_question1)
        }
        r3_button.setOnClickListener{
            data[0].Score += 4
            nav.navigate(R.id.action_question02_to_question1)
        }


    }


}


