package com.DealRoulette.ui.multipliers.ui

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
import kotlinx.android.synthetic.main.fragment_seventeen.view.*
import kotlinx.android.synthetic.main.fragment_thirtifive.view.*
import kotlinx.android.synthetic.main.fragment_thirtifive.view.answerfield
import kotlinx.android.synthetic.main.fragment_thirtifive.view.chipimageview
import kotlinx.android.synthetic.main.fragment_thirtifive.view.inorderbutton
import kotlinx.android.synthetic.main.fragment_thirtifive.view.randombutton
import kotlinx.android.synthetic.main.fragment_thirtifive.view.straightup


/**
 * A simple [Fragment] subclass.
 */
class SeventeenFragment : Fragment() {

    private lateinit var myView: View
    private var currentStep = 0
    private var isRandom = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_seventeen, container, false)
        myView = view

        // Set up UIs.
        setupAnswerField()
        setupBtns()

        return view

    }

    private fun setupBtns() {
        myView.hidehintsbutton17.setImageResource(R.drawable.buttonpressed)
        myView.showhintsbutton17.setImageResource(R.drawable.buttonnotpressed)
        myView.layoutseventeentoone17.visibility =View.GONE
        myView.randombutton.setOnClickListener {
            isRandom = true

            currentStep = -1
            updateStatus(false)
            myView.randombutton.setImageResource(R.drawable.buttonpressed)
            myView.inorderbutton.setImageResource(R.drawable.buttonnotpressed)
        }

        myView.inorderbutton.setOnClickListener {
            isRandom = false

            currentStep = -1
            updateStatus(false)
            myView.randombutton.setImageResource(R.drawable.buttonnotpressed)
            myView.inorderbutton.setImageResource(R.drawable.buttonpressed)
        }

        myView.hidehintsbutton17.setOnClickListener {
            myView.hidehintsbutton17.setImageResource(R.drawable.buttonpressed)
            myView.showhintsbutton17.setImageResource(R.drawable.buttonnotpressed)
            myView.layoutseventeentoone17.visibility =View.GONE
        }
        myView.showhintsbutton17.setOnClickListener {
            myView.hidehintsbutton17.setImageResource(R.drawable.buttonnotpressed)
            myView.showhintsbutton17.setImageResource(R.drawable.buttonpressed)
            myView.layoutseventeentoone17.visibility =View.VISIBLE
        }
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

        if(isRandom) {
            randomCaseCheck(result)
            return
        }

        if (result == "17") {
            if(currentStep == 0) {
                updateStatus(false)
                return
            }
        }
        if (result == "34") {
            if(currentStep == 1) {
                updateStatus(false)
                return
            }
        }
        if (result == "51") {
            if(currentStep == 2) {
                updateStatus(false)
                return
            }
        }
        if (result == "68") {
            if(currentStep == 3) {
                updateStatus(false)
                return
            }
        }
        if (result == "85") {
            if(currentStep == 4) {
                updateStatus(false)
                return
            }
        }
        if (result == "102") {
            if(currentStep == 5) {
                updateStatus(false)
                return
            }
        }
        if (result == "119") {
            if(currentStep == 6) {
                updateStatus(false)
                return
            }
        }
        if (result == "136") {
            if(currentStep == 7) {
                updateStatus(false)
                return
            }
        }
        if (result == "153") {
            if(currentStep == 8) {
                updateStatus(false)
                return
            }
        }
        if (result == "170") {
            if(currentStep == 9) {
                updateStatus(false)
                return
            }
        }
        if (result == "187") {
            if(currentStep == 10) {
                updateStatus(false)
                return
            }
        }
        if (result == "204") {
            if(currentStep == 11) {
                updateStatus(false)
                return
            }
        }
        if (result == "221") {
            if(currentStep == 12) {
                updateStatus(false)
                return
            }
        }
        if (result == "238") {
            if(currentStep == 13) {
                updateStatus(false)
                return
            }
        }
        if (result == "255") {
            if(currentStep == 14) {
                updateStatus(false)
                return
            }
        }
        if (result == "272") {
            if(currentStep == 15) {
                updateStatus(false)
                return
            }
        }
        if (result == "289") {
            if(currentStep == 16) {
                updateStatus(false)
                return
            }
        }
        if (result == "306") {
            if(currentStep == 17) {
                updateStatus(false)
                return
            }
        }
        if (result == "323") {
            if(currentStep == 18) {
                updateStatus(false)
                return
            }
        }
        if (result == "340") {
            if(currentStep == 19) {
                updateStatus(false)
                return
            }
        }

        keepStatusAndvibrate()
    }

    private fun randomCaseCheck(result: String) {
        if( result == "340") {
            if(currentStep == 0) {
                updateStatus(false)
                return
            }
        }
        if( result == "187") {
            if(currentStep == 1) {
                updateStatus(false)
                return
            }
        }
        if( result == "119") {
            if(currentStep == 2) {
                updateStatus(false)
                return
            }
        }
        if( result == "68") {
            if(currentStep == 3) {
                updateStatus(false)
                return
            }
        }
        if( result == "272") {
            if(currentStep == 4) {
                updateStatus(false)
                return
            }
        }
        if( result == "170") {
            if(currentStep == 5) {
                updateStatus(false)
                return
            }
        }
        if( result == "323") {
            if(currentStep == 6) {
                updateStatus(false)
                return
            }
        }
        if( result == "255") {
            if(currentStep == 7) {
                updateStatus(false)
                return
            }
        }
        if( result == "17") {
            if(currentStep == 8) {
                updateStatus(false)
                return
            }
        }
        if( result == "102") {
            if(currentStep == 9) {
                updateStatus(false)
                return
            }
        }
        if( result == "153") {
            if(currentStep == 10) {
                updateStatus(false)
                return
            }
        }
        if( result == "289") {
            if(currentStep == 11) {
                updateStatus(false)
                return
            }
        }
        if( result == "306") {
            if(currentStep == 12) {
                updateStatus(false)
                return
            }
        }
        if( result == "34") {
            if(currentStep == 13) {
                updateStatus(false)
                return
            }
        }
        if( result == "85") {
            if(currentStep == 14) {
                updateStatus(false)
                return
            }
        }
        if( result == "221") {
            if(currentStep == 15) {
                updateStatus(false)
                return
            }
        }
        if( result == "136") {
            if(currentStep == 16) {
                updateStatus(false)
                return
            }
        }
        if( result == "51") {
            if(currentStep == 17) {
                updateStatus(false)
                return
            }
        }
        if( result == "238") {
            if(currentStep == 18) {
                updateStatus(false)
                return
            }
        }
        if( result == "204") {
            if(currentStep == 19) {
                updateStatus(false)
                return
            }
        }

        keepStatusAndvibrate()
    }

    private fun updateStatus(vibrate: Boolean) {


        if (isRandom) {
            currentStep ++
            if(currentStep >= 20) currentStep = 0
        } else {
            currentStep ++
            if(currentStep >= 20) currentStep = 0
        }


        keepStatusAndvibrate(vibrate)
    }

    private fun keepStatusAndvibrate(vibrate: Boolean = true) {
        if(vibrate) vibrate()
        if (isRandom) {
            myView.chipimageview.setImageResource(Constants.RANDOM_ARRAY[currentStep])
            myView.answerfield.setText("")
            myView.straightup.setText(Constants.RANDOMSTRAIGHTUP_STEPS[currentStep])
        } else {
            myView.chipimageview.setImageResource(Constants.THIRTIFIVE_ARRAY[currentStep])
            myView.answerfield.setText("")
            myView.straightup.setText(Constants.STRAIGHTUP_STEPS[currentStep])
        }

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
