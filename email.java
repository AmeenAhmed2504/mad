activity_main.xml 
<?xml version="1.0" encoding="utf-8"?> 
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    android:orientation="vertical" 
    android:padding="16dp"> 
 
    <EditText 
        android:id="@+id/email_address" 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:hint="Email Address" 
        android:inputType="textEmailAddress" /> 
 
    <EditText 
        android:id="@+id/email_subject" 
 android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:hint="Subject" 
        android:inputType="text" /> 
 
    <EditText 
        android:id="@+id/email_message" 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:hint="Message" 
        android:inputType="textMultiLine" 
        android:lines="5" 
        android:gravity="top" 
        android:scrollbars="vertical" /> 
 
    <Button 
        android:id="@+id/send_email" 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:text="Send Email" /> 
</LinearLayout> 
MainActivity.java 
package com.example.email; 
import android.content.Intent; 
import android.net.Uri; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
import androidx.appcompat.app.AppCompatActivity; 
import com.example.email.R; 
public class MainActivity extends AppCompatActivity { 
 
    private EditText emailAddressEditText; 
    private EditText emailSubjectEditText; 
    private EditText emailMessageEditText; 
    private Button sendEmailButton; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        emailAddressEditText = findViewById(R.id.email_address); 
        emailSubjectEditText = findViewById(R.id.email_subject); 
        emailMessageEditText = findViewById(R.id.email_message); 
        sendEmailButton = findViewById(R.id.send_email); 
        sendEmailButton.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                sendEmail(); 
            } 
        }); 
    } 
    private void sendEmail() { 
        String emailAddress = emailAddressEditText.getText().toString(); 
        String subject = emailSubjectEditText.getText().toString(); 
        String message = emailMessageEditText.getText().toString(); 
        Intent emailIntent = new Intent(Intent.ACTION_SEND); 
        emailIntent.setType("message/rfc822"); 
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{emailAddress}); 
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject); 
        emailIntent.putExtra(Intent.EXTRA_TEXT, message); 
 
        if (emailIntent.resolveActivity(getPackageManager()) != null) { 
            startActivity(Intent.createChooser(emailIntent, "Send Email Using:")); 
        } else { 
            Toast.makeText(this, "Email Client Not Installed", Toast.LENGTH_SHORT).show(); 
        } 
    } 
} 
AndroidManifest.xml 
<?xml version="1.0" encoding="utf-8"?> 
<manifest xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:tools="http://schemas.android.com/tools"> 
    <uses-permission android:name="android.permission.SEND_SMS" 
        tools:ignore="PermissionImpliesUnsupportedChromeOsHardware" /> 
    <application 
        android:allowBackup="true" 
        android:dataExtractionRules="@xml/data_extraction_rules" 
        android:fullBackupContent="@xml/backup_rules" 
        android:icon="@mipmap/ic_launcher" 
 android:label="@string/app_name" 
        android:roundIcon="@mipmap/ic_launcher_round" 
        android:supportsRtl="true" 
        android:theme="@style/Theme.Email" 
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
