package com.example.cinemarossov;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button Voitii;
    EditText login;
    EditText Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Voitii = (Button) findViewById(R.id.Voiti);
        login = (EditText) findViewById(R.id.Email);
        Password = (EditText) findViewById(R.id.Password);

        View.OnClickListener GT = new.OnClickListener() {
            @Override
            public void onClick (View view){
                if (login.getText().toString().equals("aboba") && Password.getText().toString().equals("ccc")) {
                    Intent intent = new Intent(MainActivity.this, aboba.class);
                } else {
                    numberOfRemainingLoginAttempts = numberOfRemaingLoginAttempts - 1;
                    if (numberOfRemainingLoginAttempts < 1) {
                        Intent intent = new Intent(MainActivity.this, aboba.class);
                        startActivity(intent);
                    }
                }

            }
        }
    }
}