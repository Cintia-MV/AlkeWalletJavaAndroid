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

public class SingUnPage extends AppCompatActivity {

    TextView login;
    Button crearCuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_un_page);

        login = findViewById(R.id.loginP4);
        crearCuenta = findViewById(R.id.btnCrearP4);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(SingUnPage.this, LoginPage.class);
                startActivity(login);
            }
        });

        crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crearCuenta = new Intent(SingUnPage.this, LoginPage.class);
                startActivity(crearCuenta);
            }
        });



    }
}