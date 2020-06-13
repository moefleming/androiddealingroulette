package com.DealRoulette.ui.picturebets

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.DealRoulette.R
import com.DealRoulette.ui.picturebets.adapter.ImageAdapter
import kotlinx.android.synthetic.main.fragment_picturebets.*
import java.util.*


class PicturebetsFragment : Fragment() {

    private lateinit var picturebetsViewModel: PicturebetsViewModel
    private var currentPage = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        picturebetsViewModel =
            ViewModelProviders.of(this).get(PicturebetsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_picturebets, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager.adapter = activity?.let {
            ImageAdapter(
                it
            )
        }
        indicator.setupWithViewPager(viewPager)
//        onSlideImages()
    }

    private fun onSlideImages() {
        val handler = Handler()

        var timer = Timer()

        val update = Runnable {
            if (currentPage < 3)
                viewPager?.setCurrentItem(currentPage++, true)
            else timer?.cancel()
        }

        timer.schedule(object : TimerTask() {
            override fun run() {
                handler?.post(update)
            }
        }, 500, 3000)

    }


}
