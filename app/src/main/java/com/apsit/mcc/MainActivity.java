package com.apsit.mcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login_but;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_but = findViewById(R.id.login_but);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        login_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                String usr_email = email.getText().toString().trim();
                String usr_password = password.getText().toString().trim();

                if(usr_email.equals("") || usr_password.equals("")){
                    Toast.makeText(getApplicationContext(), "Fill all details", Toast.LENGTH_SHORT).show();
                    if(usr_email.equals(""))
                        email.setError("Please enter email");
                    if(usr_password.equals(""))
                        password.setError("Please enter password");
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(usr_email).matches()){
                    Toast.makeText(getApplicationContext(), "Invalid email", Toast.LENGTH_SHORT).show();
                }
                else if(usr_password.length() < 6){
                    Toast.makeText(getApplicationContext(), "Password too short", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                    i.putExtra("email_ID", usr_email);
                    i.putExtra("password", usr_password);
                    startActivity(i);
                }
            }
        });
    }
}