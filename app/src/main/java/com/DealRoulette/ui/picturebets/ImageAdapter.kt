package com.DealRoulette.ui.picturebets.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.DealRoulette.R

class ImageAdapter(var context: Context) :
    PagerAdapter() {
    private val images = intArrayOf(
        R.drawable.deckofcards,
        R.drawable.deckofcardsover,
        R.drawable.mickeymouseears,
        R.drawable.mickeymouseearssplits,
        R.drawable.dinnerfortwo,
        R.drawable.tpattern,
        R.drawable.jesusage,
        R.drawable.doublejesusage,
        R.drawable.railroad,
        R.drawable.hpattern,
        R.drawable.pictureframe,
        R.drawable.fullhouse,
        R.drawable.cross,
        R.drawable.xpattern,
        R.drawable.insidel,
        R.drawable.outsidel,
        R.drawable.box,
        R.drawable.cornerpocket,
        R.drawable.comingofage,
        R.drawable.allin
    )

    var layoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(
        view: View,
        `object`: Any
    ): Boolean {
        return view === `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemView =
            layoutInflater.inflate(R.layout.item_picturebets, container, false)
        val imageView =
            itemView.findViewById<View>(R.id.imageView) as ImageView
        imageView.setImageResource(images[position])
        container.addView(itemView)
        return itemView
    }

    override fun destroyItem(
        container: ViewGroup,
        position: Int,
        `object`: Any
    ) {
        container.removeView(`object` as LinearLayout)
    }

}