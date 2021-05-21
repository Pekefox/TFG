package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class coneixens extends AppCompatActivity {


    private ImageButton mBotonIdioma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coneixens);

        View v = this.findViewById(android.R.id.content);

        //ImageButton
        mBotonIdioma = v.findViewById(R.id.boton_idioma);

        //Asignar imagen de idioma
        if (getString(R.string.identificador) == "CAT")
        {
            mBotonIdioma.setImageResource(R.drawable.catalan);
        }else if (getString(R.string.identificador) == "ESP"){
            mBotonIdioma.setImageResource(R.drawable.castellano);
        }
    }
}