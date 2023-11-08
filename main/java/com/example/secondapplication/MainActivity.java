package com.example.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);

        Button button1=findViewById(R.id.nextp);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//Explicit Intent
        Intent send = new Intent(MainActivity.this,
                        secondPage.class);
//Starts TargetActivity
                startActivity(send);


            }
        });
    }}

