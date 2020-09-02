package com.example.tp3app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tp3app.data.data
import com.example.tp3app.data.questions
import com.example.tp3app.models.User
import kotlinx.android.synthetic.main.fragment_question0.p1_textview
import kotlinx.android.synthetic.main.fragment_question0.r0_button
import kotlinx.android.synthetic.main.fragment_question0.r1_button
import kotlinx.android.synthetic.main.fragment_question0.r2_button
import kotlinx.android.synthetic.main.fragment_question0.r3_button
import kotlinx.android.synthetic.main.fragment_question8.r4_button
import kotlinx.android.synthetic.main.fragment_result.*

class result : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout para este fragmento
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var nav = findNavController()

        var perfil : String
        var user = data[0].Name
        var score = data[0].Score

        if (score <= 12)
        {
            perfil = "Conservador"
        }else if(score > 12 && score <= 29 ){
            perfil = "Moderado"
        }else{
            perfil = "Arrojado"
        }

        resultText.text =
            "Parabéns " + user + ", você concluiu o teste. Seu perfil foi considerado " + perfil

        backButton.setOnClickListener{
            nav.navigate(R.id.action_result_to_question02)
            data[0].Score = 0
        }

    }
}