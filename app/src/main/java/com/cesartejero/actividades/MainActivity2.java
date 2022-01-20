package com.cesartejero.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.i("ACTIVIDAD2", "Estoy creado");

        Button btnAct3 = findViewById(R.id.btnAct2_3);
        Intent activity3 = new Intent(this, MainActivity3.class);
        btnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(activity3);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i("ACTIVIDAD2", "Volviendo a actividad 1");
        finish();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ACTIVIDAD2", "Estoy destruido.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ACTIVIDAD2", "Estoy restaurado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACTIVIDAD2", "Estoy pausado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACTIVIDAD2", "Estoy listo (onResume).");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ACTIVIDAD2", "Estoy iniciado (onStart).");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACTIVIDAD2", "Estoy Parado.");
    }
}