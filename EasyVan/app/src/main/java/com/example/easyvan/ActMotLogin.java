package com.example.easyvan;

import android.os.Bundle;

import com.example.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class ActMotLogin extends AppCompatActivity {

    private EditText edtMotUser;
    private EditText edtMotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_mot_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtMotUser = (EditText)findViewById(R.id.edtMotUser);
        String user = edtMotUser.getText().toString();
        edtMotPassword = (EditText)findViewById(R.id.edtMotPassword);
        String password = edtMotPassword.getText().toString();

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
        //A FAZER
    }


}
