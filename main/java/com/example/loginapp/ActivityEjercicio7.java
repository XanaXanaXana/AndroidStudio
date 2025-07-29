package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

    public class ActivityEjercicio7 extends AppCompatActivity {

    private EditText txtTexto;
    private TextView lblTexto1, lblTexto2;
    private Button btnTraspasa1, btnTraspasa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7);

        txtTexto = findViewById(R.id.txtTexto);
        lblTexto1 = findViewById(R.id.lblTexto1);
        lblTexto2 = findViewById(R.id.lblTexto2);
        btnTraspasa1 = findViewById(R.id.btnTraspasa1);
        btnTraspasa2 = findViewById(R.id.btnTraspasa2);

        btnTraspasa1.setOnClickListener(v -> {
            lblTexto1.setText(txtTexto.getText().toString());
        });

        btnTraspasa2.setOnClickListener(v -> {
            lblTexto2.setText(txtTexto.getText().toString());
        });
        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio7.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
