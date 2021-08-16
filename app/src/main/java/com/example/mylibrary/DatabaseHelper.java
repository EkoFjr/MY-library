package com.example.mylibrary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContextValues;
import android.database.Cursor;
import java.util.ArrayList;
import android.util.Log;

public class DatabaseHelper {
    public static String DATABASE_NAME = "student_databese";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_STUDENTS = "students";
    private static final String KEY_ID = "id";
    private static final String KEY_FIRSTNAME = "name";

    private static final String CREATE_TABLE_STUDENTS = "CREATE TABLE"
            + TABLE_STUDENTS + "(" + KEY_ID + "INTERGER PRIMARY KEY AUTOINCREMENT," + KEY_FIRSTNAME + "TEXT );";

    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.d("table", CREATE_TABLE_STUDENTS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_STUDENTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS'" + TABLE_STUDENTS + "'");
        onCreate(db);
    }

    public long addSudentDetai(String student){
        SQLiteDatabase db = this.getWritableDatabase();
        ContextValues values = new
    }

    private SQLiteDatabase getWritableDatabase() {
    }

}