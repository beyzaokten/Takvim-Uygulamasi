package com.example.takvimuygulamasi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;



public class AddEventActivity extends AppCompatActivity {

    private EditText eventEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);



        //Tarihi getir
        Intent intent = getIntent();
        String date = intent.getStringExtra("selectedDate");

        setTitle(date);


        //Kaydetme butonu
        Button saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String event = eventEditText.getText().toString();

                //Database girişi yapılmalı.

                // Geri dönüş
                Intent intent = new Intent(AddEventActivity.this, EventActivity.class);
                intent.putExtra("selectedDate", date);
                startActivity(intent);
                finish();
            }
        });
    }
}