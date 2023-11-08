package com.example.fuelieeeeee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class receipt extends AppCompatActivity {
    public static final String s="text";
    public static final String tv="tv1";
    TextView textView4,textView5;
    String S;
    int tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);

        Intent i=getIntent();
        S=i.getStringExtra(S);
        tv1=i.getIntExtra(tv,0);

        textView4.setText("Fuel:"+S);
        textView5.setText("Quantity:"+tv1);

        Button go1;
        go1=findViewById(R.id.go1);

        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(receipt.this, "go", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(receipt.this,exit.class );
                startActivity(intent);
            }
        });

    }
}