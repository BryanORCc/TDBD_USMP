package com.example.vision_2020.Pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.vision_2020.R;

import java.util.EventListener;

public class pantalla_login extends AppCompatActivity {

    View v;
    EditText etId , etPassword;
    Button btnIngresar, btnNuevo;
    TextView tvCabecera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        etId = (EditText)findViewById(R.id.etId);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnIngresar = (Button)findViewById(R.id.btnIngresar);
        btnNuevo = (Button)findViewById(R.id.btnNuevo);
        tvCabecera = (TextView)findViewById(R.id.tvCabecera);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = etId.getText().toString(),
                        password = etPassword.getText().toString();

            }
        });


        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pantalla_login.this,pantalla_registro.class);
                startActivity(i);
            }
        });


    }

}