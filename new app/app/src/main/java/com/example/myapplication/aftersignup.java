package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aftersignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aftersignup);
        Button signup =findViewById(R.id.button3);

        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(aftersignup.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}