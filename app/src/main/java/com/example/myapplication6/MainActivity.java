package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton Enter;
    private TextView respuesta;
    private String[] respuestaArray = {"Habran Precipitaciones","Habran Bajas Temperaturas","Sera un Dia Caluroso", "Sera un Dia Soleado",
            "Sera un Dia Nublado", "Se Esperan Altas Temperaturas", "Estara Parcialmente Nublado", "Alta Probabilidad de Chubascos",
            "Estara Parcialmente Soleado", "Sera un Dia Lluvioso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Enter = findViewById(R.id.imageButton);
        respuesta = findViewById(R.id.respuestavista);

        Enter.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(MainActivity.this, "Consulta El Clima", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v){
        //creacion metodo switch
        switch (v.getId()){
            case R.id.imageButton:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);

                break;
        }
    }
}