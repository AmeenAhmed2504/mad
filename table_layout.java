activity_main.xml 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
<?xml version="1.0" encoding="utf-8"?> 
<TableLayout 
xmlns:android="http://schemas.android.com/apk/res/android" 
xmlns:app="http://schemas.android.com/apk/res-auto" 
xmlns:tools="http://schemas.android.com/tools" 
android:id="@+id/main" 
android:layout_width="match_parent" 
android:layout_height="match_parent" 
android:paddingLeft="10dp" 
android:paddingRight="10dp" 
tools:context=".MainActivity"> 
  <TableRow android:background="#3A128C" android:padding="5dp"> 
  <TextView android:layout_width="wrap_content" 
    android:layout_height="wrap_content" 
    android:layout_weight="1" android:text="user id" 
    android:textColor="@color/white" 
    android:textAlignment="center"/>
  <TextView android:layout_width="wrap_content" 
    android:layout_height="wrap_content"
    android:layout_weight="1" android:text="user 
name " android:textColor="@color/white" 
android:textAlignment="center"/> 
 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="location" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
</TableRow> 
 
<TableRow android:background="#00ACFF" android:padding="5dp"> 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="1" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="A" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="Kundapura" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
</TableRow> 
 
<TableRow android:background="#01ACFF" android:padding="5dp"> 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" 
android:text="2" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="B" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="Mysore" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
</TableRow> 
 
<TableRow android:background="#00AAFD" android:padding="5dp">
  <TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="3" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="C" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
 
<TextView android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:layout_weight="1" android:text="Bangalore" 
android:textColor="@color/white" 
android:textAlignment="center"/> 
</TableRow> 
</TableLayout> 
  MainActivity.java 
package com.example.demo11; 
import android.os.Bundle; 
import androidx.appcompat.app.AppCompatActivity; import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
 
public class MainActivity extends AppCompatActivity {  
@Override 
protected void onCreate(Bundle savedInstanceState)  
    {  
     super.onCreate(savedInstanceState);  
     setContentView(R.layout.activity_main); 
    }); 
} 
}
