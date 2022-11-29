package com.matur.lsmestudiantes.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.matur.lsmestudiantes.DictSigns
import com.matur.lsmestudiantes.R
import com.matur.lsmestudiantes.RecyclerViewAdapter
import com.matur.lsmestudiantes.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerview = binding.recyclerviewAprender
        recyclerview.layoutManager = LinearLayoutManager(context)
        recyclerview.adapter = RecyclerViewAprenderAdapter(DictSigns.getAllTopics())
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}