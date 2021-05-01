package com.example.glaspace;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class StudyMaterial extends AppCompatActivity {
    Spinner sp1;
    String courses[] = {"B.Tech", "BBA", "MBA", "Diploma", "Bsc"};
    ArrayAdapter<String> adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);
        sp1 = findViewById(R.id.spin1);
        adp = new ArrayAdapter<String>(StudyMaterial.this, android.R.layout.simple_list_item_1, courses);
        sp1.setAdapter(adp);
        sp1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Spinner btech;
                        String branches[] = {"CSE", "ME", "CE", "EE", "EC"};
                        ArrayAdapter<String> badp;
                        btech = findViewById(R.id.bTech);
                        badp = new ArrayAdapter<String>(StudyMaterial.this, android.R.layout.simple_list_item_1, branches);
                        btech.setAdapter(badp);

                }
            }
        });
    }
}