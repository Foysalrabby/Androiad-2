package com.example.assignmentsharepeference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name,email,phone,password,comment;
    Button button,button1;
    TextView textview;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        password=findViewById(R.id.password);
        comment=findViewById(R.id.comment);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        textview=findViewById(R.id.textview);
        sharedPreferences=getSharedPreferences(""+getString(R.string.app_name),MODE_PRIVATE);
        editor=sharedPreferences.edit();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fname=name.getText().toString();
                String femail=email.getText().toString();
                String fphone=phone.getText().toString();
                String fpassword=password.getText().toString();
                String fcomment=comment.getText().toString();

                editor.putString("name",""+fname);
                editor.putString("email",""+femail);
                editor.putString("phone",""+fphone);
                editor.putString("password",""+fpassword);
                editor.putString("comment",""+fcomment);

                editor.apply();

            }
        });

      button1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              textview.append("");
              String ffname=sharedPreferences.getString("name","defaultvalue");
              String ffemail=sharedPreferences.getString("email","defaultvalue");
              String ffphone=sharedPreferences.getString("phone","defaultvalue");
              String ffpassword=sharedPreferences.getString("password","defaultvalue");
              String ffcomment=sharedPreferences.getString("name","defaultvalue");

              textview.append(ffname+"\n"+ffemail+"\n"+ffphone+"\n"+ffpassword+"\n"+ffcomment);
          }
      });

    }
}