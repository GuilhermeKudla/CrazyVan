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

public class ActProLogin extends AppCompatActivity {

    private EditText edtUser;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_pro_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtUser = (EditText)findViewById(R.id.edtProUser);
        String user = edtUser.getText().toString();
        edtPassword = (EditText)findViewById(R.id.edtProPassword);
        String password = edtPassword.getText().toString();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void confirmaLogin(View view){
        Toast.makeText(this,"OK", Toast.LENGTH_LONG).show();
        Intent it = new Intent(ActProLogin.this, ActProprietario.class);
        startActivity(it);
    }

    public void proCadastro(View view){
        Toast.makeText(this,"OK", Toast.LENGTH_LONG).show();
        Intent it = new Intent(ActProLogin.this, ActCadProprietario.class);
        startActivity(it);
    }


}
