package tw.edu.pu.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


public class MyDBHelper extends SQLiteOpenHelper {
    //資料庫名稱 一般的應用都不需要修改
    public static final String DATABASE_NAME="mydata.db";
    //資料庫版本 資料庫結構改變的時候要更改這個數字 通常是加一
    public static final int VERSION=1;
    //資料庫物件 固定的欄位變數
    private static SQLiteDatabase database;

    //建構子 一般的應用都不需要修改
    public MyDBHelper(Context context,String name,CursorFactory factory, int version){
        super(context,name,factory,version);
    }
    //需要使用資料庫的元件呼叫這個方法取得資料庫物件，一般的應用都不需要修改
    public static SQLiteDatabase getDatabase(Context context){
        if(database==null||!database.isOpen()){
            database=new MyDBHelper(context,DATABASE_NAME,null,VERSION).getWritableDatabase();
        }
        return database;
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        //建立應用程式需要的表格
        db.execSQL(PlaceDAO.CREATE_TABLE);
        //會再回來完成這裡需要執行的工作
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        //刪除原有的表格
        db.execSQL("DROP TABLE IF EXISTS "+PlaceDAO.TABLE_NAME);
        //會再回來完成這裡需要執行的工作
        //呼叫onCreate建立新版的表格
        onCreate(db);
    }
}