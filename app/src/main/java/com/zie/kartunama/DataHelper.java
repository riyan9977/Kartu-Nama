package com.azhar.namecard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by riyan9977
 */

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "kontak.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table namecard(no integer primary key, nama text null, tgl text null, tlp text null, alamat text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO namecard (no, nama, tgl, tlp, alamat) VALUES ('1', 'Riyan Hidayat', '1989-03-11', '081217390073','Karangmenggah');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
    }
}
