package com.example.fuelieeeeee;//package com.example.fuelieeeeee;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//import com.google.firebase.database.FirebaseDatabase;

public class amount_of_fuel extends AppCompatActivity {
    SeekBar seekbar;
    TextView tv1, tvs;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button place_order;

    private static final String DB_HOST = "localhost";
    private static final int DB_PORT = 3306;
    private static final String DB_NAME = "fuel";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";


    public Connection connect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
            connection = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connected to the database.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    amount_of_fuel dbHelper = new amount_of_fuel();
    Connection connection = dbHelper.connect();





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount_of_fuel);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );




        seekbar=findViewById(R.id.seekBar1);
        tv1=findViewById(R.id.tv1);
        radioGroup=findViewById(R.id.radioGroup);

        place_order=findViewById(R.id.place_order);

        place_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  ID= radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(ID);
                Toast.makeText(getApplicationContext(), radioButton.getText().toString(),Toast.LENGTH_SHORT).show();

            }
        });




        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                tv1.setVisibility(View.VISIBLE);
                tv1.setText(progress+"/10L");
            }




            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


        });

//        place_order.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                sendData();
//            }
//        });
//
//    }
//    public void sendData(){
//        String s= radioButton.getText().toString();
//
//        int tv=Integer.parseInt(tv1.getText().toString().trim());
//
//        Intent i= new Intent(amount_of_fuel.this, receipt.class);
//        i.putExtra(receipt.s,s);
//        i.putExtra(receipt.tv,tv);
//
//        startActivity(i);



//        place_order.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                FirebaseDatabase.getInstance().getReference().child("petrol").setValue("petrol");
//                Toast.makeText(amount_of_fuel.this, "go", Toast.LENGTH_SHORT).show();
//                Intent intent=new Intent(amount_of_fuel.this,receipt.class );
//                startActivity(intent);
//            }
//        });




        place_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected radio button's text
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedId);
                String selectedFuel = radioButton.getText().toString();

                // Get the progress value from the seek bar
                int progress = seekbar.getProgress();

                // Connect to the MySQL server
                Connection connection = dbHelper.connect();

                // Insert the values into the database

            }
        });




    }
}

//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.Button;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.Toast;
//
//public class amount_of_fuel extends Activity {
//
//    private RadioGroup radioGroup;
//    private RadioButton radioButton;
//    private Button btnDisplay;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_amount_of_fuel);
//
//        addListenerOnButton();
//
//    }
//
//    public void addListenerOnButton() {
//
//        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
//        btnDisplay = (Button) findViewById(R.id.place_order);
//
//        btnDisplay.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                // get selected radio button from radioGroup
//                int selectedId = radioGroup.getCheckedRadioButtonId();
//
//                // find the radiobutton by returned id
//                radioButton = (RadioButton) findViewById(selectedId);
//
//                Toast.makeText(amount_of_fuel.this,
//                        radioButton.getText(), Toast.LENGTH_SHORT).show();
//
//            }
//
//        });

//} }