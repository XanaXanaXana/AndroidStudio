package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio8 extends AppCompatActivity {

    private EditText txtTexto;
    private TextView lblTexto;
    private Button btnVaciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio8);

        txtTexto = findViewById(R.id.txtTexto);
        lblTexto = findViewById(R.id.lblTexto);
        btnVaciar = findViewById(R.id.btnVaciar);

        // Para que actualice mientras se escribe
        txtTexto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                lblTexto.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        btnVaciar.setOnClickListener(v -> {
            txtTexto.setText("");
            lblTexto.setText("");
        });

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio8.this, MainActivity.class);
            startActivity(intent);
            finish(); //
        });
    }
}
