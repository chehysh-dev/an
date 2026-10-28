package com.example.pract9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword;
    Button btnRegister, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnLogin = findViewById(R.id.btnLogin);

        btnRegister.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            Toast.makeText(this, "Registered: " + name, Toast.LENGTH_SHORT).show();
        });

        btnLogin.setOnClickListener(v -> {
            Toast.makeText(this, "Navigating to Login...", Toast.LENGTH_SHORT).show();
        });
    }
}
