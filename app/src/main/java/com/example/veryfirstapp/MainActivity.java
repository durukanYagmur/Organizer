package com.example.veryfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String name;
    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.nameEdit);
        name = "";
    }

    public void goHomeMate(View view){

        name = editName.getText().toString();

        Intent intent = new Intent(MainActivity.this,HomeMate.class);
        intent.putExtra("userName",name);

        startActivity(intent);
    }

    public void goJobs(View view){

        name = editName.getText().toString();

        Intent intent = new Intent(MainActivity.this,Job.class);
        intent.putExtra("userName",name);
        startActivity(intent);

    }

    public void goParty(View view){

        name = editName.getText().toString();
        Intent intent = new Intent(MainActivity.this,Party.class);
        intent.putExtra("userName",name);
        startActivity(intent);
    }
}