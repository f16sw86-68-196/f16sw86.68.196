package com.example.arsalan.myapplication21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3;
    Button b1,b2;
    ImageView image;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.tv);
        t2 = (TextView) findViewById(R.id.tv2);
        t3 = (TextView) findViewById(R.id.tv3);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        image = findViewById(R.id.imageView);
        final String array[]={"Misbah Zahra" , "Rameen Faique" , "Sahar Baloch"};
        final String a[]={"F16SW86", "F16SW68", "F16SW196"};
        final String b[]={"misbahzahra12@gmail.com","rameenfaique12@gmail.com","saharbaloch196@gmail.com"};



        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                counter++;
                if(counter==array.length) counter=0;

                t1.setText(array[counter]);
                t2.setText(a[counter]);
                t3.setText(b[counter]);

            }

        });
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                counter--;
                if(counter<0) counter=array.length-1;

                t1.setText(array[counter]);
                t2.setText(a[counter]);
                t3.setText(b[counter]);

            }

        });


    }
}
