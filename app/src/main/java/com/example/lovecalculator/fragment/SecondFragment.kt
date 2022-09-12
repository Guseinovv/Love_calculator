package com.example.lovecalculator.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lovecalculator.databinding.SecondBlankBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class SecondFragment : Fragment() {
private lateinit var binding: SecondBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = SecondBlankBinding.inflate(layoutInflater)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        initClick()
    }
//    private fun initClick() {
//        binding.tryAgainBtn.setOnClickListener {
//            findNavController().navigateUp()

        }






