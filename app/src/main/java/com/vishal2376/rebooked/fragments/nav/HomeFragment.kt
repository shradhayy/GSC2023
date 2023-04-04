package com.vishal2376.rebooked.fragments.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vishal2376.rebooked.MainActivity.Companion.bottomNav
import com.vishal2376.rebooked.R
import com.vishal2376.rebooked.adapters.BookAdapter
import com.vishal2376.rebooked.databinding.FragmentHomeBinding
import com.vishal2376.rebooked.models.Book

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bottomNav.visibility = View.VISIBLE

        handleRecyclerView()
    }

    private fun handleRecyclerView() {
        val temp = listOf<Book>(
            Book("Design Formula", R.drawable.one),
            Book("Mathematics", R.drawable.two),
            Book("Design Formula", R.drawable.three),
            Book("Mathematics", R.drawable.four),
            Book("Normal People", R.drawable.five),
            Book("Memory", R.drawable.six),
            Book("Book Launch", R.drawable.seven)
        )

        binding.rvRecentBooks.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvPopularBooks.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)

        binding.rvRecentBooks.adapter = BookAdapter(requireContext(), temp)
        binding.rvPopularBooks.adapter = BookAdapter(requireContext(), temp)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}