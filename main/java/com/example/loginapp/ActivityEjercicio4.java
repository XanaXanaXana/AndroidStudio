package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityEjercicio4 extends AppCompatActivity {

    private RadioButton rbtnEfectivo, rbtnTarjeta, rbtnTransferencia;
    private Button btnConfirmar;
    private TextView lblSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio4);

        rbtnEfectivo = findViewById(R.id.rbtnEfectivo);
        rbtnTarjeta = findViewById(R.id.rbtnTarjeta);
        rbtnTransferencia = findViewById(R.id.rbtnTransferencia);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        lblSeleccion = findViewById(R.id.lblSeleccion);

        btnConfirmar.setOnClickListener(v -> {
            if (rbtnEfectivo.isChecked()) {
                lblSeleccion.setText("Seleccionaste: Efectivo");
            } else if (rbtnTarjeta.isChecked()) {
                lblSeleccion.setText("Seleccionaste: Tarjeta");
            } else if (rbtnTransferencia.isChecked()) {
                lblSeleccion.setText("Seleccionaste: Transferencia");
            } else {
                lblSeleccion.setText("No se seleccionó ningún método de pago");
            }
        });

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio4.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional: Cierra la actividad actual
        });
    }
}
