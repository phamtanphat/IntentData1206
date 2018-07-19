package com.ptp.phamtanphat.intentdata1206;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
//        if (intent != null){
//            String chuoi = intent.getStringExtra("chuoi");
//            Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(this, "Khong co gia tri intent", Toast.LENGTH_SHORT).show();
//        }
        //Nhan chuoi
//        String ketqua = (intent != null) ? intent.getStringExtra(MainActivity.chuoi) : "Intent khong tai";
//        Toast.makeText(this, ketqua , Toast.LENGTH_SHORT).show();
       //Nhan so
        int ketqua = (intent != null) ? intent.getIntExtra(MainActivity.so,-1) : 0;
        Toast.makeText(this, ketqua + "" , Toast.LENGTH_SHORT).show();
    }
}
