package com.example.perfectweather.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.perfectweather.R


class CitySelectionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val viewCity=inflater.inflate(R.layout.fragment_city_selection, container, false)

        return viewCity
    }


}