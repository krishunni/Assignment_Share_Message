package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.MessageQueue;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

    EditText displayEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        displayEditText=findViewById(R.id.displayEditText);

        Intent intent= getIntent();
        String message=intent.getStringExtra("message");


        displayEditText.setText(message);

    }

    public void back(View view){
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}