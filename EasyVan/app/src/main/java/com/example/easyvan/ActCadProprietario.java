package com.example.easyvan;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActCadProprietario extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cad_proprietario);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtNome = (EditText)findViewById(R.id.editText_name);
        String nome = edtNome.getText().toString();
        edtTelefone = (EditText)findViewById(R.id.editText_telefone);
        String telefone = edtTelefone.getText().toString();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void confirmaCad(View view){
        Toast.makeText(this,"cadastro OK", Toast.LENGTH_LONG).show();
        Intent it = new Intent(ActCadProprietario.this, ActMain.class);
        startActivity(it);
    }



}
