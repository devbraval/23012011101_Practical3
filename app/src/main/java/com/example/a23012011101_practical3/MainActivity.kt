package com.example.a23012011101_practical3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.content.Intent
import android.net.Uri
import android.provider.AlarmClock
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //url browse
        findViewById<Button>(R.id.weburlButton).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
        //phone number dial
        findViewById<Button>(R.id.phoneButton).setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:6351013995"))
            startActivity(intent)
        }

        //call log open
        findViewById<Button>(R.id.calllogbutton).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("content://call_log/calls")

            }
            startActivity(intent)
        }

        //open gallery
        findViewById<Button>(R.id.gellerybutton).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                type = "image/*"
                data = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            }
            startActivity(intent)
        }

        //open camera

        findViewById<Button>(R.id.camerabutton).setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        //open alaram

        findViewById<Button>(R.id.alarmbutton).setOnClickListener {
            val intent = Intent(AlarmClock.ACTION_SHOW_ALARMS)
            startActivity(intent)
        }
        //login
        findViewById<Button>(R.id.loginbutton).setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}