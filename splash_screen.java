activity_main.xml 
<?xml version="1.0" encoding="utf-8"?> 
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent"> 
 
    <RelativeLayout 
        android:id="@+id/splash_screen" 
        android:layout_width="match_parent" 
        android:layout_height="match_parent" 
        android:background="#800080" 
        android:gravity="center" 
        android:padding="16dp"> 
 
        <ProgressBar 
            android:id="@+id/progress_Bar" 
            style="?android:attr/progressBarStyle" 
            android:layout_width="wrap_content" 
            android:layout_height="wrap_content" 
            android:layout_marginStart="16dp" 
            android:layout_marginTop="16dp" 
            android:layout_centerHorizontal="true"
   android:indeterminate="true"/> 
 
        <TextView 
            android:id="@+id/textView" 
            android:layout_width="wrap_content" 
            android:layout_height="wrap_content" 
            android:text="Welcome to skyward app" 
            android:textSize="24dp" 
            android:textColor="#FF000000" 
            android:layout_below="@+id/progress_Bar" 
            android:layout_centerHorizontal="true" 
            android:layout_marginTop="16dp"/> 
    </RelativeLayout> 
 
    <LinearLayout 
        android:id="@+id/main_content" 
        android:layout_width="match_parent" 
        android:layout_height="match_parent" 
        android:orientation="vertical" 
        android:padding="16dp" 
        android:gravity="center" 
        android:visibility="gone"> 
 
        <TextView 
            android:id="@+id/welcome_text" 
            android:layout_width="wrap_content" 
            android:layout_height="wrap_content" 
            android:text="welcome to the main activity" 
            android:textSize="18sp" 
            android:textColor="#0000FF"/> 
    </LinearLayout> 
</FrameLayout> 
MainActivity.java 
package com.example.splashscreen; 
import android.os.Bundle; 
import android.os.Handler; 
import android.view.View; 
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity extends AppCompatActivity { 
    private static final int SPLASH_DISPLAY_LENGTH=10000; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        final View splashscreen=findViewById(R.id.splash_screen); 
        final View mainContent=findViewById(R.id.main_content); 
        new Handler().postDelayed(new Runnable() 
        { 
            @Override 
            public void run() 
            { 
                splashscreen.setVisibility(View.GONE); 
                mainContent.setVisibility(View.VISIBLE); 
            } 
        },SPLASH_DISPLAY_LENGTH); 
 
    } 
} 
