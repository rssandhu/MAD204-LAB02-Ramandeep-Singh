/**
 * Course: MAD204 - Lab 2
 * Student:Ramandeep Singh
 * Student ID: A00194321
 * Date: October 14, 2025
 * Description: This is the main activity for the Login app. It collects user input and navigates to Greeting screen.
 */
package com.example.lab2loginapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // Declare UI references
    private var emailEditText: EditText? = null
    private var passwordEditText: EditText? = null
    private var loginButton: Button? = null

    /**
     * Called when the activity is first created.
     * @param savedInstanceState saved state bundle
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize references to views
        emailEditText = findViewById<EditText?>(R.id.editTextEmail)
        passwordEditText = findViewById<EditText?>(R.id.editTextPassword)
        loginButton = findViewById<Button?>(R.id.buttonLogin)

        // Set listener on Login button
        loginButton!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Get user input name/email from EditText
                val name = emailEditText!!.getText().toString().trim { it <= ' ' }

                // Prepare intent to start SecondActivity
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("USER_NAME", name) // Pass the name

                startActivity(intent)
            }
        })
    }
}