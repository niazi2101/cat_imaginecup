package com.imaginecup.cat.cat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Category extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner,SpinnerSubject;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        spinner = (Spinner) findViewById(R.id.spinnerType);
        SpinnerSubject = (Spinner) findViewById(R.id.spinnerSubject);

        spinner.setOnItemSelectedListener(this);
        SpinnerSubject.setOnItemSelectedListener(this);

        List<String> categories =  new ArrayList<String>();
        List<String> subject =  new ArrayList<String>();


        categories.add("NAT-1");
        categories.add("NAT-2");
        categories.add("GAT");

        subject.add("Computer");
        subject.add("Physics");
        subject.add("Chemistry");
        subject.add("Biology");

        // Creating adapter for spinner
        //ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        //can use this to increase text size
        ArrayAdapter<String> catAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item,categories);
        ArrayAdapter<String> subjectAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item,subject);

        // Drop down layout style - list view with radio button
        //dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(catAdapter);
        SpinnerSubject.setAdapter(subjectAdapter);

        btnNext = (Button) findViewById(R.id.buttonNext);

        btnNext.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent thirdIntent = new Intent(getApplicationContext(), TestActivity.class);

                        startActivity(thirdIntent);
                    }
                }
        );
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
