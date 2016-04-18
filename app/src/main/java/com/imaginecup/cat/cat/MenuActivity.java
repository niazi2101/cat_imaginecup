package com.imaginecup.cat.cat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Button btnTest, btnProfile, btnNotify, btnRules, btnLogout, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnTest = (Button) findViewById(R.id.buttonTest);
        btnProfile = (Button) findViewById(R.id.buttonProfile);
        btnNotify = (Button) findViewById(R.id.buttonNotifications);
        btnRules = (Button) findViewById(R.id.buttonRules);
        btnSettings = (Button) findViewById(R.id.buttonSettings);
        btnLogout = (Button) findViewById(R.id.buttonLogOut);

        btnTest.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent firstIntent = new Intent(getApplicationContext(), Category.class);
                        startActivity(firstIntent);

                    }
                }
        );
        btnProfile.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "User Profile", Toast.LENGTH_SHORT).show();

                    }
                }
        );
        btnNotify.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Notifications", Toast.LENGTH_SHORT).show();

                    }
                }
        );
        btnSettings.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Application Settings", Toast.LENGTH_SHORT).show();

                    }
                }
        );
        btnRules.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Rules for Attempting Test", Toast.LENGTH_SHORT).show();

                    }
                }
        );
        btnLogout.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Log Out", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

}
