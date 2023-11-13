package com.example.veryfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Job extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job);

        textView = findViewById(R.id.jobTextView);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        textView.setText(userName);
    }
}
