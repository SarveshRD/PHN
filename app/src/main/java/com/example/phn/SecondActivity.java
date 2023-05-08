package com.example.phn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String fruitName = extras.getString("birdName");
            Toast.makeText(this, fruitName, Toast.LENGTH_SHORT).show();
        }

        b1 = findViewById(R.id.btn);
        b1.setOnClickListener(view -> {
            Intent intent = new Intent(getApplication(), MainActivity.class);
            startActivity(intent);
        });

    }
}