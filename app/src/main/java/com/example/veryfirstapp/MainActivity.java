package com.example.veryfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;
    EditText editName;
    TextView textView;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editName = findViewById(R.id.nameEdit);
        name = "";
        sharedPreferences = this.getSharedPreferences("com.example.veryfirstapp", Context.MODE_PRIVATE);
        String storedName = sharedPreferences.getString("storedName", "name");

        if(storedName == "name"){
            textView.setText("WELCOME!");
        }else{
            textView.setText("WELCOME "+storedName);
        }
    }

    public void goHomeMate(View view){

        name = editName.getText().toString();

        Intent intent = new Intent(MainActivity.this,HomeMate.class);
        intent.putExtra("userName",name);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Go another page");
        alert.setMessage("Are you sure to go another page?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(),"Page changed",Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Nothing happened :D",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }

    public void goJobs(View view){

        name = editName.getText().toString();

        Intent intent = new Intent(MainActivity.this,Job.class);
        intent.putExtra("userName",name);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Go another page");
        alert.setMessage("Are you sure to go another page?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(),"Page changed",Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Nothing happened :D",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();

    }

    public void goParty(View view){

        name = editName.getText().toString();
        Intent intent = new Intent(MainActivity.this,Party.class);
        intent.putExtra("userName",name);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Go another page");
        alert.setMessage("Are you sure to go another page?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(),"Page changed",Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Nothing happened :D",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }

    public void saveName(View view){
        if(!editName.getText().toString().matches("")){
            String userName = editName.getText().toString();
            textView.setText("Welcome\n" + userName);
            editName.setText("");
            sharedPreferences.edit().putString("userName",userName).apply();
            Toast.makeText(this,"Saved!", Toast.LENGTH_LONG).show();
        }
    }
}