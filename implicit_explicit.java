
activity_main.xml 
<?xml version="1.0" encoding="utf-8"?> 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:id="@+id/main" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity"> 
 
 
    <Button 
        android:id="@+id/button" 
        android:layout_width="220dp" 
        android:layout_height="wrap_content" 
        android:layout_alignParentStart="true" 
        android:layout_alignParentTop="true" 
        android:layout_marginStart="112dp" 
        android:layout_marginTop="304dp" 
        android:onClick="onImplicitButtonClicked" 
        android:text="Implicit Intent" 
        tools:layout_editor_absoluteX="36dp" 
        tools:layout_editor_absoluteY="286dp" /> 
 
    <Button 
        android:id="@+id/button2" 
        android:layout_width="216dp" 
        android:layout_height="wrap_content" 
        android:layout_alignParentTop="true" 
        android:layout_alignParentEnd="true" 
        android:layout_marginTop="430dp" 
        android:layout_marginEnd="83dp" 
        android:onClick="onExplicitButtonClicked" 
        android:text="Explicit Intent" 
        tools:layout_editor_absoluteX="248dp" 
        tools:layout_editor_absoluteY="286dp" /> 
 
</RelativeLayout> 
 
activity_new.xml 
 
<?xml version="1.0" encoding="utf-8"?> 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:id="@+id/main" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity2"> 
    <TextView 
        android:id="@+id/tV" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:textSize="20dp" 
        android:text="Welcome to explicit intent"/> 
 
</RelativeLayout>

MainActivity.java 
package com.example.l4; 
 
import android.content.Intent; 
import android.net.Uri; 
import android.os.Bundle; 
import android.view.View; 
import androidx.appcompat.app.AppCompatActivity; 
 
public class MainActivity extends AppCompatActivity { 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
    } 
    public void onImplicitButtonClicked(View view) { 
        Uri url = Uri.parse("https://www.google.com"); 
        Intent i = new Intent(Intent.ACTION_VIEW, url); 
        startActivity(i); 
    } 
    public void onExplicitButtonClicked(View view) { 
        Intent i=new Intent(MainActivity.this,MainActivity2.class); 
        startActivity(i); 
    } 
} 
 
NewActivity.java 
package com.example.l4; 
 
import android.os.Bundle; 
import androidx.appcompat.app.AppCompatActivity; 
 
public class MainActivity2 extends AppCompatActivity 
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
        android:theme="@style/Theme.L4" 
        tools:targetApi="31">
  <activity 
            android:name=".MainActivity2" 
            android:exported="false" /> 
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
