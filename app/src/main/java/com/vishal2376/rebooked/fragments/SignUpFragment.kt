package com.vishal2376.rebooked.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vishal2376.rebooked.R
import com.vishal2376.rebooked.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding: FragmentSignUpBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCreateAccount.setOnClickListener {
            createAccount()
        }
    }

    private fun createAccount() {
        Toast.makeText(requireContext(), "Account Created Successfully", Toast.LENGTH_SHORT).show()
        findNavController().navigate(R.id.action_signUpFragment_to_homeFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}