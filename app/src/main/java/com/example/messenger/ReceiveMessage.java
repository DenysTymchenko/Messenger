package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessage extends AppCompatActivity {
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);

        Intent intent = getIntent();
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText(intent.getStringExtra("message"));


    }
}