package com.cesartejero.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.i("ACTIVIDAD3", "Estoy creado");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i("ACTIVIDAD3", "Volviendo a actividad 2");
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ACTIVIDAD3", "Estoy destruido.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ACTIVIDAD3", "Estoy restaurado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACTIVIDAD3", "Estoy pausado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACTIVIDAD3", "Estoy listo (onResume).");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ACTIVIDAD3", "Estoy iniciado (onStart).");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACTIVIDAD3", "Estoy Parado.");
    }
}