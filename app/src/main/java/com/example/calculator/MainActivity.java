package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private EditText num_1 , num_2;
    private Button but_plus,but_min,but_divide,but_multiply;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);

        but_plus = findViewById(R.id.plus);
        but_min = findViewById(R.id.minus);
        but_divide = findViewById(R.id.divide);
        but_multiply = findViewById(R.id.multiply);

        result = findViewById(R.id.result);


        but_plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(num_1.getText().toString()) + Integer.parseInt(num_2.getText().toString());
                result.setText(Integer.toString(temp));
            }
        });

        but_min.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int temp  = Integer.parseInt(num_1.getText().toString()) - Integer.parseInt(num_2.getText().toString());
                result.setText(Integer.toString(temp));
            }
        });

        but_multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int temp  = Integer.parseInt(num_1.getText().toString()) * Integer.parseInt(num_2.getText().toString());
                result.setText(Integer.toString(temp));
            }
        });

        but_divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(num_1.getText().toString()) / Integer.parseInt(num_2.getText().toString());
                result.setText(Integer.toString(temp));
            }
        });

    }

}