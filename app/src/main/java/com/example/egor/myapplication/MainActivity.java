package com.example.egor.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
    }
    byte a = 0;
    byte b = 0;
    public void onClick(View view) {
        if(a==0) {
            imageView1.setImageResource(R.drawable.dog2);
            a++;
        }else if(a==1){
            imageView1.setImageResource(R.drawable.dog3);
            a++;
        }else if(a==2){
            imageView1.setImageResource(R.drawable.dog4);
            a++;
        }else if(a==3){
            imageView1.setImageResource(R.drawable.dog5);
            a++;
        }else{
            imageView1.setImageResource(R.drawable.dog);
            a=0;
        }
    }

    public void onClick2(View view) {
        if(a==0) {
            imageView2.setImageResource(R.drawable.a2);
            a++;
        }else if(a==1){
            imageView2.setImageResource(R.drawable.a3);
            a++;
        }else if(a==2){
            imageView2.setImageResource(R.drawable.a4);
            a++;
        }else if(a==3){
            imageView2.setImageResource(R.drawable.a5);
            a++;
        }else{
            imageView2.setImageResource(R.drawable.a1);
            a=0;
        }
    }
}
