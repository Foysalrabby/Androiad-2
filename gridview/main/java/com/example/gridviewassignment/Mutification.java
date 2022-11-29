package com.example.gridviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mutification extends AppCompatActivity {

    Button calculate1;
    EditText namottext;
    TextView textmul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutification);
        calculate1=findViewById(R.id.calculate1);
        textmul=findViewById(R.id.textmul);
        namottext=findViewById(R.id.namottext);




        calculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textmul.setText("");
                String textinput=namottext.getText().toString();
                Integer finputtext=Integer.parseInt(textinput);
                for(int i=1; i<=10; i++){
                    int mul=finputtext*i;
                    textmul.append(finputtext+"*"+i+" = "+mul+" \n");


                }

            }
        });

    }
}