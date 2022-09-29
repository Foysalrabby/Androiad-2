package com.example.programingbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mylayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylayout=findViewById(R.id.mylayout);

        for(int i=0; i<1000;i++){

            Button button=new Button(MainActivity.this);
            button.setText("Button"+i);
            mylayout.addView(button);

        }



    }
}