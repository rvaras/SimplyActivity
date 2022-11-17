package com.example.simplearray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var namesArray: Array<String> = arrayOf("Jenny", "Paul", "Lena", "Gina", "Santos", "Lee", "Ruby",
                                                "Jane", "Gloria", "Denise", "Chuck", "Melissa", "Bonni",
                                                "Araos", "Ines")

        var namesAdapter: ArrayAdapter<String> = ArrayAdapter(this,
                                                                android.R.layout.simple_list_item_1,
                                                                namesArray)

        listview.adapter = namesAdapter

        listview.setOnItemClickListener { parent, view, position, id ->
            var itemname: String = listview.getItemAtPosition(position).toString()
            Toast.makeText(this, "Item Name: $itemname", Toast.LENGTH_SHORT).show()
        }

    }
}