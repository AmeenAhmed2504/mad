 
activity_main.xml 
 
<?xml version="1.0" encoding="utf-8"?> 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:id="@+id/main" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    android:background="@drawable/images" 
    tools:context=".MainActivity"> 
 
 
    <TextView 
        android:id="@+id/textView" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:layout_alignParentStart="true" 
        android:layout_alignParentTop="true" 
        android:layout_marginStart="116dp" 
        android:layout_marginTop="131dp" 
        android:text="USER NAME" 
        android:textSize="24sp" 
        android:textStyle="bold" /> 
 
    <EditText 
        android:id="@+id/editTextText" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:layout_below="@id/textView" 
        android:layout_marginStart="85dp" 
 android:layout_marginTop="25dp" 
        android:ems="10" 
        android:inputType="text" 
        android:text="Enter the Name" /> 
 
    <TextView 
        android:id="@+id/textView2" 
        android:layout_width="143dp" 
        android:layout_height="36dp" 
        android:layout_below="@id/editTextText" 
        android:layout_alignParentEnd="true" 
        android:layout_marginTop="35dp" 
        android:layout_marginEnd="147dp" 
        android:text="PASSWORD" 
        android:textSize="24sp" 
        android:textStyle="bold" /> 
 
    <EditText 
        android:id="@+id/editTextText2" 
 
        android:layout_width="222dp" 
        android:layout_height="55dp" 
        android:layout_below="@id/textView" 
        android:layout_alignParentStart="true" 
        android:layout_marginStart="83dp" 
        android:layout_marginTop="173dp" 
        android:ems="10" 
        android:inputType="text" 
        android:text="Enter the Password" /> 
    <Button 
        android:id="@+id/button" 
        android:layout_width="301dp" 
        android:layout_height="wrap_content" 
        android:layout_alignParentEnd="true" 
        android:layout_alignParentBottom="true" 
        android:layout_marginEnd="58dp" 
        android:layout_marginBottom="141dp" 
        android:text="LOGIN" 
        android:textSize="20sp" 
        android:textStyle="bold" /> 
</RelativeLayout> 
 
MainActivity.java 

package com.example.loginapp; 
import android.os.Bundle; 
import androidx.appcompat.app.AppCompatActivity; 
 
public class MainActivity extends AppCompatActivity { 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
    } 
}
