activity_main.xml 
<?xml version="1.0" encoding="utf-8"?> 
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    android:orientation="vertical" 
    android:padding="16dp" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent"> 
    <EditText 
        android:id="@+id/editName" 
        android:hint="Name" 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content"/> 
    <EditText 
        android:id="@+id/editEmail" 
        android:hint="Email" 
        android:inputType="textEmailAddress" 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content"/> 
    <Button 
        android:id="@+id/buttonSave" 
        android:text="Save" 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" /> 
    <TextView
     android:id="@+id/textViewResult" 
        android:text="" 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:paddingTop="20dp"/> 
</LinearLayout> 
 
MainActivity.java 
package com.example.db; 
import android.os.Bundle; 
import android.widget.Button; 
import android.widget.TextView; 
import android.widget.EditText; 
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity extends AppCompatActivity { 
    EditText editName, editEmail; 
    Button buttonSave; 
    TextView textViewResult; 
    SQLiteHelper dbHelper; 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        editName = findViewById(R.id.editName); 
        editEmail = findViewById(R.id.editEmail); 
        buttonSave = findViewById(R.id.buttonSave); 
        textViewResult = findViewById(R.id.textViewResult); 
        dbHelper = new SQLiteHelper(this); 
        buttonSave.setOnClickListener(v -> { 
            String name = editName.getText().toString(); 
            String email = editEmail.getText().toString(); 
            dbHelper.insertUser(name, email); 
            String allUsers = dbHelper.getAllUsers(); 
            textViewResult.setText(allUsers); 
        }); 
    } 
} 
 
SQLiteHelper.java 
package com.example.db; 
import android.database.sqlite.SQLiteDatabase; 
import android.content.Context; 
import android.content.ContentValues; 
import android.database.sqlite.SQLiteOpenHelper; 
import android.database.Cursor; 
public class SQLiteHelper extends SQLiteOpenHelper { 
    private static final String DB_NAME = "UserDB"; 
    private static final int DB_VERSION = 1; 
    public SQLiteHelper(Context context) { 
        super(context, DB_NAME, null, DB_VERSION); 
    } 
    @Override 
    public void onCreate(SQLiteDatabase db) { 
        db.execSQL("CREATE TABLE users (id INTEGER PRIMARY KEY AUTOINCREMENT, name 
TEXT, email TEXT)"); 
    } 
    @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { 
        db.execSQL("DROP TABLE IF EXISTS users"); 
        onCreate(db); 
    } 
    public void insertUser(String name, String email) { 
        SQLiteDatabase db = this.getWritableDatabase(); 
        ContentValues values = new ContentValues(); 
        values.put("name", name); 
        values.put("email", email); 
        db.insert("users", null, values); 
    } 
    public String getAllUsers() { 
        SQLiteDatabase db = this.getReadableDatabase(); 
        Cursor cursor = db.rawQuery("SELECT * FROM users", null); 
        StringBuilder sb = new StringBuilder(); 
 
        while (cursor.moveToNext()) { 
            sb.append("ID: ").append(cursor.getInt(0)) 
                    .append(", Name: ").append(cursor.getString(1)) 
                    .append(", Email: ").append(cursor.getString(2)) 
                    .append("\n"); 
        } 
        cursor.close(); 
        return sb.toString(); 
    } 
} 
