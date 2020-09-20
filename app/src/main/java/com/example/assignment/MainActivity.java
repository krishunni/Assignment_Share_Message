package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText messageEditText;

    public void sendMessage(View view){
        Intent intent=new Intent(getApplicationContext(),MessageActivity.class);
        intent.putExtra("message",messageEditText.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageEditText=findViewById(R.id.messageEditText);

    }
}