package com.example.gridviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmicalculator extends AppCompatActivity {

    TextView textadvice;
    EditText foottext,inchtext,weighttext;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
        foottext=findViewById(R.id.foottext);
        inchtext=findViewById(R.id.inchtext);
        weighttext=findViewById(R.id.weighttext);
        calculate=findViewById(R.id.calculate);
        textadvice=findViewById(R.id.textadvice);



        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  foottextv=foottext.getText().toString();
                float ffoottextv= (float) ((Float.parseFloat(foottextv))*0.3048);

                String  finchtext=inchtext.getText().toString();
                float ffinchtext= (float) (Float.parseFloat(finchtext)*0.0254);
                float finalvalue=(ffoottextv+ffinchtext);

                String  weighttextv=weighttext.getText().toString();
                float fweighttextv=Float.parseFloat(weighttextv);

                float bmivalue=(fweighttextv)/(finalvalue*finalvalue);

                textadvice.setText("");
                if(bmivalue>0 && bmivalue<17){
                   textadvice.setText("Yours bmi ="+bmivalue+" is low take food");
                }
                else if(bmivalue>17 && bmivalue<24){
                    textadvice.setText("Yours bmi ="+bmivalue+" You are fit");
                }
                else{
                    textadvice.setText("Yours bmi ="+bmivalue+" You are too fat take excercise");
                }

            }


        });




    }
}