activity_main.xml 
<?xml version="1.0" encoding="utf-8"?> 
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:id="@+id/main" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity"> 
 
    <LinearLayout 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:background="@color/white" 
        android:orientation="vertical" 
        android:padding="16dp"> 
    <TextView 
            android:id="@+id/textView" 
            android:layout_width="243dp" 
            android:layout_height="wrap_content" 
            android:text="This is a TextView" /> 
 
        <EditText 
            android:id="@+id/editText" 
            android:layout_width="381dp" 
            android:layout_height="wrap_content" 
            android:ems="10" 
            android:inputType="text" 
            android:minHeight="48dp" 
            android:text="enter your text here" /> 
 
        <Button 
            android:id="@+id/button" 
            android:layout_width="113dp" 
            android:layout_height="wrap_content" 
            android:text="click me" /> 
 
        <CheckBox 
            android:id="@+id/checkBox" 
            android:layout_width="match_parent" 
            android:layout_height="wrap_content" 
            android:text="checkme" /> 
        <RadioGroup 
            android:id="@+id/radioGroup" 
            android:layout_width="wrap_content" 
            android:layout_height="wrap_content" 
            android:orientation="vertical" 
            android:layout_marginBottom="16dp"> 
 
        <RadioButton 
            android:id="@+id/radioButton" 
            android:layout_width="match_parent" 
            android:layout_height="wrap_content" 
            android:text="option 1" /> 
 
        <RadioButton 
            android:id="@+id/radioButton3" 
            android:layout_width="match_parent" 
            android:layout_height="wrap_content" 
            android:text="option 2" /> 
    </RadioGroup>
    <Switch 
            android:id="@+id/switch1" 
            android:layout_width="378dp" 
            android:layout_height="wrap_content" 
            android:minHeight="48dp" 
            android:text="Switch" /> 
 
        <Spinner 
            android:id="@+id/spinner" 
            android:layout_width="match_parent" 
            android:layout_height="wrap_content" 
            android:minHeight="48dp" /> 
 
        <ProgressBar 
            android:id="@+id/progressBar" 
            style="?android:attr/progressBarStyle" 
            android:layout_width="match_parent" 
            android:layout_height="wrap_content" /> 
        <DatePicker 
            android:id="@+id/datepicker" 
            android:layout_width="wrap_content" 
            android:layout_height="wrap_content"/> 
        <TimePicker 
            android:id="@+id/timepicker" 
            android:layout_width="wrap_content" 
            android:layout_height="wrap_content"/> 
        <NumberPicker 
            android:id="@+id/numberpicker" 
            android:layout_width="wrap_content" 
            android:layout_height="wrap_content" 
            android:layout_marginBottom="16dp"/> 
    </LinearLayout> 
</ScrollView> 
 
MainActivity.java 
package com.example.timedate; 
import android.os.Bundle; 
import android.widget.Button; 
import android.widget.CheckBox; 
import android.widget.DatePicker; 
import android.widget.EditText; 
import android.widget.NumberPicker; 
import android.widget.ProgressBar; 
import android.widget.RadioButton; 
import android.widget.RadioGroup; 
import android.widget.Spinner; 
import android.widget.Switch; 
import android.widget.TextView; 
import android.widget.TimePicker; 
import androidx.appcompat.app.AppCompatActivity; 
import com.example.timedate.R; 
public class MainActivity extends AppCompatActivity { 
    private TextView textView; 
    private EditText editText; 
    private Button button;private CheckBox checkBox; 
    private RadioGroup radioGroup; 
    private RadioButton radioButton1; 
    private RadioButton radioButton2; 
    private Switch switch1; 
    private Spinner spinner; 
    private ProgressBar progressBar; 
    private DatePicker datePicker; 
    private TimePicker timePicker; 
    private NumberPicker numberPicker; 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        textView = findViewById(R.id.textView); 
        editText = findViewById(R.id.editText); 
        button = findViewById(R.id.button); 
        checkBox = findViewById(R.id.checkBox); 
        radioGroup=findViewById(R.id.radioGroup); 
        radioButton1 = findViewById(R.id.radioButton); 
        radioButton2 =findViewById(R.id.radioButton3); 
        switch1=findViewById(R.id.switch1); 
        spinner =findViewById(R.id.spinner); 
        progressBar = findViewById(R.id.progressBar); 
        datePicker =findViewById(R.id.datepicker); 
        timePicker = findViewById(R.id.timepicker); 
        numberPicker =findViewById(R.id.numberpicker); 
        numberPicker.setMinValue(0); 
        numberPicker.setMaxValue (100); 
    } 
 
}
