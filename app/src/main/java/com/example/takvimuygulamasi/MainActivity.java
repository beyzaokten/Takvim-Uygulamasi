package com.example.takvimuygulamasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Takvime erişmek için:
        CalendarView takvim =findViewById(R.id.takvim);
        takvim.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Intent intent= new Intent(MainActivity.this , EventActivity.class);
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                intent.putExtra("selectedDate", selectedDate);

                startActivity(intent);
            }
        });
    }
}