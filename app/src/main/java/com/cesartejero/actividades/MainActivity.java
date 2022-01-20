package com.cesartejero.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ACTIVIDAD1", "Estoy creado.");

        Button act2 = findViewById(R.id.btnAct2);
        Intent layout2 = new Intent(this, MainActivity2.class);
        Button act3 = findViewById(R.id.btnAct3);
        Intent layout3 = new Intent(this, MainActivity3.class);

        act2.setOnClickListener(view -> startActivity(layout2));
        act3.setOnClickListener(view -> startActivity(layout3));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ACTIVIDAD1", "Estoy destruido.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ACTIVIDAD1", "Estoy restaurado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACTIVIDAD1", "Estoy pausado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACTIVIDAD1", "Estoy listo (onResume).");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ACTIVIDAD1", "Estoy iniciado (onStart).");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACTIVIDAD1", "Estoy Parado.");
    }
}