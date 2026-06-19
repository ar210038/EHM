package com.example.environmenthealthmonitor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        
        // Populate Health Risk Score
        view.findViewById<ProgressBar>(R.id.scoreRing)?.progress = 72
        view.findViewById<TextView>(R.id.scoreValue)?.text = "72"
        view.findViewById<TextView>(R.id.scoreLabel)?.text = "High Risk"
        view.findViewById<TextView>(R.id.causeText)?.text = "Mainly due to Air Quality (AQI 162)"
        view.findViewById<TextView>(R.id.suggestionText)?.text = "Open a window or move to a ventilated area until air quality improves."

        // Populate Live Readings with manual values
        view.findViewById<TextView>(R.id.tempValue)?.text = "29.4°C"
        view.findViewById<TextView>(R.id.humidityValue)?.text = "78%"
        view.findViewById<TextView>(R.id.aqiValue)?.text = "162 AQI"
        view.findViewById<TextView>(R.id.noiseValue)?.text = "54 dB"

        return view
    }
}