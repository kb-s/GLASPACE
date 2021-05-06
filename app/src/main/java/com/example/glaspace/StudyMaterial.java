package com.example.glaspace;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class StudyMaterial extends AppCompatActivity {
    Button button;
    Spinner sp1, sp2;
    String course1[] = {"B.Tech", "BBA", "MBA", "Diploma", "Bsc"};
    String branch1[] = {"CSE", "ME", "EE", "CE", "EE", "EC", "Finance", "Marketing", "Entrepreneurship", "Mathematics"};

    ArrayAdapter<String> adp4;
    ArrayAdapter<String> adp5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_year_paper);
        sp1 = findViewById(R.id.spin1);
        sp2 = findViewById(R.id.bTech);
        button = findViewById(R.id.studysearch);
        adp4 = new ArrayAdapter<String>(StudyMaterial.this, android.R.layout.simple_list_item_1, course1);
        adp5 = new ArrayAdapter<String>(StudyMaterial.this, android.R.layout.simple_list_item_1, branch1);
        sp1.setAdapter(adp4);
        sp2.setAdapter(adp5);
    }

}