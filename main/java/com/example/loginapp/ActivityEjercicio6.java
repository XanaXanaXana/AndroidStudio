package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio6 extends AppCompatActivity {

    private TextView lblNombre, lblCiudad;
    private EditText txtNombre, txtCiudad;
    private Button btnOcultarNombre, btnMostrarNombre, btnOcultarCiudad, btnMostrarCiudad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6);

        lblNombre = findViewById(R.id.lblNombre);
        txtNombre = findViewById(R.id.txtNombre);
        lblCiudad = findViewById(R.id.lblCiudad);
        txtCiudad = findViewById(R.id.txtCiudad);

        btnOcultarNombre = findViewById(R.id.btnOcultarNombre);
        btnMostrarNombre = findViewById(R.id.btnMostrarNombre);
        btnOcultarCiudad = findViewById(R.id.btnOcultarCiudad);
        btnMostrarCiudad = findViewById(R.id.btnMostrarCiudad);

        btnOcultarNombre.setOnClickListener(v -> {
            lblNombre.setVisibility(View.GONE);
            txtNombre.setVisibility(View.GONE);
        });

        btnMostrarNombre.setOnClickListener(v -> {
            lblNombre.setVisibility(View.VISIBLE);
            txtNombre.setVisibility(View.VISIBLE);
        });

        btnOcultarCiudad.setOnClickListener(v -> {
            lblCiudad.setVisibility(View.GONE);
            txtCiudad.setVisibility(View.GONE);
        });

        btnMostrarCiudad.setOnClickListener(v -> {
            lblCiudad.setVisibility(View.VISIBLE);
            txtCiudad.setVisibility(View.VISIBLE);
        });

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio6.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}


