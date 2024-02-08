package com.example.honda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda1)

        val bt11:Button = findViewById(R.id.bt11)
        val bt12:Button = findViewById(R.id.bt12)
        val bt13:Button = findViewById(R.id.bt13)
        val bt14:Button = findViewById(R.id.bt14)

        var numrand: Int = 0

        val receivedIntent = intent


        bt11.setOnClickListener {
            val intent = Intent(this, honda2::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt12.setOnClickListener {
            val intent = Intent(this, honda2::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt13.setOnClickListener {
            val intent = Intent(this, honda2::class.java)
            intent.putExtra("jumeng", numrand +1)
            startActivity(intent)
        }
        bt14.setOnClickListener {
            val intent = Intent(this,  honda2::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)

        }
    }
}

