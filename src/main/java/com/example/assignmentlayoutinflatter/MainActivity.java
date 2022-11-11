package com.example.assignmentlayoutinflatter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
  LinearLayout sublayout;
  RelativeLayout mainlout;
  Button inbtn,bnbtn;
  LayoutInflater layoutInflater;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainlout=findViewById(R.id.mainlout);
        sublayout=findViewById(R.id.sublayout);
        inbtn=findViewById(R.id.inbtn);
        bnbtn=findViewById(R.id.bnbtn);

        layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(layoutInflater==null){
                    layoutInflater.inflate(R.layout.india,sublayout);
                }
                else {
                    sublayout.removeAllViews();
                    layoutInflater.inflate(R.layout.india,sublayout);
                }

            }
        });

        bnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(layoutInflater==null){
                    layoutInflater.inflate(R.layout.bangladesh,sublayout);
                }
                else {
                    sublayout.removeAllViews();
                    layoutInflater.inflate(R.layout.bangladesh,sublayout);
                }

            }
        });


    }
}