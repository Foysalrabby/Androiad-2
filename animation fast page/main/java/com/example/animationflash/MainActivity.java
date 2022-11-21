package com.example.animationflash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private static int Spaflch_scrren=5000;
  Animation topamin ,bottomanim;
  ImageView imageflash;
  TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageflash=findViewById(R.id.imageflash);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);

        topamin= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        imageflash.setAnimation(topamin);
        textView1.setAnimation(bottomanim);
        textView2.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
             startActivity(new Intent(MainActivity.this,Dashboard.class));
             finish();
            }
        },Spaflch_scrren);


    }
}