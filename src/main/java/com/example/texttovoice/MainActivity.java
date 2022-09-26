package com.example.texttovoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    TextToSpeech texttospeach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edittext);
        button=findViewById(R.id.button);
        texttospeach=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
;
                texttospeach.speak(""+editText.getText().toString(),TextToSpeech.QUEUE_FLUSH,null,null);

            }
        });


    }
}