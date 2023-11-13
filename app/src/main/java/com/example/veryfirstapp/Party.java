package com.example.veryfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Party extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.party);

        textView = findViewById(R.id.partyUserName);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        textView.setText(userName);

    }
}
