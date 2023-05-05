package com.example.sarajimenez.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbContactos extends DBHelper {

    Context context;

    public DbContactos(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarContacto(String nombre_completo, String NIF_DNI, String correo_electronico){

        long id = 0;

        try {
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre_completo", nombre_completo);
            values.put("NIF_DNI", NIF_DNI);
            values.put("correo_electronico", correo_electronico);

            id = db.insert(TABLE_REGISTROS, null, values);
        }catch (Exception ex){
            ex.toString();

        }
        return id;
    }
}
