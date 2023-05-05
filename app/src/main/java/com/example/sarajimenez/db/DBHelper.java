package com.example.sarajimenez.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NOMBRE="examen_sara.db";
    public static final String TABLE_REGISTROS="registro";

    public DBHelper (@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    sqLiteDatabase.execSQL("CREATE TABLE " +
            TABLE_REGISTROS +
                "(" +
                "DNI TEXT PRIMARY KEY NOT NULL," +
                "nombre_completo TEXT NOT NULL," +
                "correo_electronico TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade (SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_REGISTROS);
        onCreate(sqLiteDatabase);
    }
}
