package com.example.secondapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondPage extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        Button button2=findViewById(R.id.prevp);
        button2.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {


//Explicit Intent
            Intent send = new Intent(secondPage.this,
                    page1.class);
//Starts TargetActivity
            startActivity(send);

        }
    });
}
}

