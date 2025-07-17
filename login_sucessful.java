activity_main.xml 
<?xml version="1.0" encoding="utf-8"?> 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:id="@+id/main" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    android:background="@drawable/login1" 
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
        android:hint="username" 
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
        android:hint="password" 
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
import android.text.TextUtils; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText;
import android.widget.Toast; 
import androidx.appcompat.app.AppCompatActivity; 
 
public class MainActivity extends AppCompatActivity { 
    private EditText editTextUsername, editTextPassword; private Button buttonlogin; 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        editTextUsername=findViewById(R.id.editTextText); 
        editTextPassword=findViewById(R.id.editTextText2); 
        buttonlogin=findViewById(R.id.button); 
 
        buttonlogin.setOnClickListener(new View.OnClickListener() { 
            @Override 
        public void onClick(View v) 
        { 
            String username=editTextUsername.getText().toString().trim(); 
            String password=editTextPassword.getText().toString().trim(); 
            if(TextUtils.isEmpty(username)||TextUtils.isEmpty(password)) 
            { 
                Toast.makeText(MainActivity.this," Username or Password 
 cannot not be empty",Toast.LENGTH_SHORT).show(); 
            } 
            else 
            { 
                if (username.equals("admin")&& password.equals("pass")) 
                { 
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show(); 
                } else 
                { 
                    Toast.makeText(MainActivity.this,"Invalid username or password", 
Toast.LENGTH_SHORT).show(); 
                } 
            } 
        } 
        }); 
    } 
} 
