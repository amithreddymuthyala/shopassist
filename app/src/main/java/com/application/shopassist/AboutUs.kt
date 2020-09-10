package com.application.shopassist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutUs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        // Action bar
        val actionbar = supportActionBar

        // Set action bar title
        actionbar!!.title = "About us"

        //Set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    // Back button functionality
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
