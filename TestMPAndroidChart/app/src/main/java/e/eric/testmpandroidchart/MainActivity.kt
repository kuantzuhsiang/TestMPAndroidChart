package e.eric.testmpandroidchart

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.listener.OnChartValueSelectedListener
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = "MainActivity"
    }

    private var fire: Int = 0
    private var white: Int = 0
    private var coal: Int = 0

    private var str: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fire = ContextCompat.getColor(this, R.color.fire)
        white = ContextCompat.getColor(this, R.color.white)
        coal = ContextCompat.getColor(this, R.color.translucentCoal)

        val forceData = ArrayList<Entry>()
        val distData = ArrayList<Entry>()
        val chart: LineChart = ui_chart
        val text: TextView = reading

        for (i in 0..100) {
            val time: Float = i.toFloat()
            val force: Float = Random.nextFloat() * 1000.0f
            val dist: Float = Random.nextFloat() * 1000 % 100
            forceData.add(Entry(time, force, null))
            distData.add(Entry(time, dist, null))
        }

        val lineForceData = LineDataSet(forceData, "Force")
        val lineDistData = LineDataSet(distData, "Distribution")

        lineForceData.color = fire
        lineForceData.setDrawCircles(false)
        lineForceData.axisDependency = chart.axisLeft.axisDependency

        lineDistData.color = coal
        lineDistData.setDrawCircles(false)
        lineDistData.axisDependency = chart.axisRight.axisDependency
        lineDistData.enableDashedLine(5f, 5f, 1000f)

        chart.data = LineData(lineForceData, lineDistData)
        chart.setBackgroundColor(white)
        chart.axisLeft.setDrawGridLines(false)
        chart.axisLeft.axisMinimum = 0f
        chart.axisRight.setDrawGridLines(false)
        chart.axisRight.axisMinimum = 0f
        chart.axisRight.setDrawZeroLine(true)
        chart.xAxis.setDrawLabels(false)
        chart.xAxis.setDrawGridLines(false)
        chart.description = null
        chart.highlighter

        chart.setOnChartValueSelectedListener(object : OnChartValueSelectedListener {
            override fun onValueSelected(e: Entry?, h: Highlight?) {
                if (e is Entry) {
                    val time = e.x
                    val force = e.y
                    var dist: Float = 0f

                    for (item in distData) {
                        if (item.x == time) {
                            dist = item.y
                        }
                    }

                    Log.d(TAG, "Time: $time, Force: ${force}N, Dist: ${dist}%")
                    str = "Time: $time, Force: $force, Dist: $dist"
                    text.text = str
                }
            }

            override fun onNothingSelected() {
                str = R.string.no_points_selected.toString()
                text.text = str
            }
        })

    }
}