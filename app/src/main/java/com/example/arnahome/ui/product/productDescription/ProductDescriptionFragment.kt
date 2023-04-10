package com.example.arnahome.ui.product.productDescription

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.arnahome.R

class ProductDescriptionFragment : Fragment() {

    companion object {
        fun newInstance() = ProductDescriptionFragment()
    }

    private lateinit var viewModel: ProductDescriptionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_product_description, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProductDescriptionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}