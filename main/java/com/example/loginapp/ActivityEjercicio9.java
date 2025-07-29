package com.example.loginapp;


import android.content.Intent;
import android.widget.Button;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio9 extends AppCompatActivity {

    private EditText txtNombre, txtCiudad, txtFrase;
    private Button btnActivar, btnAceptar, btnDesactivar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio9);

        txtNombre = findViewById(R.id.txtNombre);
        txtCiudad = findViewById(R.id.txtCiudad);
        txtFrase = findViewById(R.id.txtFrase);
        btnActivar = findViewById(R.id.btnActivar);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnDesactivar = findViewById(R.id.btnDesactivar);

        btnActivar.setOnClickListener(v -> {
            txtNombre.setEnabled(true);
            txtCiudad.setEnabled(true);
        });

        btnAceptar.setOnClickListener(v -> {
            String nombre = txtNombre.getText().toString();
            String ciudad = txtCiudad.getText().toString();
            txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad);
        });

        btnDesactivar.setOnClickListener(v -> {
            txtNombre.setEnabled(false);
            txtCiudad.setEnabled(false);
        });

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio9.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }
}
