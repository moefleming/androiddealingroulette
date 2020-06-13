package com.DealRoulette.ui.easy

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
import kotlinx.android.synthetic.main.fragment_thirtifive.view.*
import kotlinx.android.synthetic.main.fragment_thirtifive.view.answerfield


/**
 * A simple [Fragment] subclass.
 */
class EasyFragment : Fragment() {

    private lateinit var myView: View
    private var currentStep = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_easy, container, false)
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
            if(currentStep == 29) {
                updateStatus(false)
                return
            }
        }
        if (result == "51") {
            if(currentStep == 1) {
                updateStatus(false)
                return
            }
            if(currentStep == 27) {
                updateStatus(false)
                return
            }
            if(currentStep == 33) {
                updateStatus(false)
                return
            }
        }
        if (result == "25") {
            if(currentStep == 2) {
                updateStatus(false)
                return
            }
        }
        if (result == "43") {
            if(currentStep == 3) {
                updateStatus(false)
                return
            }
            if(currentStep == 23) {
                updateStatus(false)
                return
            }
        }
        if (result == "42") {
            if(currentStep == 4) {
                updateStatus(false)
                return
            }
            if(currentStep == 18) {
                updateStatus(false)
                return
            }
            if(currentStep == 30) {
                updateStatus(false)
                return
            }
        }
        if (result == "33") {
            if(currentStep == 5) {
                updateStatus(false)
                return
            }
            if(currentStep == 22) {
                updateStatus(false)
                return
            }
        }
        if (result == "102") {
            if(currentStep == 6) {
                updateStatus(false)
                return
            }
            if(currentStep == 21) {
                updateStatus(false)
                return
            }
        }
        if (result == "86") {
            if(currentStep == 7) {
                updateStatus(false)
                return
            }
            if(currentStep == 19) {
                updateStatus(false)
                return
            }
        }
        if (result == "103") {
            if(currentStep == 8) {
                updateStatus(false)
                return
            }
        }
        if (result == "67") {
            if(currentStep == 9) {
                updateStatus(false)
                return
            }
            if(currentStep == 16) {
                updateStatus(false)
                return
            }
            if(currentStep == 32) {
                updateStatus(false)
                return
            }
        }
        if (result == "32") {
            if(currentStep == 10) {
                updateStatus(false)
                return
            }
        }
        if (result == "66") {
            if(currentStep == 11) {
                updateStatus(false)
                return
            }
            if(currentStep == 24) {
                updateStatus(false)
                return
            }
        }
        if (result == "135") {
            if(currentStep == 12) {
                updateStatus(false)
                return
            }
        }
        if (result == "100") {
            if(currentStep == 13) {
                updateStatus(false)
                return
            }
        }
        if (result == "118") {
            if(currentStep == 14) {
                updateStatus(false)
                return
            }
            if(currentStep == 31) {
                updateStatus(false)
                return
            }
        }
        if (result == "60") {
            if(currentStep == 15) {
                updateStatus(false)
                return
            }
            if(currentStep == 28) {
                updateStatus(false)
                return
            }
            if(currentStep == 34) {
                updateStatus(false)
                return
            }
        }
        if (result == "35") {
            if(currentStep == 17) {
                updateStatus(false)
                return
            }
        }
        if (result == "17") {
            if(currentStep == 20) {
                updateStatus(false)
                return
            }
        }
        if (result == "8") {
            if(currentStep == 25) {
                updateStatus(false)
                return
            }
        }
        if (result == "25") {
            if(currentStep == 26) {
                updateStatus(false)
                return
            }
        }

        keepStatusAndvibrate()
    }

    private fun updateStatus(vibrate: Boolean) {

            currentStep ++
            if(currentStep >= 35) currentStep = 0

        keepStatusAndvibrate(vibrate)
    }

    private fun keepStatusAndvibrate(vibrate: Boolean = true) {
        if(vibrate) vibrate()
            myView.layouteasy.setImageResource(Constants.EASY_ARRAY[currentStep])
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