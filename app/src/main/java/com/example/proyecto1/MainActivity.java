package com.example.proyecto1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText et1;
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double cedula = Double.valueOf(et1.getText().toString());
                Intent intent = new Intent(getApplicationContext(), pagina1.class);
                intent.putExtra("cedula", cedula);
                startActivity(intent);
            }
        });
    }}
