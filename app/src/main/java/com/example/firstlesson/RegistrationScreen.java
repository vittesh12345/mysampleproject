package com.example.firstlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class RegistrationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Save=findViewById(R.id.bt_save);
        Save.setOnClickListener(view -> Toast.makeText(RegistrationScreen.this,"got it",Toast.LENGTH_SHORT).show());
    }
}
