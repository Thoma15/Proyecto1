package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class pagina2 extends AppCompatActivity {
    TextView tv8;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);

        button3=findViewById(R.id.button3);
        tv8=findViewById(R.id.tv8);

        if (cb1.isChecked()==true) {cedula = voto/3;}
        if (cb2.isChecked()==true) { cedula = voto/3;}
        if (cb3.isChecked()==true) { cedula = voto/3;}

    }
}