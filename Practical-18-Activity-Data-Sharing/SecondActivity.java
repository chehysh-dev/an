package com.example.myapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        String data = getIntent().getStringExtra("username");
        if (data == null || data.isEmpty()) {
            data = "Guest";
        }
        textView.setText("Welcome " + data);
    }
}
