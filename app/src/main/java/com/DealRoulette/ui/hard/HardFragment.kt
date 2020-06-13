package com.DealRoulette.ui.hard

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.DealRoulette.R
import com.DealRoulette.constants.Constants
import kotlinx.android.synthetic.main.fragment_easy.view.*
import kotlinx.android.synthetic.main.fragment_hard.view.*
import kotlinx.android.synthetic.main.fragment_thirtifive.view.*
import kotlinx.android.synthetic.main.fragment_thirtifive.view.answerfield


/**
 * A simple [Fragment] subclass.
 */
class HardFragment : Fragment() {

    private lateinit var myView: View
    private var currentStep = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_hard, container, false)
        myView = view

        // Set up UIs.
        setupAnswerField()

        return view

    }

    private fun setupAnswerField() {
        myView.answerfield.setOnEditorActionListener(TextView.OnEditorActionListener { v, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                onAnswerFieldEdittedDone()
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun onAnswerFieldEdittedDone() {
        val result = myView.answerfield.text.toString()

        if (result == "69") {
            if(currentStep == 0) {
                updateStatus(false)
                return
            }
        }
        if (result == "51") {
            if(currentStep == 1) {
                updateStatus(false)
                return
            }
        }

        keepStatusAndvibrate()
    }

    private fun updateStatus(vibrate: Boolean) {

        currentStep ++
        if(currentStep >= 2) currentStep = 0

        keepStatusAndvibrate(vibrate)
    }

    private fun keepStatusAndvibrate(vibrate: Boolean = true) {
        if(vibrate) vibrate()
        myView.layouthard.setImageResource(Constants.EASY_ARRAY[currentStep])
        myView.answerfield.setText("")

    }

    private fun vibrate() {
        val v = activity?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator?
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            v!!.vibrate(500)
        } else {
            v!!.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE))
        }
    }
}
