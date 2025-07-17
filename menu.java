activity_main.xml 
 
<?xml version="1.0" encoding="utf-8"?> 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:id="@+id/main" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
 
    android:background="@drawable/e_commerce" 
    tools:context=".MainActivity"> 
 
 
    <TextView 
        android:id="@+id/textView" 
        android:layout_width="286dp" 
        android:layout_height="65dp" 
        android:layout_alignParentStart="true" 
        android:layout_alignParentTop="true" 
        android:layout_marginStart="59dp" 
        android:layout_marginTop="63dp" 
        android:text="Welcome to E-Commerce" 
        android:textColor="#F11D1D" 
        android:textColorLink="#F31818" 
        android:textSize="24sp" 
        android:textStyle="bold|italic" /> 
 
</RelativeLayout> 
 
menus.xml 
 
<?xml version="1.0" encoding="utf-8"?> 
<menu xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto"> 
        <item 
            android:id="@+id/search" 
            android:icon="@drawable/search" 
            app:showAsAction="always" 
            android:title="search" /> 
        <item android:id="@+id/Refresh" 
            android:title="Refresh" 
            android:icon="@drawable/refresh" 
            app:showAsAction="always" /> 
        <item android:id="@+id/Addtocart" 
            android:title="Addtocart"/> 
        <item android:id="@+id/settings" 
            android:title="settings"/> 
</menu> 
 
MainActivity.java 
 
package com.example.l7; 
import android.os.Bundle; 
import android.view.Menu; 
import android.view.MenuInflater; 
import android.view.MenuItem; 
import android.widget.Toast; 
import androidx.annotation.NonNull; 
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity { 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
    } 
    @Override 
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) { 
        MenuInflater inflater = getMenuInflater(); 
        inflater.inflate(R.menu.menus, menu); 
        return true; 
    } 
    @Override 
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { 
        if (item.getItemId() == R.id.search) { 
            Toast.makeText(this, "Search Successfull", Toast.LENGTH_SHORT).show(); 
        } 
        if (item.getItemId() == R.id.Refresh) { 
            Toast.makeText(this, "Refresh Successfull", Toast.LENGTH_SHORT).show(); 
        } 
        if (item.getItemId() == R.id.Addtocart) { 
            Toast.makeText(this, "Addtocart Successfull", Toast.LENGTH_SHORT).show(); 
        } 
        if (item.getItemId() == R.id.settings) { 
            Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show(); 
        } 
        return super.onOptionsItemSelected(item); 
    } 
} 
AndroidManifest.xml 
 
<?xml version="1.0" encoding="utf-8"?> 
<manifest xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:tools="http://schemas.android.com/tools"> 
 
    <application 
        android:allowBackup="true" 
        android:dataExtractionRules="@xml/data_extraction_rules" 
        android:fullBackupContent="@xml/backup_rules" 
        android:icon="@mipmap/ic_launcher" 
        android:label="@string/app_name" 
        android:roundIcon="@mipmap/ic_launcher_round" 
        android:supportsRtl="true" 
        android:theme="@style/Theme.AppCompat.Light" 
        tools:targetApi="31"> 
        <activity 
            android:name=".MainActivity" 
            android:exported="true"> 
            <intent-filter> 
                <action android:name="android.intent.action.MAIN" /> 
                <category android:name="android.intent.category.LAUNCHER" /> 
            </intent-filter> 
        </activity> 
    </application> 
 
</manifest> 
