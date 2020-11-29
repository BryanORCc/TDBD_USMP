package com.example.vision_2020.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.vision_2020.Clases.Usuarios;

public class ConexionSQLiteDB {

    //Bryan - Variable creada para validar si se cargo el nuevo registro
    public int validar;

    //Bryan - Clase que crea la conexion y la Base de datos
    public SQLiteDatabase CreacionBaseDeDatos(Context c){
        /*Bryan -En los parametros se coloca:
        Parametro 1: "El nombre que se le dio a nuestro variable tipo Context";
        Parametro 2: "En este se coloca el nombre de la base de datos que se quiere crear, la cual almacenara nuestra tabla";
        Por lo tanto, se debe crear esta nueva conexion, como un objetivo de nuestra clase que crea las tablas;
        Parametro 3: "Investigar el porque se coloca null";
        Parametro 4: "Numero de nuestra version"*/

        ConexionSQLiteTabla DataBase = new ConexionSQLiteTabla(c, "Vision2020",null, 1 );
        SQLiteDatabase DB = DataBase.getWritableDatabase();
        return DB;
    }

    //Metodo de insercion
    public void CargarUsuario(Context c, Usuarios u){
        String CargarRegistro = "insert into Usuarios values('" + u.getCodigoU() + "', '" + u.getIdU() + "','" + u.getPasswordU() + "'," + u.getNivelU() + ");";
        SQLiteDatabase db = this.CreacionBaseDeDatos(c);

        try {
            db.execSQL(CargarRegistro);
            validar = 1;
        }catch (Exception e){
            validar = 0;
        }
    }
}
