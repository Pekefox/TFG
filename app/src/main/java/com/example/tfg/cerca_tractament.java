package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class cerca_tractament extends AppCompatActivity {


    private ImageView mLupaTitulo;
    private TextView mTituloCerca;
    private Button mBotonCerca;
    private ImageButton mBotonIdioma;
    private Spinner mTeixit, mBores, mComplicacions, mRisc, mExudat, mEsfacel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerca_tractament);

        View v = this.findViewById(android.R.id.content);

        //Boton
        mBotonCerca = v.findViewById(R.id.Cerca_tractament_button);

        //TextView
        mTituloCerca = v.findViewById(R.id.Titulo_cerca_tractament_text);

        //ImageView
        mLupaTitulo = v.findViewById(R.id.Lupa_titulo);

        //ImageButton
        mBotonIdioma = v.findViewById(R.id.boton_idioma);

        //Asignar imagen de idioma
        if (getString(R.string.identificador) == "CAT")
        {
            mBotonIdioma.setImageResource(R.drawable.catalan);
        }else if (getString(R.string.identificador) == "ESP"){
            mBotonIdioma.setImageResource(R.drawable.castellano);
        }

        mTeixit = v.findViewById(R.id.spinner_texit_afectat);
        mBores = v.findViewById(R.id.spinner_bores);
        mComplicacions = v.findViewById(R.id.spinner_complicacions);
        mRisc = v.findViewById(R.id.spinner_risc_infeccio);
        mExudat = v.findViewById(R.id.spinner_exudat);
        mEsfacel = v.findViewById(R.id.spinner_esfacel);


        ArrayAdapter<CharSequence> teixit = ArrayAdapter.createFromResource(this,
                R.array.teixits_afectats, android.R.layout.simple_spinner_item);
        teixit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mTeixit.setAdapter(teixit);

        ArrayAdapter<CharSequence> bores = ArrayAdapter.createFromResource(this,
                R.array.bores, android.R.layout.simple_spinner_item);
        teixit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mBores.setAdapter(bores);

        ArrayAdapter<CharSequence> complicacions = ArrayAdapter.createFromResource(this,
                R.array.complicacions, android.R.layout.simple_spinner_item);
        teixit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mComplicacions.setAdapter(complicacions);

        ArrayAdapter<CharSequence> risc = ArrayAdapter.createFromResource(this,
                R.array.risc_infeccio, android.R.layout.simple_spinner_item);
        teixit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mRisc.setAdapter(risc);

        ArrayAdapter<CharSequence> exudat = ArrayAdapter.createFromResource(this,
                R.array.exudat, android.R.layout.simple_spinner_item);
        teixit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mExudat.setAdapter(exudat);

        ArrayAdapter<CharSequence> esfacel = ArrayAdapter.createFromResource(this,
                R.array.esfacel, android.R.layout.simple_spinner_item);
        teixit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mEsfacel.setAdapter(esfacel);


        //Ir a activity coneixens
        mBotonCerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTractament(v);
            }
        });

    }

    public void irTractament(View view) {

        Intent botonConeixens = new Intent(this, Tractament.class);
        botonConeixens.putExtra("teixit", mTeixit.getSelectedItem().toString());
        botonConeixens.putExtra("bores", mBores.getSelectedItem().toString());
        botonConeixens.putExtra("complicacions", mComplicacions.getSelectedItem().toString());
        botonConeixens.putExtra("risc", mRisc.getSelectedItem().toString());
        botonConeixens.putExtra("exudat", mExudat.getSelectedItem().toString());
        botonConeixens.putExtra("esfacel", mEsfacel.getSelectedItem().toString());
        startActivity(botonConeixens);
    }
}