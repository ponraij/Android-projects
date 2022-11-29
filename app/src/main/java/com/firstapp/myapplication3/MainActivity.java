package com.firstapp.myapplication3;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView)findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton btn = (MaterialButton) findViewById(R.id.btn);

        //admin and admin

        btn.setOnClickListener(v -> {

            if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                //correct
                Toast.makeText(MainActivity.this,"successful",Toast.LENGTH_SHORT).show();
            }

            else {
                //incorrect
                Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}