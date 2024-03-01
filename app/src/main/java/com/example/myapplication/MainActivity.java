package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText value1, value2;
    TextView result;
    Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        result = findViewById(R.id.tvHasil);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int hasil = val1 + val2;
                result.setText(String.valueOf(hasil));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int hasil = val1 - val2;
                result.setText(String.valueOf(hasil));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int hasil = val1 * val2;
                result.setText(String.valueOf(hasil));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int hasil = val1 / val2;
                result.setText(String.valueOf(hasil));
            }
        });
    }
}