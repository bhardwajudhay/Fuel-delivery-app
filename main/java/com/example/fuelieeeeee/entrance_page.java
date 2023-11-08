package com.example.fuelieeeeee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class entrance_page extends AppCompatActivity {
    Button Login ;
    Button register;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance_page);




        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );


        Login=findViewById(R.id.button4);
        register=findViewById(R.id.button3);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(entrance_page.this, "login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(entrance_page.this,Signin_Activity.class );
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(entrance_page.this, "register has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(entrance_page.this,Signup_Activity.class );
                startActivity(intent);
            }
        });


    }
}



