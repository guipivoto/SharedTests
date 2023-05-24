package com.anandroiddev.sharedtests.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.anandroiddev.sharedtests.home.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    private var clicks: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val binding = HomeFragmentBinding.inflate(inflater, container, false)
        binding.clickMeButton.setOnClickListener {
            binding.clickAmountText.text = (++clicks).toString()
        }
        return binding.root
    }
}
