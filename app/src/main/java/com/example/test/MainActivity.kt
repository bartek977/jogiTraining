package com.example.test

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //nasz edit text gdzie użytkownik wpisuje co wyszukać
    lateinit var queryEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        queryEditText = findViewById(R.id.query)
    }

    //funkcja, która się wykona po kliknięciu w button
    //ustawiamy ją w layout->button-> wartość onClick
    fun klik(view: View) {

        val intent = Intent()

        val query = queryEditText.text.toString() // <- pobieramy treść z edit texu
        val url = "https://www.google.com/search?q=$query" // <- doklejamy treść do wyszukania google
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)

    }
}