package com.example.tp3app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tp3app.data.data
import com.example.tp3app.data.questions
import kotlinx.android.synthetic.main.fragment_question0.*

class question1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout para este fragmento
        return inflater.inflate(R.layout.fragment_question1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var nav  = findNavController()

        val perguntasTextViews = p1_textview

        val respostasTextViews = listOf(r0_button,
            r1_button,
            r2_button,
            r3_button)

        // Configura cada texto iterativamente
        perguntasTextViews.text = questions[1].Question
        r0_button.setText(questions[1].Answ0)
        r1_button.setText(questions[1].Answ1)
        r2_button.setText(questions[1].Answ2)
        r3_button.setText(questions[1].Answ3)

        r0_button.setOnClickListener{
            data[0].Score += 0
            nav.navigate(R.id.action_question1_to_question2)
        }
        r1_button.setOnClickListener{
            data[0].Score += 2
            nav.navigate(R.id.action_question1_to_question2)
        }
        r2_button.setOnClickListener{
            data[0].Score += 4
            nav.navigate(R.id.action_question1_to_question2)
        }
        r3_button.setOnClickListener{
            data[0].Score += 5
            nav.navigate(R.id.action_question1_to_question2)
        }


    }

}