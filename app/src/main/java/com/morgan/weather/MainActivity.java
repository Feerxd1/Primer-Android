package com.morgan.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Referenciar al elemento visual
    TextView txt_contador;
    int count = 0;
    int borrar = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular
        txt_contador = findViewById(R.id.txt_contador);

        // Convertir int a String
        txt_contador.setText( String.valueOf(count) );


        //Forma Corta de Hacerlo
        //txt_contador.setText(count+"");

    }

    public void Saludar (View view) {

        String mensaje = "Bienvenidos a un contador inutil";
        Toast.makeText(MainActivity.this,mensaje,Toast.LENGTH_LONG).show();
    }

    public void Contar (View view){

        //Aumentar el valor de la variable count en 1

        count ++;

        // pintar en el txt el valor de la variable

        txt_contador.setText(count+"");

    }

    public void Restar (View view){

        //Resta el valor de la variable count en 1

        count --;

        // pintar en el txt el valor de la variable

        txt_contador.setText(count+"");

    }

    public void borrar (View view) {

        count = 0;

        txt_contador.setText(count+"");


    }


}
