package com.yetsdmr.kotlinmultiautocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val items : List<String> = listOf("Apple","Banana","Corrot","Pototo","Germany","France","Jacob","Istanbul")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items)
        mactvAutoComplete.setAdapter(adapter)
        mactvAutoComplete.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())

    }
}