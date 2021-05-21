package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {


    private Button mBotonCercaTractament, mBotonConeixens;
    private EditText mBuscadorMainET;
    private ImageButton mBotonCerca, mBotonInfo, mBotonCercaTractamentImg, mBotonIdioma, mBotonGlosari;
    private Spinner mGlosari;
    private TextView mPopUpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v = this.findViewById(android.R.id.content);

        //Idioma
        Locale idiomacat = new Locale("ca", "rES");

        Locale.setDefault(idiomacat);
        Configuration config = new Configuration();
        config.locale = idiomacat;
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());

        //ImageButton
        mBotonCerca = v.findViewById(R.id.boton_buscar_main);
        mBotonInfo = v.findViewById(R.id.boton_info_coneixens);
        mBotonCercaTractamentImg = v.findViewById(R.id.boton_imagen_cerca_tractament);
        mBotonIdioma = v.findViewById(R.id.boton_idioma);
        mBotonGlosari = v.findViewById(R.id.boton_buscar_glosari);

        //Button
        mBotonCercaTractament = v.findViewById(R.id.button_cerca_tractament);
        mBotonConeixens = v.findViewById(R.id.boton_conexiens);

        //EditText
        mBuscadorMainET = v.findViewById(R.id.buscador_main);


        mGlosari = v.findViewById(R.id.spinner_glossari_main);


        ArrayAdapter<CharSequence> glosari = ArrayAdapter.createFromResource(this,
                R.array.glosari, android.R.layout.simple_spinner_item);
        glosari.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mGlosari.setAdapter(glosari);

        //Asignar imagen de idioma
        if (getString(R.string.identificador) == "CAT")
        {
            mBotonIdioma.setImageResource(R.drawable.catalan);
        }else if (getString(R.string.identificador) == "ESP"){
            mBotonIdioma.setImageResource(R.drawable.castellano);
        }


        //Ir activity Tractament
        mBotonCercaTractament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irCercaTractament(v);
            }
        });

        //Ir activity Cerca Tractament
        mBotonCercaTractamentImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irCercaTractament(v);
            }
        });

        //Ir activity Idioma
        mBotonIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irIdioma(v);
            }
        });


        //Ir a activity coneixens
        mBotonConeixens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irConeixens(v);
            }
        });

        mBotonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irConeixens(v);
            }
        });

        mBotonGlosari.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onButtonShowPopupWindowClick(v,mGlosari.getSelectedItem().toString(), mGlosari.getSelectedItemPosition());
            }
        });

    }

    public void onButtonShowPopupWindowClick(View view, String s, int i) {

        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popup_window, null);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        mPopUpText = popupView.findViewById(R.id.VentanaEmergente);

        switch (i){
            case 1:
                mPopUpText.setText(R.string.glosari1);
                break;
            case 2:
                mPopUpText.setText(R.string.glosari2);
                break;
            case 3:
                mPopUpText.setText(R.string.glosari3);
                break;
            case 4:
                mPopUpText.setText(R.string.glosari4);
                break;
            case 5:
                mPopUpText.setText(R.string.glosari5);
                break;
            case 6:
                mPopUpText.setText(R.string.glosari6);
                break;
            case 7:
                mPopUpText.setText(R.string.glosari7);
                break;
            case 8:
                mPopUpText.setText(R.string.glosari8);
                break;
            case 9:
                mPopUpText.setText(R.string.glosari9);
                break;
            case 10:
                mPopUpText.setText(R.string.glosari10);
                break;
            case 11:
                mPopUpText.setText(R.string.glosari11);
                break;
            case 12:
                mPopUpText.setText(R.string.glosari12);
                break;
            case 13:
                mPopUpText.setText(R.string.glosari13);
                break;
            case 14:
                mPopUpText.setText(R.string.glosari14);
                break;
            case 15:
                mPopUpText.setText(R.string.glosari15);
                break;
            case 16:
                mPopUpText.setText(R.string.glosari16);
                break;
            case 17:
                mPopUpText.setText(R.string.glosari17);
                break;
            case 18:
                mPopUpText.setText(R.string.glosari18);
                break;
            case 19:
                mPopUpText.setText(R.string.glosari19);
                break;
            case 20:
                mPopUpText.setText(R.string.glosari20);
                break;
            default:
                mPopUpText.setText(getResources().getStringArray(R.array.glosari)[0]);
                break;
        }

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }


    public void irIdioma(View view) {
        Intent botonIdiomaIntent = new Intent(this, llengua.class);
        startActivity(botonIdiomaIntent);
    }

    public void irCercaTractament(View view) {
        Intent botonCercaTractamentIntent = new Intent(this, cerca_tractament.class);
        startActivity(botonCercaTractamentIntent);
    }

    public void irConeixens(View view) {
        Intent botonConeixens = new Intent(this, coneixens.class);
        startActivity(botonConeixens);
    }
}