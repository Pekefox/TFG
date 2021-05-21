package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;

public class llengua extends AppCompatActivity {

    private ImageButton mBotonIdioma, mBotonCat, mBotonEsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llengua);

        View v = this.findViewById(android.R.id.content);
        final Locale idiomaesp = new Locale("es", "ES");
        final Locale idiomacat = new Locale("ca", "CA");

        Locale.setDefault(idiomacat);

        final Configuration config = new Configuration();

        //ImageButton
        mBotonIdioma = v.findViewById(R.id.boton_idioma);
        mBotonCat = v.findViewById(R.id.boton_bandera_catalan);
        mBotonEsp = v.findViewById(R.id.boton_bandera_castellano);


        //Asignar imagen de idioma
        if (getString(R.string.identificador) == "CAT")
        {
            mBotonIdioma.setImageResource(R.drawable.catalan);
        }else if (getString(R.string.identificador) == "ESP"){
            mBotonIdioma.setImageResource(R.drawable.castellano);
        }


        mBotonCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                config.locale = idiomacat;
                getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
            }
        });

        mBotonEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                config.locale = idiomaesp;
                getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
            }
        });





    }
}