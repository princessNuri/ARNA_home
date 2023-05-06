package com.example.arnahome.core.extention

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.fragment.app.Fragment

fun Fragment.hideKeyboard() {
    val imm = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(requireView().windowToken, 0)

}

fun Fragment.setStatusBarColor(color: Int) {
    WindowCompat.setDecorFitsSystemWindows(requireActivity().window, true)
    requireActivity().window.statusBarColor = ContextCompat.getColor(requireActivity(), color)
}