package com.example.environmenthealthmonitor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import android.graphics.Color

class ReportsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_reports, container, false)
        
        val chart = view.findViewById<LineChart>(R.id.riskTrendChart)
        setupSampleChart(chart)
        
        return view
    }

    private fun setupSampleChart(chart: LineChart?) {
        chart?.let {
            val entries = ArrayList<Entry>()
            entries.add(Entry(0f, 40f))
            entries.add(Entry(1f, 45f))
            entries.add(Entry(2f, 38f))
            entries.add(Entry(3f, 50f))
            entries.add(Entry(4f, 72f))
            entries.add(Entry(5f, 65f))
            entries.add(Entry(6f, 55f))

            val dataSet = LineDataSet(entries, "Health Risk Score")
            dataSet.color = Color.parseColor("#993C1D")
            dataSet.setCircleColor(Color.parseColor("#993C1D"))
            dataSet.lineWidth = 2f
            dataSet.setDrawValues(false)
            dataSet.mode = LineDataSet.Mode.CUBIC_BEZIER

            it.data = LineData(dataSet)
            it.description.isEnabled = false
            it.legend.isEnabled = false
            it.xAxis.setDrawGridLines(false)
            it.axisLeft.setDrawGridLines(true)
            it.axisRight.isEnabled = false
            it.invalidate()
        }
    }
}