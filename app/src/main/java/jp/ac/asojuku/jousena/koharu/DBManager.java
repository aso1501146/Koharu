package jp.ac.asojuku.jousena.koharu;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

/**
 * Created by m-its on 2017/06/08.
 */

public class DBManager extends SQLiteOpenHelper{


    public DBManager(Context context){
        super(context,"koharu.db",null,1);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS "
                + "trip(distination TEXT,detail text,start_date TEXT,goal_date TEXT,"
                +"necessary_date TEXT,target_save INTEGER,current_save INTEGER)");

        db.execSQL("CREATE TABLE IF NOT EXISTS memoText(title TEXT,contents TEXt)");

        db.execSQL("CREATE TABEL IF NOT EXISTS "
                +"memoCheck(title TEXT,item1 TEXT,item2 TEXT,item3 TEXT,item4 TEXT,item5 TEXT"
                +",item6 TEXT,item7 TEXT,item8 TEXT,item9 TEXT,item10 TEXT"
                +",item11 TEXT,item12 TEXT,item13 TEXT,item14 TEXT,item15 TEXT"
                +",item16 TEXT,item17 TEXT,item18 TEXT,item19 TEXT,item20 TEXT)");

        db.execSQL("CREATE TABLE IF NOT EXISTS "
                +"history(history_code INTEGER,destination TEXT)");
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){
        db.execSQL("DROP TABLE trip,memoText,memoCheck,history");
        onCreate(db);
    }

}
