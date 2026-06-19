package com.example.environmenthealthmonitor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import android.graphics.Color

class HistoryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        
        val chart = view.findViewById<LineChart>(R.id.historyChart)
        setupSampleChart(chart)
        
        return view
    }

    private fun setupSampleChart(chart: LineChart?) {
        chart?.let {
            val entries = ArrayList<Entry>()
            // Mock data for temperature over a few hours
            entries.add(Entry(0f, 22f))
            entries.add(Entry(1f, 23.5f))
            entries.add(Entry(2f, 25f))
            entries.add(Entry(3f, 28f))
            entries.add(Entry(4f, 29.4f))
            entries.add(Entry(5f, 27f))
            entries.add(Entry(6f, 26f))

            val dataSet = LineDataSet(entries, "Temperature (°C)")
            dataSet.color = Color.parseColor("#1A6B8A")
            dataSet.setCircleColor(Color.parseColor("#1A6B8A"))
            dataSet.lineWidth = 2.5f
            dataSet.circleRadius = 4f
            dataSet.setDrawCircleHole(false)
            dataSet.setDrawValues(false)
            dataSet.mode = LineDataSet.Mode.CUBIC_BEZIER

            it.data = LineData(dataSet)
            it.description.isEnabled = false
            it.xAxis.setDrawGridLines(false)
            it.axisLeft.setDrawGridLines(true)
            it.axisRight.isEnabled = false
            it.invalidate()
        }
    }
}