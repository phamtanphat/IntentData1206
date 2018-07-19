package com.ptp.phamtanphat.intentdata1206;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnString,btnInteger;
    static final String chuoi = "chuoi";
    static final String so = "so";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnString = findViewById(R.id.buttonIntentString);
        btnInteger = findViewById(R.id.buttonIntentInteger);

        btnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushData(chuoi,"Chao main 2");
            }
        });

        btnInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushData(so,30);
            }
        });
    }
    public <F> void pushData(String key , F value){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        if (value instanceof  String){
            intent.putExtra(key, (String) value);
        }
        if (value instanceof  Integer){
            intent.putExtra(key, (Integer) value);
        }
        startActivity(intent);
    }
}
