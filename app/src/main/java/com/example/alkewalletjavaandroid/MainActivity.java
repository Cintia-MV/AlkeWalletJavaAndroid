package com.example.alkewalletjavaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Tiempo de retardo en milisegundos
    private static final long RETARDO_MS = 3000; // 3 segundos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crear un Intent para pasar a la siguiente actividad
                Intent intent = new Intent(MainActivity.this, LoginSingup.class);
                startActivity(intent);
                finish();
            }
        },RETARDO_MS);

    }
}