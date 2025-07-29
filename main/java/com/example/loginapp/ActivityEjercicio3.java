package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityEjercicio3 extends AppCompatActivity {

    private CheckBox chkFutbol, chkBasquet, chkNatacion;
    private TextView lblSeleccion;
    private Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio3);

        chkFutbol = findViewById(R.id.chkFutbol);
        chkBasquet = findViewById(R.id.chkBasquet);
        chkNatacion = findViewById(R.id.chkNatacion);
        lblSeleccion = findViewById(R.id.lblSeleccion);
        btnMostrar = findViewById(R.id.btnMostrar);

        btnMostrar.setOnClickListener(v -> {
            String mensaje = "Selección: ";
            if (chkFutbol.isChecked()) {
                mensaje += "Fütbol ";
            }
            if (chkBasquet.isChecked()) {
                mensaje += "Bäsquetbol ";
            }
            if (chkNatacion.isChecked()) {
                mensaje += "Natación ";
            }
            lblSeleccion.setText(mensaje);
        });

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio3.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional: Cierra la actividad actual
        });
    }
}
