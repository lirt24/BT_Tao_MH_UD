package com.example.loginandregister;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin, btnGoRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnGoRegister = findViewById(R.id.btnGoRegister);

        btnLogin.setOnClickListener(v -> {
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();
            Toast.makeText(this, "Login clicked: " + username, Toast.LENGTH_SHORT).show();
        });

        // Sự kiện nút Register (chưa điều hướng, sẽ làm ở giai đoạn sau)
        btnGoRegister.setOnClickListener(v -> {
            Toast.makeText(this, "Go to Register screen (not implemented yet)", Toast.LENGTH_SHORT).show();
        });
    }
}