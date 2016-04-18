package com.imaginecup.cat.cat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button btnRegComplete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegComplete = (Button) findViewById(R.id.buttonRegistered);

        btnRegComplete.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent firstIntent = new Intent(getApplicationContext(), RegisterSuccess.class);

                        startActivity(firstIntent);
                    }
                }
        );
    }

}
