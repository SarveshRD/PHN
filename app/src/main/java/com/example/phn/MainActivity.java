package com.example.phn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView i,i2;
    Button b2,b3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=findViewById(R.id.Image_One);
        i2=findViewById(R.id.Image_two);
        b2= findViewById(R.id.btn1);
        b3=findViewById(R.id.btn2);

        Bundle b = new Bundle();
        b.putString("birdName", "Peacock");
        //Intent i =new Intent(MainActivity.this, SecondActivity.class);
        //startActivity(i, b);

        b2.setOnClickListener(view -> {
            Intent intent = new Intent(getApplication(), SecondActivity.class);
            startActivity(intent);
        });
        b3.setOnClickListener(view -> {
            Intent intent = new Intent(getApplication(), ThirdActivity.class);
            startActivity(intent);
        });




    }
}