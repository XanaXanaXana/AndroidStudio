package com.example.loginapp;

import android.content.Intent;
import android.widget.Button;


import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityEjercicioo10 extends AppCompatActivity {

    EditText txtRadio;
    TextView lblArea, lblPerimetro;
    final double PI = 3.1416;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio10);

        txtRadio = findViewById(R.id.txtRadio);
        lblArea = findViewById(R.id.lblArea);
        lblPerimetro = findViewById(R.id.lblPerimetro);

        txtRadio.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE ||
                    (event != null && event.getKeyCode() == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_DOWN)) {

                try {
                    double radio = Double.parseDouble(txtRadio.getText().toString());
                    if (radio < 1) {
                        lblArea.setText("AREA: Error");
                        lblPerimetro.setText("PERIMETRO: Error");
                        lblArea.setTextColor(Color.RED);
                        lblPerimetro.setTextColor(Color.RED);
                    } else {
                        double area = (radio * radio) * PI;
                        double perimetro = 2 * PI * radio;
                        lblArea.setText(String.format("AREA: %.2f", area));
                        lblPerimetro.setText(String.format("PERIMETRO: %.2f", perimetro));
                        lblArea.setTextColor(Color.BLACK);
                        lblPerimetro.setTextColor(Color.BLACK);
                    }
                } catch (NumberFormatException e) {
                    lblArea.setText("AREA: Error");
                    lblPerimetro.setText("PERIMETRO: Error");
                    lblArea.setTextColor(Color.RED);
                    lblPerimetro.setTextColor(Color.RED);
                }
            }
            return true;
        });

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicioo10.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional: Cierra la actividad actual
        });
    }
}
