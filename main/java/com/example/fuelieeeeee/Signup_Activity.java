package com.example.fuelieeeeee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Signup_Activity extends AppCompatActivity {
    Button alr_login;
    Button regi;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        alr_login=findViewById(R.id.ttView);
        regi=findViewById(R.id.buttonr);


        alr_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup_Activity.this, "loging in account", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Signup_Activity.this,Signin_Activity.class );
                startActivity(intent);
            }
        });

        regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup_Activity.this, "signing in account", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Signup_Activity.this, location.class );
                startActivity(intent);
            }
        });

    }
}