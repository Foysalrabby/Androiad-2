package com.example.audioadvance;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView  playbtn1;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbtn1=findViewById(R.id.playbtn1);

        playbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playbtn1.getTag() != null && playbtn1.getTag().toString().contains("Not_Playing") ){
                    if(mediaPlayer!= null) mediaPlayer.release();
                    mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.song2);
                    mediaPlayer.start();
                    playbtn1.setImageResource(R.drawable.stopbtn);
                    playbtn1.setTag("playing");
                }
                else{

                 if(mediaPlayer != null) mediaPlayer.release();
                 playbtn1.setImageResource(R.drawable.playbtn);
                 playbtn1.setTag("Not_Playing");

                }



            }
        });

    }
}