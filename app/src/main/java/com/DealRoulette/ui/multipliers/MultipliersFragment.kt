package com.DealRoulette.ui.multipliers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.DealRoulette.R
import com.DealRoulette.extensions.CustomViewPager
import com.DealRoulette.ui.multipliers.ui.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*

class MultipliersFragment : Fragment() {
    private lateinit var viewPager: CustomViewPager;
    private lateinit var multipliersViewModel: MultipliersViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        multipliersViewModel =
                ViewModelProviders.of(this).get(MultipliersViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_multipliers, container, false)
//        val textView: TextView = root.findViewById(R.id.text_multipliers)
        viewPager = root.findViewById(R.id.viewPager)

        handleViewPager();
        val bottomNavigationView : BottomNavigationView = root.findViewById(R.id.bn)
        bottomNavigationView.setOnNavigationItemSelectedListener {
                item ->
            when (item.itemId) {
                R.id.item35 -> {
                    if(viewPager.currentItem != 0)
                    viewPager.currentItem = 0;
                }
                R.id.item17 -> {
                    if(viewPager.currentItem != 1)
                    viewPager.currentItem = 1;

                }
                R.id.item11 -> {
                    if(viewPager.currentItem != 2)
                    viewPager.currentItem = 2;

                }
                R.id.item8 ->{
                    if(viewPager.currentItem != 3)
                    viewPager.currentItem = 3;

                }
                R.id.item5->{
                    if(viewPager.currentItem != 4)
                    viewPager.currentItem = 4;

                }
            }
            true
        }

        multipliersViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
        })
        return root
    }

    private fun handleViewPager() {
        val myPagerAdapter = MyPagerAdapter(childFragmentManager)
        myPagerAdapter.fragments.add(ThirtifiveFragment())
        myPagerAdapter.fragments.add(SeventeenFragment())
        myPagerAdapter.fragments.add(ElevenFragment())
        myPagerAdapter.fragments.add(EightFragment())
        myPagerAdapter.fragments.add(FiveFragment())
        viewPager.adapter = myPagerAdapter
    }

    class MyPagerAdapter(fragmentManager: FragmentManager?) :
        FragmentPagerAdapter(fragmentManager!!) {
        val fragments: ArrayList<Fragment>
        // Returns total number of pages
        override fun getCount(): Int {
            return NUM_ITEMS
        }

        // Returns the fragment to display for that page
        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        // Returns the page title for the top indicator
        override fun getPageTitle(position: Int): CharSequence? {
            return "Page $position"
        }

        companion object {
            private const val NUM_ITEMS = 5
        }

        init {
            fragments = ArrayList()
        }
    }

}
