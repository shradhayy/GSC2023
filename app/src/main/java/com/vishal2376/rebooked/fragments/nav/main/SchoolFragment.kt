package com.vishal2376.rebooked.fragments.nav.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vishal2376.rebooked.adapters.OrgAdapter
import com.vishal2376.rebooked.databinding.FragmentSchoolBinding
import com.vishal2376.rebooked.models.Org

class SchoolFragment : Fragment() {

    private var _binding: FragmentSchoolBinding? = null
    private val binding: FragmentSchoolBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSchoolBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val temp = listOf<Org>(
            Org("Mark", "NIT Hamirpur"),
            Org("Joker", "IGI Tanda"),
            Org("Pantanjali", "NIT Hamirpur"),
            Org("Hitesh", "Kal aana,Himachal Pradesh"),
            Org("Chris", "NIT ANU"),
            Org("Ninja Hathori", "NIT Hamirpur"),
            Org("Batman", "HPMC Kangra"),
            Org("Joker", "IGI Tanda"),
            Org("Pantanjali", "NIT Hamirpur"),
            Org("Hitesh", "Kal aana,Himachal Pradesh"),
            Org("Pandey", "Maharastra Police"),
            Org("Chris", "NIT ANU"),
            Org("Ninja Hathori", "NIT Hamirpur"),
            Org("Batman", "HPMC Kangra"),
            Org("Joker", "IGI Tanda"),
            Org("Pantanjali", "NIT Hamirpur"),
            Org("Hitesh", "Kal aana,Himachal Pradesh"),
            Org("Pandey", "Maharastra Police"),
            Org("Manoj", "NIT Hamirpur")
        )

        binding.rvSchool.layoutManager = LinearLayoutManager(requireContext())
        binding.rvSchool.adapter = OrgAdapter(requireContext(), temp)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}