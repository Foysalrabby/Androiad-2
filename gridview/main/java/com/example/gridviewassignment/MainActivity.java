package com.example.gridviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView  gridview;
    ArrayList<HashMap <String,String>> arrayList=new ArrayList();
    HashMap <String,String> hashMap=new HashMap();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview=findViewById(R.id.gridview);
        userdom();



        Myadapter myadapter=new Myadapter();
        gridview.setAdapter(myadapter);



    }

    //==================================================================
    //==================================================================
    //==================================================================

    private class Myadapter extends BaseAdapter{

       LayoutInflater layoutInflater;
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
              layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             View myview= layoutInflater.inflate(R.layout.item,viewGroup,false);
            LinearLayout layoutitem=myview.findViewById(R.id.layoutitem);
            ImageView layimage1=myview.findViewById(R.id.layimage1);
            TextView  laytext=myview.findViewById(R.id.laytext);

            HashMap<String,String> hashMap=arrayList.get(position);
            String fname=hashMap.get("name");
            String fimage=hashMap.get("image_url");

            Picasso.get().load(fimage)
                    .placeholder(R.drawable.rate2)
                    .into(layimage1);
            laytext.setText(fname);

            layoutitem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (fname.contains("BmI")){
                        startActivity(new Intent(MainActivity.this,Bmicalculator.class));

                    }
                    else if(fname.contains("Mul")){
                        startActivity(new Intent(MainActivity.this,Mutification.class));

                    }

                }
            });


            return myview;


        }
    }
    //==================================================================
    //==================================================================

    private void userdom(){
        HashMap hashMap=new HashMap<>();
        hashMap.put("name","BmI");
        hashMap.put("image_url","https://cdn-icons-png.flaticon.com/128/8862/8862711.png");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("name","Mul");
        hashMap.put("image_url","https://cdn-icons-png.flaticon.com/128/518/518705.png");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Home3");
        hashMap.put("image_url","https://cdn-icons-png.flaticon.com/128/8862/8862711.png");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Home4");
        hashMap.put("image_url","https://cdn-icons-png.flaticon.com/128/518/518705.png");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Home5");
        hashMap.put("image_url","https://t4.ftcdn.net/jpg/00/82/56/49/240_F_82564983_L4jKxl7OQHh6sGH5t7zEcrleJuOdmpYx.jpg");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Home6");
        hashMap.put("image_url","https://t4.ftcdn.net/jpg/00/82/56/49/240_F_82564983_L4jKxl7OQHh6sGH5t7zEcrleJuOdmpYx.jpg");
        arrayList.add(hashMap);
    }


}