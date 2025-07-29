package com.example.loginapp; // usa tu paquete

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_botones); // tu layout con los 10 botones

        Button btnEjercicio1 = findViewById(R.id.btnEjercicio1);
        btnEjercicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio1.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio2 = findViewById(R.id.btnEjercicio2);
        btnEjercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio2.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio3 = findViewById(R.id.btnEjercicio3);
        btnEjercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio3.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio4 = findViewById(R.id.btnEjercicio4);
        btnEjercicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio4.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio5 = findViewById(R.id.btnEjercicio5);
        btnEjercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio5.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio6 = findViewById(R.id.btnEjercicio6);
        btnEjercicio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio6.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio7 = findViewById(R.id.btnEjercicio7);
        btnEjercicio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio7.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio8 = findViewById(R.id.btnEjercicio8);
        btnEjercicio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio8.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio9 = findViewById(R.id.btnEjercicio9);
        btnEjercicio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicio9.class);
                startActivity(intent);
            }
        });

        Button btnEjercicio10 = findViewById(R.id.btnEjercicio10);
        btnEjercicio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityEjercicioo10.class);
                startActivity(intent);
            }
        });
    }


}
