package com.example.fadlianugrahemas.belajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button plus;
    Button min;
    TextView nilaiB;
    private int numin;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         nilaiB = (TextView)findViewById(R.id.nilai);
         plus = (Button) findViewById(R.id.plus);
         min  = (Button) findViewById(R.id.min);
        String num = (String) nilaiB.getText().toString();
        numin = Integer.parseInt(num);
        Log.v(LOG_TAG, "Angka =" + numin);
        Toast.makeText(this,"angka skrg "+numin,Toast.LENGTH_SHORT).show();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numin++;
                nilaiB.setText("" + numin);
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numin--;
                nilaiB.setText(""+numin);
            }
        });
    }
//    public void increment(View view){
//        try {
//            numin++;
//            nilaiB.setText(""+numin);
//        }catch (Exception e){
//            Log.e(LOG_TAG,"Error", e);
//        }
//    }
//    public void decrement(View view){
//        try{
//        numin--;
//        nilaiB.setText(""+numin);}catch (Exception e){
//            Log.e(LOG_TAG,"Error", e);
//        }
//    }
}
