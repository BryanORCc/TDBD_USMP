package com.example.vision_2020.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSQLiteTabla extends SQLiteOpenHelper {

    public final String TablaUsuarios = "create table Usuarios(codigoU char(3) primary key, idU varchar(15), passwordU varchar(20), nivelU int)";

    public ConexionSQLiteTabla(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TablaUsuarios);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
