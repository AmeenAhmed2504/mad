 
activity_main.xml 
<?xml version="1.0" encoding="utf-8"?> 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:id="@+id/main" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity">
 
<TextView 
        android:id="@+id/orientationchange" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:layout_alignParentStart="true" 
        android:layout_alignParentTop="true" 
        android:layout_marginStart="107dp" 
        android:layout_marginTop="406dp" 
        android:text="OrientationChange" 
        android:textSize="24sp" /> 
</RelativeLayout>


MainActivity.java 

package com.example.orientationchange; 
import android.graphics.Point; 
import android.os.Bundle; 
import android.view.Display; 
import android.view.WindowManager; 
import android.widget.TextView; 
import androidx.appcompat.app.AppCompatActivity; 
 
public class MainActivity extends AppCompatActivity { 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        TextView orientationMessage=findViewById(R.id.orientationchange); 
        WindowManager wm=(WindowManager) getSystemService(WINDOW_SERVICE); 
        Display d=wm.getDefaultDisplay(); 
        Point size=new Point(); 
        d.getSize(size); 
        int w=size.x; 
        int h=size.y; 
        if (w>h) { 
            orientationMessage.setText("Landscape Mode"); 
        } 
        else { 
            orientationMessage.setText("Portrait Mode"); 
 
        } 
    } 
} 

