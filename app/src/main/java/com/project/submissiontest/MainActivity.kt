package com.project.submissiontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.core.text.set
import com.project.submissiontest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            button.setOnClickListener {
                val input = editTextTextPersonName.text
                textView2.text = input
            }
            button2.setOnClickListener {
                val input = editTextTextPersonName.text
                textView2.text = input
            }
            button3.setOnClickListener {
                val input = editTextTextPersonName.text
                textView2.text = input
            }
            button4.setOnClickListener {
                val input = editTextTextPersonName.text
                textView2.text = input
            }
        }
    }
}

