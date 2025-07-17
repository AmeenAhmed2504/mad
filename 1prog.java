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
    android:id="@+id/textview" 
    android:layout_width="wrap_content" 
    android:layout_height="wrap_content" 
    android:textSize="20dp" 
    android:text=" Hello World " /> 
</RelativeLayout>

  
MainActivity.java 
 
package com.helloworld; 
import android.os.Bundle; 
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity1 extends AppCompatActivity 
{ 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main2); 
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
        android:theme="@style/Theme.Helloworld" 
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
