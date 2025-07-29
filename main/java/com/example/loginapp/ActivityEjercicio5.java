package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio5 extends AppCompatActivity {
    private ListView lstCiudades;
    private Button btnMostrar;
    private TextView lblMensaje;
    private String ciudadSeleccionada = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio5);

        lstCiudades = findViewById(R.id.lstCiudades);
        btnMostrar = findViewById(R.id.btnMostrar);
        lblMensaje = findViewById(R.id.lblMensaje);

        String[] ciudades = {
                "Ciudad de México",
                "Guadalajara",
                "Monterrey",
                "Cancún",
                "Tijuana"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_single_choice,
                ciudades
        );

        lstCiudades.setAdapter(adapter);

        lstCiudades.setOnItemClickListener((parent, view, position, id) -> {
            ciudadSeleccionada = ciudades[position];
        });

        btnMostrar.setOnClickListener(v -> {
            if (ciudadSeleccionada != null) {
                lblMensaje.setText("Seleccionaste: " + ciudadSeleccionada);
            } else {
                lblMensaje.setText("No se seleccionó ninguna ciudad.");
            }
        });
        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio5.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional: Cierra la actividad actual
        });
    }
}

