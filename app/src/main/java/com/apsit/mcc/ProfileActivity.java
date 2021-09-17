package com.apsit.mcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView usr_email, usr_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        usr_email = findViewById(R.id.putEmail);
        usr_pass = findViewById(R.id.putPass);

        Intent i = getIntent();
        String email = i.getStringExtra("email_ID");
        String password = i.getStringExtra("password");

        usr_email.setText(email);
        usr_pass.setText(password);
    }
}