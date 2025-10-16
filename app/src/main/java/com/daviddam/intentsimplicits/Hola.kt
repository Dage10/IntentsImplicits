package com.daviddam.intentsimplicits

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.daviddam.intentsimplicits.databinding.ActivityHolaBinding
import com.daviddam.intentsimplicits.databinding.ActivityMainBinding

class Hola : AppCompatActivity() {
    lateinit var binding : ActivityHolaBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHolaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var missatge = intent.getStringExtra("message_key")

        binding.receivedValueId.text = missatge

    }
}