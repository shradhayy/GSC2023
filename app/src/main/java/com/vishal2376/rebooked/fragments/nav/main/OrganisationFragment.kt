package com.vishal2376.rebooked.fragments.nav.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vishal2376.rebooked.adapters.OrgAdapter
import com.vishal2376.rebooked.databinding.FragmentOrganisationBinding
import com.vishal2376.rebooked.models.Org


class OrganisationFragment : Fragment() {

    private var _binding: FragmentOrganisationBinding? = null
    private val binding: FragmentOrganisationBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOrganisationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val temp = listOf<Org>(
            Org("Nescafe", "NIT Hamirpur"),
            Org("Amul", "NIT Hamirpur"),
            Org("HPMC", "NIT Hamirpur"),
            Org("Hiteshi", "NIT Hamirpur"),
            Org("NBH", "NIT Hamirpur"),
            Org("Pantanjali", "NIT Hamirpur"),
            Org("Amul", "NIT Hamirpur"),
            Org("HPMC", "NIT Hamirpur"),
            Org("Hiteshi", "NIT Hamirpur"),
            Org("NBH", "NIT Hamirpur"),
            Org("HPMC", "NIT Hamirpur"),
            Org("Hiteshi", "NIT Hamirpur"),
            Org("NBH", "NIT Hamirpur"),
            Org("Pantanjali", "NIT Hamirpur"),
            Org("Amul", "NIT Hamirpur"),
            Org("Pantanjali", "NIT Hamirpur"),
            Org("Amul", "NIT Hamirpur"),
            Org("HPMC", "NIT Hamirpur"),
            Org("HPMC", "NIT Hamirpur"),
            Org("Hiteshi", "NIT Hamirpur")
        )

        binding.rvOrganisation.layoutManager = LinearLayoutManager(requireContext())
        binding.rvOrganisation.adapter = OrgAdapter(requireContext(), temp)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}