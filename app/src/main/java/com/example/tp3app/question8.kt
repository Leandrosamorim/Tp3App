package com.example.tp3app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tp3app.data.data
import com.example.tp3app.data.questions
import kotlinx.android.synthetic.main.fragment_question0.p1_textview
import kotlinx.android.synthetic.main.fragment_question0.r0_button
import kotlinx.android.synthetic.main.fragment_question0.r1_button
import kotlinx.android.synthetic.main.fragment_question0.r2_button
import kotlinx.android.synthetic.main.fragment_question0.r3_button
import kotlinx.android.synthetic.main.fragment_question8.r4_button

class question8 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout para este fragmento
        return inflater.inflate(R.layout.fragment_question8, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var nav = findNavController()

        val perguntasTextViews = p1_textview

        // Configura cada texto iterativamente
        perguntasTextViews.text = questions[8].Question
        r1_button.setText(questions[8].Answ1)
        r0_button.setText(questions[8].Answ0)
        r2_button.setText(questions[8].Answ2)
        r3_button.setText(questions[8].Answ3)
        r4_button.setText(questions[8].Answ4)

        r0_button.setOnClickListener {
            data[0].Score += 0
            nav.navigate(R.id.action_question8_to_result)
        }
        r1_button.setOnClickListener {
            data[0].Score += 1
            nav.navigate(R.id.action_question8_to_result)
        }
        r2_button.setOnClickListener {
            data[0].Score += 2
            nav.navigate(R.id.action_question8_to_result)
        }
        r3_button.setOnClickListener {
            data[0].Score += 4
            nav.navigate(R.id.action_question8_to_result)
        }
        r4_button.setOnClickListener {
            data[0].Score += 5
            nav.navigate(R.id.action_question8_to_result)
        }

    }
}