package com.imaginecup.cat.cat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OneActivity extends AppCompatActivity {

    Button btnSign,btnRegister;
    EditText email,password;

    String userEmail = "admin";
    String userPass = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        btnSign = (Button) findViewById(R.id.buttonLogIn);
        btnRegister = (Button) findViewById(R.id.buttonReg);

        email = (EditText) findViewById(R.id.editTextEmail);
        password = (EditText) findViewById(R.id.editTextPass);

        btnRegister.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent firstIntent = new Intent(getApplicationContext(), RegisterActivity.class);
                        startActivity(firstIntent);

                    }
                }
        );

        btnSign.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent secIntent = new Intent(getApplicationContext(), MenuActivity.class);
                        String emailGet = email.getText().toString();
                        String passGet = password.getText().toString();

                        if (emailGet.equalsIgnoreCase(userEmail) && passGet.equalsIgnoreCase(userPass)) {
                            Toast.makeText(getApplicationContext(), "Log In Successful", Toast.LENGTH_SHORT).show();
                            startActivity(secIntent);

                            email.setText("");
                            password.setText("");

                        } else {
                            password.setText("");
                            Toast.makeText(getApplicationContext(), "Incorrect Email or Password Entered!", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
    }


}
