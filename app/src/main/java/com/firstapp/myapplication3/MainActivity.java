package com.firstapp.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);

        TextView username =(TextView)findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton btn = (MaterialButton) findViewById(R.id.btn);

        //admin and admin

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this, AdminActivity.class);
                Intent intent2 =  new Intent(MainActivity.this,UserActivity.class);

                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //correct
                    Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_SHORT).show();
                    startActivity(intent1);
                }

                else if(username.getText().toString().equals("user") && password.getText().toString().equals("user")) {
                    //correct
                    Toast.makeText(MainActivity.this, "login sucessful", Toast.LENGTH_SHORT).show();
                    startActivity(intent2);
                }

                else {
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}