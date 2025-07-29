package com.example.loginapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio1);

        TextView lblTexto = findViewById(R.id.lblTexto);
        Button btnActualizar = findViewById(R.id.btnActualizar);

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = "¡Texto actualizado correctamente!";
                lblTexto.setText(mensaje);
            }
        });

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio1.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional: Cierra la actividad actual
        });
    }
}

