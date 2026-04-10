package com.example.multipletable20

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.TextView
import androidx.core.view.WindowInsetsCompat

class TablesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tables)

        // get the table number from the bundle
        val bundle: Bundle? = intent. extras
        val tableString: String? = bundle ?. getString (key="tableNumber")

        // convert the table number to an integer
        val tableNumber = tableString?. toInt()

        //display the heading so we can see the value in action
        val multipleTable = findViewById<TextView>(R.id.multiplyTableTextView)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}