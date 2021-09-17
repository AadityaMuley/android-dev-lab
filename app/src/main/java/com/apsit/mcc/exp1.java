package com.apsit.mcc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class exp1 extends AppCompatActivity {

    Button btnsize, btncolor;
    TextView og_text;

    float font = 20;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp1);

        btnsize = findViewById(R.id.size);
        btncolor = findViewById(R.id.color);
        og_text = findViewById(R.id.og_text);

        btnsize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                font = font + 5;
                if(font == 50)
                    font = 20;
                og_text.setTextSize(font);
            }
        });

        btncolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1: og_text.setTextColor(Color.parseColor("#FF0000")); break;
                    case 2: og_text.setTextColor(Color.parseColor("#00FF00")); break;
                    case 3: og_text.setTextColor(Color.parseColor("#0000FF")); break;
                }
                if(i<=3)
                    i++;
                if(i==4)
                    i = 1;
            }
        });
    }
}