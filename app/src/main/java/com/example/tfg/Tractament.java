package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Tractament extends AppCompatActivity {

    private TextView mNeteja, mtittract, mCura, mControl, mDesbridament, mAposita, mMantenimet, mChultetilla;

    private ImageView mHerida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tractament);

        View v = this.findViewById(android.R.id.content);

        mNeteja = v.findViewById(R.id.neteja);
        mControl = v.findViewById(R.id.control);
        mAposita = v.findViewById(R.id.aposits);
        mCura = v.findViewById(R.id.cura);
        mDesbridament = v.findViewById(R.id.desbridament);
        mMantenimet = v.findViewById(R.id.manteniment);
        mtittract = v.findViewById(R.id.titoltractament);
        mChultetilla = v.findViewById(R.id.chuletilla);
        mHerida = v.findViewById(R.id.imagenherida);

        String Titulo = getIntent().getExtras().getString("teixit") + "/" +
                getIntent().getExtras().getString("bores") + "/" +
                getIntent().getExtras().getString("complicacions") + "/" +
                getIntent().getExtras().getString("risc") + "/" +
                getIntent().getExtras().getString("exudat");

        mtittract.setText(Titulo);

        if (Titulo.equals(getResources().getString(R.string.titoltractament1))){
            mtittract.setText(R.string.titoltractament1);
            mNeteja.setText(R.string.neteja1);
            mControl.setText(R.string.control1);
            mAposita.setText(R.string.aposits1);
            mCura.setText(R.string.cura1);
            mDesbridament.setText(R.string.desbridament1);
            mMantenimet.setText(R.string.manteniment1);
            mChultetilla.setText(R.string.chuletilla1);
            mHerida.setImageDrawable(getResources().getDrawable(R.drawable.herida1));
        }else if (Titulo.equals(getResources().getString(R.string.titoltractament2))){
            mtittract.setText(R.string.titoltractament2);
            mNeteja.setText(R.string.neteja2);
            mControl.setText(R.string.control2);
            mAposita.setText(R.string.aposits2);
            mCura.setText(R.string.cura2);
            mDesbridament.setText(R.string.desbridament2);
            mMantenimet.setText(R.string.manteniment2);
            mChultetilla.setText(R.string.chuletilla2);
            mHerida.setImageDrawable(null);
        }else if (Titulo.equals(getResources().getString(R.string.titoltractament3))){
            mtittract.setText(R.string.titoltractament3);
            mNeteja.setText(R.string.neteja3);
            mControl.setText(R.string.control3);
            mAposita.setText(R.string.aposits3);
            mCura.setText(R.string.cura3);
            mDesbridament.setText(R.string.desbridament3);
            mMantenimet.setText(R.string.manteniment3);
            mChultetilla.setText(R.string.chuletilla3);
            mHerida.setImageDrawable(null);
        }else if (Titulo.equals(getResources().getString(R.string.titoltractament4))){
            mtittract.setText(R.string.titoltractament4);
            mNeteja.setText(R.string.neteja4);
            mControl.setText(R.string.control4);
            mAposita.setText(R.string.aposits4);
            mCura.setText(R.string.cura4);
            mDesbridament.setText(R.string.desbridament4);
            mMantenimet.setText(R.string.manteniment4);
            mChultetilla.setText(R.string.chuletilla4);
            mHerida.setImageDrawable(null);
        }else if (Titulo.equals(getResources().getString(R.string.titoltractament5))){
            mtittract.setText(R.string.titoltractament5);
            mNeteja.setText(R.string.neteja5);
            mControl.setText(R.string.control5);
            mAposita.setText(R.string.aposits5);
            mCura.setText(R.string.cura5);
            mDesbridament.setText(R.string.desbridament5);
            mMantenimet.setText(R.string.manteniment5);
            mChultetilla.setText(R.string.chuletilla5);
            mHerida.setImageDrawable(getResources().getDrawable(R.drawable.herida5));
        }else{
            mtittract.setText(Titulo);
            mNeteja.setText(null);
            mControl.setText(null);
            mAposita.setText(null);
            mCura.setText(null);
            mDesbridament.setText(null);
            mMantenimet.setText(null);
            mChultetilla.setText(null);
            mHerida.setImageDrawable(null);
        }


        Log.i("------", Titulo +"------------------");
        Log.i("------", getResources().getString(R.string.titoltractament4) +"------------------");

    }
}