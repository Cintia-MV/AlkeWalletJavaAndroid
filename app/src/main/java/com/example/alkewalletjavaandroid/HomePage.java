package com.example.alkewalletjavaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
    TextView irPerfil;
    Button enviarDinero;
    Button ingresarDinero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        irPerfil = findViewById(R.id.saludoP5);
        enviarDinero = findViewById(R.id.btnEnviarDinP5);
        ingresarDinero = findViewById(R.id.btnIngresarDinP5);

        irPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irPerfil= new Intent(HomePage.this, ProfilePage.class);
                startActivity(irPerfil);
            }
        });

        enviarDinero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviarDinero = new Intent(HomePage.this, SendMoney.class);
                startActivity(enviarDinero);
            }
        });


        ingresarDinero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresarDinero = new Intent(HomePage.this, RequestMoney.class);
                startActivity(ingresarDinero);
            }
        });




    }


}