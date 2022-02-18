package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class confirmation extends AppCompatActivity {
    private  Button button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        button_login = (Button) findViewById(R.id.button2);


        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin_page();
            }
        });
    }
    public void openLogin_page() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}