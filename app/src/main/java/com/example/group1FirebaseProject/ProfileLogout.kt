package com.example.group1FirebaseProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.R


class ProfileLogout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_logout)



        class ProfileActivity : AppCompatActivity() {

            private lateinit var btnExit: Button
            private lateinit var btnChangePassword: Button

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.profile_layout)

                btnExit = findViewById(R.id.btnExit)
                btnChangePassword = findViewById(R.id.btnChangePassword)

                btnExit.setOnClickListener {
                    finish() // Finish the current activity to exit the application
                }

                btnChangePassword.setOnClickListener {

                }
            }
        }
    }
}


class UpdatePasswordActivity : AppCompatActivity() {

    private lateinit var etCurrentPassword: EditText
    private lateinit var etNewPassword: EditText
    private lateinit var etConfirmPassword: EditText
    private lateinit var btnUpdatePassword: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_password)

        etCurrentPassword = findViewById(R.id.etCurrentPassword)
        etNewPassword = findViewById(R.id.etNewPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        btnUpdatePassword = findViewById(R.id.btnUpdatePassword)

        btnUpdatePassword.setOnClickListener {
            updatePassword()
        }
    }

    private fun updatePassword() {
        val currentPassword = etCurrentPassword.text.toString()
        val newPassword = etNewPassword.text.toString()
        val confirmPassword = etConfirmPassword.text.toString()

        if (newPassword != confirmPassword) {
            Toast.makeText(this, "New password and confirm password do not match.", Toast.LENGTH_SHORT).show()
            return
        }


        if (currentPassword.isEmpty()) {
            Toast.makeText(this, "Please enter your current password.", Toast.LENGTH_SHORT).show()
            return
        }

        if (newPassword.isEmpty()) {
            Toast.makeText(this, "Please enter a new password.", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(this, "Password updated successfully.", Toast.LENGTH_SHORT).show()
        finish()
    }
}


