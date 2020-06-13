package com.DealRoulette.ui.medium

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
import kotlinx.android.synthetic.main.fragment_medium.view.*
import kotlinx.android.synthetic.main.fragment_thirtifive.view.*
import kotlinx.android.synthetic.main.fragment_thirtifive.view.answerfield


/**
 * A simple [Fragment] subclass.
 */
class MediumFragment : Fragment() {

    private lateinit var myView: View
    private var currentStep = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_medium, container, false)
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

        if (result == "60") {
            if(currentStep == 0) {
                updateStatus(false)
                return
            }
        }
        if (result == "69") {
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
            if(currentStep == 29) {
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
        if (result == "103") {
            if(currentStep == 4) {
                updateStatus(false)
                return
            }
        }
        if (result == "67") {
            if(currentStep == 5) {
                updateStatus(false)
                return
            }
        }
        if (result == "102") {
            if(currentStep == 6) {
                updateStatus(false)
                return
            }
        }
        if (result == "66") {
            if(currentStep == 7) {
                updateStatus(false)
                return
            }
            if(currentStep == 14) {
                updateStatus(false)
                return
            }
        }
        if (result == "33") {
            if(currentStep == 8) {
                updateStatus(false)
                return
            }
        }
        if (result == "16") {
            if(currentStep == 9) {
                updateStatus(false)
                return
            }
        }
        if (result == "104") {
            if(currentStep == 10) {
                updateStatus(false)
                return
            }
        }
        if (result == "154") {
            if(currentStep == 11) {
                updateStatus(false)
                return
            }
            if(currentStep == 19) {
                updateStatus(false)
                return
            }
        }
        if (result == "84") {
            if(currentStep == 12) {
                updateStatus(false)
                return
            }
            if(currentStep == 13) {
                updateStatus(false)
                return
            }
        }
        if (result == "134") {
            if(currentStep == 15) {
                updateStatus(false)
                return
            }
        }
        if (result == "204") {
            if(currentStep == 16) {
                updateStatus(false)
                return
            }
            if(currentStep == 37) {
                updateStatus(false)
                return
            }
        }
        if (result == "70") {
            if(currentStep == 17) {
                updateStatus(false)
                return
            }
        }
        if (result == "138") {
            if(currentStep == 18) {
                updateStatus(false)
                return
            }
        }
        if (result == "153") {
            if(currentStep == 20) {
                updateStatus(false)
                return
            }
            if(currentStep == 25) {
                updateStatus(false)
                return
            }
        }
        if (result == "75") {
            if(currentStep == 21) {
                updateStatus(false)
                return
            }
        }
        if (result == "99") {
            if(currentStep == 22) {
                updateStatus(false)
                return
            }
        }
        if (result == "255") {
            if(currentStep == 23) {
                updateStatus(false)
                return
            }
        }
        if (result == "201") {
            if(currentStep == 24) {
                updateStatus(false)
                return
            }
        }
        if (result == "126") {
            if(currentStep == 26) {
                updateStatus(false)
                return
            }
        }
        if (result == "180") {
            if(currentStep == 27) {
                updateStatus(false)
                return
            }
        }
        if (result == "105") {
            if(currentStep == 28) {
                updateStatus(false)
                return
            }
        }
        if (result == "100") {
            if(currentStep == 30) {
                updateStatus(false)
                return
            }
        }
        if (result == "164") {
            if(currentStep == 31) {
                updateStatus(false)
                return
            }
        }
        if (result == "276") {
            if(currentStep == 32) {
                updateStatus(false)
                return
            }
        }
        if (result == "408") {
            if(currentStep == 33) {
                updateStatus(false)
                return
            }
            if(currentStep == 56) {
                updateStatus(false)
                return
            }
            if(currentStep == 79) {
                updateStatus(false)
                return
            }
        }
        if (result == "200") {
            if(currentStep == 34) {
                updateStatus(false)
                return
            }
            if(currentStep == 70) {
                updateStatus(false)
                return
            }
        }
        if (result == "140") {
            if(currentStep == 35) {
                updateStatus(false)
                return
            }
        }
        if (result == "172") {
            if(currentStep == 36) {
                updateStatus(false)
                return
            }
        }
        if (result == "268") {
            if(currentStep == 38) {
                updateStatus(false)
                return
            }
        }
        if (result == "132") {
            if(currentStep == 39) {
                updateStatus(false)
                return
            }
        }
        if (result == "85") {
            if(currentStep == 40) {
                updateStatus(false)
                return
            }
        }
        if (result == "210") {
            if(currentStep == 41) {
                updateStatus(false)
                return
            }
            if(currentStep == 53) {
                updateStatus(false)
                return
            }
        }
        if (result == "345") {
            if(currentStep == 42) {
                updateStatus(false)
                return
            }
        }
        if (result == "425") {
            if(currentStep == 43) {
                updateStatus(false)
                return
            }
        }
        if (result == "510") {
            if(currentStep == 44) {
                updateStatus(false)
                return
            }
            if(currentStep == 95) {
                updateStatus(false)
                return
            }
        }
        if (result == "175") {
            if(currentStep == 45) {
                updateStatus(false)
                return
            }
        }
        if (result == "260") {
            if(currentStep == 46) {
                updateStatus(false)
                return
            }
        }
        if (result == "300") {
            if(currentStep == 47) {
                updateStatus(false)
                return
            }
            if(currentStep == 59) {
                updateStatus(false)
                return
            }
        }
        if (result == "295") {
            if(currentStep == 48) {
                updateStatus(false)
                return
            }
        }
        if (result == "385") {
            if(currentStep == 49) {
                updateStatus(false)
                return
            }
        }
        if (result == "48") {
            if(currentStep == 50) {
                updateStatus(false)
                return
            }
        }
        if (result == "258") {
            if(currentStep == 51) {
                updateStatus(false)
                return
            }
        }
        if (result == "306") {
            if(currentStep == 52) {
                updateStatus(false)
                return
            }
        }
        if (result == "252") {
            if(currentStep == 54) {
                updateStatus(false)
                return
            }
        }
        if (result == "198") {
            if(currentStep == 55) {
                updateStatus(false)
                return
            }
        }
        if (result == "360") {
            if(currentStep == 57) {
                updateStatus(false)
                return
            }
        }
        if (result == "150") {
            if(currentStep == 58) {
                updateStatus(false)
                return
            }
        }
        if (result == "238") {
            if(currentStep == 60) {
                updateStatus(false)
                return
            }
        }
        if (result == "357") {
            if(currentStep == 61) {
                updateStatus(false)
                return
            }
        }
        if (result == "364") {
            if(currentStep == 62) {
                updateStatus(false)
                return
            }
        }
        if (result == "539") {
            if(currentStep == 63) {
                updateStatus(false)
                return
            }
            if(currentStep == 68) {
                updateStatus(false)
                return
            }
        }
        if (result == "245") {
            if(currentStep == 64) {
                updateStatus(false)
                return
            }
        }
        if (result == "483") {
            if(currentStep == 65) {
                updateStatus(false)
                return
            }
        }
        if (result == "602") {
            if(currentStep == 66) {
                updateStatus(false)
                return
            }
        }
        if (result == "294") {
            if(currentStep == 67) {
                updateStatus(false)
                return
            }
        }
        if (result == "119") {
            if(currentStep == 69) {
                updateStatus(false)
                return
            }
        }
        if (result == "264") {
            if(currentStep == 71) {
                updateStatus(false)
                return
            }
        }
        if (result == "128") {
            if(currentStep == 72) {
                updateStatus(false)
                return
            }
        }
        if (result == "344") {
            if(currentStep == 73) {
                updateStatus(false)
                return
            }
        }
        if (result == "280") {
            if(currentStep == 74) {
                updateStatus(false)
                return
            }
        }
        if (result == "480") {
            if(currentStep == 75) {
                updateStatus(false)
                return
            }
        }
        if (result == "552") {
            if(currentStep == 76) {
                updateStatus(false)
                return
            }
        }
        if (result == "616") {
            if(currentStep == 77) {
                updateStatus(false)
                return
            }
        }
        if (result == "400") {
            if(currentStep == 78) {
                updateStatus(false)
                return
            }
        }
        if (result == "72") {
            if(currentStep == 80) {
                updateStatus(false)
                return
            }
        }
        if (result == "225") {
            if(currentStep == 81) {
                updateStatus(false)
                return
            }
        }
        if (result == "450") {
            if(currentStep == 82) {
                updateStatus(false)
                return
            }
        }
        if (result == "603") {
            if(currentStep == 83) {
                updateStatus(false)
                return
            }
        }
        if (result == "918") {
            if(currentStep == 84) {
                updateStatus(false)
                return
            }
        }
        if (result == "378") {
            if(currentStep == 85) {
                updateStatus(false)
                return
            }
        }
        if (result == "315") {
            if(currentStep == 86) {
                updateStatus(false)
                return
            }
        }
        if (result == "468") {
            if(currentStep == 87) {
                updateStatus(false)
                return
            }
        }
        if (result == "540") {
            if(currentStep == 88) {
                updateStatus(false)
                return
            }
        }
        if (result == "693") {
            if(currentStep == 89) {
                updateStatus(false)
                return
            }
        }
        if (result == "520") {
            if(currentStep == 90) {
                updateStatus(false)
                return
            }
        }
        if (result == "600") {
            if(currentStep == 91) {
                updateStatus(false)
                return
            }
        }
        if (result == "770") {
            if(currentStep == 92) {
                updateStatus(false)
                return
            }
        }
        if (result == "350") {
            if(currentStep == 93) {
                updateStatus(false)
                return
            }
        }
        if (result == "690") {
            if(currentStep == 94) {
                updateStatus(false)
                return
            }
        }
        if (result == "680") {
            if(currentStep == 96) {
                updateStatus(false)
                return
            }
        }
        if (result == "500") {
            if(currentStep == 97) {
                updateStatus(false)
                return
            }
        }
        if (result == "250") {
            if(currentStep == 98) {
                updateStatus(false)
                return
            }
        }
        if (result == "330") {
            if(currentStep == 99) {
                updateStatus(false)
                return
            }
        }

        keepStatusAndvibrate()
    }

    private fun updateStatus(vibrate: Boolean) {

        currentStep ++
        if(currentStep >= 100) currentStep = 0

        keepStatusAndvibrate(vibrate)
    }

    private fun keepStatusAndvibrate(vibrate: Boolean = true) {
        if(vibrate) vibrate()
        myView.layoutmedium.setImageResource(Constants.MEDIUM_ARRAY[currentStep])
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