package com.example.dobcalc

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnDatePicker: Button = findViewById(R.id.btnDatePicker);
        btnDatePicker.setOnClickListener {
            clickDatePicker();
        }

    }

    private fun clickDatePicker() {
        val myCalendar = Calendar.getInstance();
        val year = myCalendar.get(Calendar.YEAR);
        val month = myCalendar.get(Calendar.MONTH);
        val day = myCalendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{view,selectedYear,selectedMonth,selectedDayofMonth ->
                Toast.makeText(this, "Year was $selectedYear, Month was ${selectedMonth+ 1}, Day of month was $selectedDayofMonth", Toast.LENGTH_SHORT).show();

            },
            year,
            month,
            day
            ).show()


    }
}



