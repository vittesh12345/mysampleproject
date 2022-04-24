package com.example.firstlesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        AppCompatButton bt_signup = findViewById(R.id.bt_signup);
        bt_signup.setOnClickListener(view -> {
            Intent navigation = new Intent(
                    LoginScreen.this,RegistrationScreen.class
            );
            startActivity(navigation);
        });
    }
}