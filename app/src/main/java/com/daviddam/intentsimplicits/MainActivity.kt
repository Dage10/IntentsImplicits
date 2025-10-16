package com.daviddam.intentsimplicits

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.daviddam.intentsimplicits.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    lateinit var send_button: Button
    lateinit var send_text: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        send_text = findViewById(R.id.send_text)
        send_button = findViewById(R.id.send_button)

        send_button.setOnClickListener {
            val str = send_text.text.toString()
            val intent = Intent(applicationContext,Hola::class.java)

            intent.putExtra("message_key",str)
            startActivity(intent)
        }
    }
}