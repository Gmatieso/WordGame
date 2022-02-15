package com.example.wordguess

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation


class test1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_test1, container, false)
/*
* ask Joe why when you want to get reference of view in the layout to set onclick listener to this test file it doesnt work out right*

 */
        view.press_next1.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.navigateTotest2)}
        return view


    }


}