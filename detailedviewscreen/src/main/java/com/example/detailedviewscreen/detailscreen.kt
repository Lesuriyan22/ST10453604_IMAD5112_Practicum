package com.example.weatherapp

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val weatherDetails = listOf(
            WeatherData("Monday", 12, 25, "Sunny"),
            WeatherData("Tuesday", 15, 29, "Sunny"),
            WeatherData("Wednesday", 5, 16, "Cold"),
            WeatherData("Thursday", 14, 27, "Sunny"),
            WeatherData("Friday", 19, 31, "Hot"),
            WeatherData("Saturday", 21, 33, "Hot"),
            WeatherData("Sunday", 14, 22, "Sunny")
        )

        val weatherStrings = weatherDetails.map { "${it.day}: Min ${it.minTemp}°C, Max ${it.maxTemp}°C, Condition: ${it.condition}" }

        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, weatherStrings)
            listviewweather.adapter = adapter

        val buttonBack = null
        buttonBack.setOnClickListener {
            finish()
        }
    }
}
