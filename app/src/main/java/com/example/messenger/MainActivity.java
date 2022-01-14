package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText EditTextMessageEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextMessageEnter = findViewById(R.id.EditTextMessageEnter);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, ReceiveMessage.class);
        intent.putExtra("message",EditTextMessageEnter.getText().toString());
        startActivity(intent);
    }
}