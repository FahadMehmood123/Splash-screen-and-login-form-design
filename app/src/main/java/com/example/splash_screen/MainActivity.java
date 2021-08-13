package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView5);
        txt=findViewById(R.id.txt0);
        splash();
        text();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        },3000);
    }
    public void splash(){
        Animation splash= AnimationUtils.loadAnimation(this,R.anim.splash_screen);
        img.startAnimation(splash);
    }

    public void text(){
        Animation text=AnimationUtils.loadAnimation(this,R.anim.text_anim);
        txt.startAnimation(text);
    }


}