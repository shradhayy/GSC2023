package com.vishal2376.rebooked.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.vishal2376.rebooked.fragments.nav.main.OrganisationFragment
import com.vishal2376.rebooked.fragments.nav.main.SchoolFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                SchoolFragment()
            }
            1 -> {
                OrganisationFragment()
            }
            else -> {
                SchoolFragment()
            }
        }
    }
}