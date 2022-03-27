package com.tilak.ratingscaleex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.tilak.ratingscale.RatingScale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ratingScale = findViewById<RatingScale>(R.id.ratingscale)

        ratingScale.setOnRatingListener { rating ->
            Log.d("rating", rating.toString())
        }
    }
}