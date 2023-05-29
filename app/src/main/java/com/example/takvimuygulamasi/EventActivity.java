package com.example.takvimuygulamasi;
import com.example.takvimuygulamasi.AddEventActivity;

import static com.example.takvimuygulamasi.R.id.date_textView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


        TextView dateTextView = findViewById(date_textView);
        Intent intent = getIntent();
        String date = intent.getStringExtra("selectedDate");
        dateTextView.setText(date);


        // Özel gün ekleme butonu
        Button addEventButton = findViewById(R.id.add_event_button);
        addEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventActivity.this, AddEventActivity.class);
                intent.putExtra("selectedDate", date);
                startActivity(intent);
            }
        });

        // Geri dönüş butonu
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}