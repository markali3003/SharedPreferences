package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText ;
TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       editText = findViewById(R.id.edName);
       textView = findViewById(R.id.textView) ;


    }

    public void Save(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("savefile", Context.MODE_PRIVATE) ;
        SharedPreferences.Editor editor = sharedPreferences.edit() ;
       editor.putString("name",editText.getText().toString()) ;
        editor.apply();
    }
    public  void  load(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("savefile", Context.MODE_PRIVATE) ;
        String name = sharedPreferences.getString("name","NO_DATA") ;
        textView.setText(name);


    }

}