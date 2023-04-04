package com.vishal2376.rebooked.fragments.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.vishal2376.rebooked.R
import com.vishal2376.rebooked.databinding.FragmentUploadBinding


class UploadFragment : Fragment() {


    private var _binding: FragmentUploadBinding? = null
    private val binding: FragmentUploadBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUploadBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryAdapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            resources.getStringArray(R.array.book_categories)
        )
        binding.dropdown.setAdapter(categoryAdapter)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}