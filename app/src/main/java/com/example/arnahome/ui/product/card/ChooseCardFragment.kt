package com.example.arnahome.ui.product.card

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.arnahome.R

class ChooseCardFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseCardFragment()
    }

    private lateinit var viewModel: ChooseCardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_choose_card, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChooseCardViewModel::class.java)
        // TODO: Use the ViewModel
    }

}