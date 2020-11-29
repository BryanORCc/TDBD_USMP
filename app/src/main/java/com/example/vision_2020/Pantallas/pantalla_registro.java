package com.example.vision_2020.Pantallas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vision_2020.Clases.Usuarios;
import com.example.vision_2020.DB.ConexionSQLiteDB;
import com.example.vision_2020.R;

public class pantalla_registro extends AppCompatActivity {

    TextView tvCabecera;
    EditText etID, etPSW, etNIVEL;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        tvCabecera = (TextView)findViewById(R.id.tvCabecera);
        tvCabecera.setShadowLayer(10,2,5, Color.GREEN);
        etID = (EditText)findViewById(R.id.etID);
        etPSW = (EditText)findViewById(R.id.etPSW);
        etNIVEL = (EditText)findViewById(R.id.etNIVEL);
        btnRegistrar = (Button)findViewById(R.id.btnRegistrar);

        final ConexionSQLiteDB conexion = new ConexionSQLiteDB();
        final Usuarios us = new Usuarios();

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                us.incremento++;
                if(us.incremento<10){
                    us.setCodigoU("U0"+us.incremento);
                }
                else{
                    us.setCodigoU("U"+us.incremento);
                }

                us.setIdU(etID.getText().toString());
                us.setPasswordU(etPSW.getText().toString());
                us.setNivelU(Integer.valueOf(etNIVEL.getText().toString()));
                conexion.CargarUsuario(getBaseContext(),us);
                if (conexion.validar==0){
                    Toast.makeText(getBaseContext(),"Registro fallido",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getBaseContext(),"****Registro exitoso****",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}