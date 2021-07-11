package com.example.stoplight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View redBtn = findViewById(R.id.red_circle);
        View yellowBtn = findViewById(R.id.yellow_circle);
        View greenBtn = findViewById(R.id.green_circle);

    }
}