package com.example.ejerciciogridview_afv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridPersonas;
    private ArrayList<Persona> lista;
    private Persona persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridPersonas = findViewById(R.id.gridView);

        //Añadimos contenido al arrayList de la clase personas
        lista = new ArrayList<>();
        lista.add(new Persona(R.drawable.hombre, "Miguel", "López Sanchez", "ASIR"));//persona1
        lista.add(new Persona(R.drawable.hombre,"Juan", "Pérez Pérez", "DAW"));//persona2
        lista.add(new Persona(R.drawable.mujer,"María", "Martinez Fernandez", "DAM"));//persona3
        lista.add(new Persona(R.drawable.hombre,"Antonio", "Gonzalez García", "DAM"));//persona4
        lista.add(new Persona(R.drawable.mujer,"Ana", "Diaz Torres", "ASIR"));//persona5
        //Le pasamos ala clase PersonaAdapter el contexto, el layout y la lista de las personas
        PersonaAdapter personaAdapter = new PersonaAdapter(this, R.layout.list_row, lista);

        gridPersonas.setAdapter(personaAdapter);

        gridPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Usamos el intent que nos ayuda a enviar datos a otro componente de nuestra app
                Intent intent = new Intent(view.getContext(), Modulos.class);
                intent.putExtra("CURSO", "DAM");//Enviamos el ciclo seleccioando co  su nombre

                startActivity(intent);


/*
                //String cadena = lista.get(i).getCiclo();
                intent.putExtra("CURSO", "DAM");//Enviamos el ciclo seleccioando co  su nombre
                startActivity(intent);

                 */
            }
        });

        /*
        //Evento cambio de activity
        gridPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Usamos el intent que nos ayuda a enviar datos a otro componente de nuestra app
                Intent intent = new Intent(view.getContext(), Modulos.class);


                //String cadena = lista.get(i).getCiclo();
                intent.putExtra("CICLO", lista.get(i).getCiclo());//Enviamos el ciclo seleccioando co  su nombre
                startActivity(intent);

            }
        });

         */


    }
}