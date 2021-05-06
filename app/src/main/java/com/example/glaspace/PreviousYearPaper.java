package com.example.glaspace;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class PreviousYearPaper extends AppCompatActivity {
    Button b1;
    Spinner sp3, sp4, sp5;
    String course[] = {"B.Tech", "BBA", "MBA", "Diploma", "Bsc"};
    String branch[] = {"CSE", "ME", "EE", "CE", "EE", "EC", "Finance", "Marketing", "Entrepreneurship", "Mathematics"};
    String year[] = {"1st ", "2nd ", "3rd ", "4th "};
    ArrayAdapter<String> adp1;
    ArrayAdapter<String> adp2;
    ArrayAdapter<String> adp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_year_paper);
        sp3 = findViewById(R.id.pyp1);
        sp4 = findViewById(R.id.pyp2);
        sp5 = findViewById(R.id.pyp3);
        b1 = findViewById(R.id.search);
        adp1 = new ArrayAdapter<String>(PreviousYearPaper.this, android.R.layout.simple_list_item_1, course);
        adp2 = new ArrayAdapter<String>(PreviousYearPaper.this, android.R.layout.simple_list_item_1, branch);
        adp3 = new ArrayAdapter<String>(PreviousYearPaper.this, android.R.layout.simple_list_item_1, year);
        sp3.setAdapter(adp1);
        sp4.setAdapter(adp2);
        sp5.setAdapter(adp3);
    }
}