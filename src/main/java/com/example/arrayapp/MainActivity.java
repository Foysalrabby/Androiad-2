package com.example.arrayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text1);

//        String [] name= new String[4];
        String [] name= new String[]{"rabbi", "rafi","ellenmax"};
        int [] number={10,344,34,51};
//        int [] number=new int[30];
//        number[0]=30;
//        number[2]=31;
//        number[3]=32;
//         name[0]="rabbbi";
//        name[1]="rafi";
//        name[2]="ellenmax";

        for(int i=0; i< number.length;i++){
            text1.append(number[i]+"\n");
        }



    }
}