package com.example.glaspace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OptionIcon extends AppCompatActivity {
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_icon);
        b1 = findViewById(R.id.button1);
        b4 = findViewById(R.id.button4);
        b3 = findViewById(R.id.button3);
        b2 = findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(OptionIcon.this, StudyMaterial.class);
                startActivity(intent1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(OptionIcon.this, PreviousYearPaper.class);
                startActivity(intent4);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(OptionIcon.this, Sports.class);
                startActivity(intent2);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(OptionIcon.this, Events.class);
                startActivity(intent3);
            }
        });
    }
}