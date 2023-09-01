package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel  // Asegúrate de que MainViewModel esté importado

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText1 = findViewById<EditText>(R.id.editTextText)
        val editText2 = findViewById<EditText>(R.id.editTextText2)
        val textView = findViewById<TextView>(R.id.textView)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        button.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()
            val result = viewModel.compareStrings(text1, text2)
            textView.text = result
        }
    }
}
