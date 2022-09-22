package com.example.proyecto1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class pagina1 extends AppCompatActivity {

    RadioButton rb1, rb2,rb3;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina1);

        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        button2=findViewById(R.id.button2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Solicitud Generada");

        Intent intent = getIntent();
        String cedulav = intent.getStringExtra("cedula");
        Double cedula = Double.parseDouble(cedulav);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = getIntent();
                double voto =0;

                if (rb1.isChecked()==true) {cedula = voto/3;}
                if (rb2.isChecked()==true) { cedula = voto/3;}
                if (rb3.isChecked()==true) { cedula = voto/3;}


            }});
}}