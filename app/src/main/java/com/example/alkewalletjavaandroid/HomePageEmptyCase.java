package com.example.alkewalletjavaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomePageEmptyCase extends AppCompatActivity {

    TextView irPerfil;
    TextView inicio;
    Button enviarDinero;
    Button ingresarDinero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_empty_case);

        inicio = findViewById(R.id.txtInicioP6);
        irPerfil = findViewById(R.id.saludoP6);
        enviarDinero = findViewById(R.id.btnEnviardineroP6);
        ingresarDinero = findViewById(R.id.btnRecibDinerP6);


        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio = new Intent(HomePageEmptyCase.this, HomePage.class);
                startActivity(inicio);
            }
        });

        irPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent perfil = new Intent(HomePageEmptyCase.this, ProfilePage.class);
                startActivity(perfil);
            }
        });

        enviarDinero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviarDinero = new Intent(HomePageEmptyCase.this, SendMoney.class);
                startActivity(enviarDinero);
            }
        });

        ingresarDinero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresarDinero = new Intent(HomePageEmptyCase.this, RequestMoney.class);
                startActivity(ingresarDinero);
            }
        });
    }
}