package com.example.fuelieeeeee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.google.firebase.FirebaseApp;
//import com.google.firebase.auth.FirebaseAuth;

public class Signin_Activity extends AppCompatActivity {

    private EditText email1;
    private EditText password1;
    Button Newacc;
    Button newlog;
//    private FirebaseAuth auth;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


        email1=findViewById(R.id.editTextTextEmailAddress);
        Newacc=findViewById(R.id.textView);
        newlog=findViewById(R.id.button);
//        auth=FirebaseAuth.getInstance();

        Newacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=email1.getText().toString();
                String password=password1.getText().toString();
                Toast.makeText(Signin_Activity.this, "new account", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Signin_Activity.this,Signup_Activity.class );
                startActivity(intent);

            }
        });

//


        newlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signin_Activity.this, "login", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Signin_Activity.this, location.class );
                startActivity(intent);
            }
        });





    }

}