package com.example.arnahome.ui.product.productDescriptionUnavailable

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.arnahome.R

class ProductDescriptionUnavailableFragment : Fragment() {

    companion object {
        fun newInstance() = ProductDescriptionUnavailableFragment()
    }

    private lateinit var viewModel: ProductDescriptionUnavailableViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_product_description_unavailable, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProductDescriptionUnavailableViewModel::class.java)
        // TODO: Use the ViewModel
    }

}