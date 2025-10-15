/**
 * Course: MAD204 - Lab 2
 * Student: Ramandeep Singh
 * Student ID: A00194321
 * Date: October 14, 2025
 * Description: This activity displays a personalized greeting and handles logout to return to Login screen.
 */
package com.example.lab2loginapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private var greetingTextView: TextView? = null
    private var logoutButton: Button? = null

    /**
     * Called when the activity is created.
     * @param savedInstanceState saved state
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        greetingTextView = findViewById<TextView?>(R.id.textViewGreeting)
        logoutButton = findViewById<Button?>(R.id.buttonLogout)

        // Retrieve name from intent extras
        val intent = getIntent()
        var name = intent.getStringExtra("USER_NAME")

        // Display greeting message with the user's name
        if (name == null || name.isEmpty()) {
            name = "User"
        }
        greetingTextView!!.setText("Welcome, " + name + "!")

        // Set click listener for logout to finish this activity
        logoutButton!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                finish() // Return to MainActivity
            }
        })
    }
}