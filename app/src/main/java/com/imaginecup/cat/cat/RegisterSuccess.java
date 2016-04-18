package com.imaginecup.cat.cat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterSuccess extends AppCompatActivity {

    Button btnProceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_success);

        btnProceed = (Button) findViewById(R.id.buttonProceed);

        btnProceed.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent thirdIntent = new Intent(getApplicationContext(), MenuActivity.class);

                        startActivity(thirdIntent);
                    }
                }
        );

    }
}
