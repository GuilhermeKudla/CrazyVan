package com.example.easyvan;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ActProprietario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_proprietario);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void Back(View view){
        Intent it = new Intent(ActProprietario.this, ActMain.class);
        startActivity(it);
    }

    public void regCliente(View view){
        Intent it = new Intent(ActProprietario.this, ActCadCliente.class);
        startActivity(it);
    }

    public void regVeiculo(View view){
        Intent it = new Intent(ActProprietario.this, ActCadVeiculo.class);
        startActivity(it);
    }

    public void regMotorista(View view){
        Intent it = new Intent(ActProprietario.this, ActCadMotorista.class);
        startActivity(it);
    }

}
