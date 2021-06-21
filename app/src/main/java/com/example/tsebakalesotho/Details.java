package com.example.tsebakalesotho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    TextView textTitle,textfact1,textfact2,textfact3;
    ImageView mainImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textTitle = findViewById(R.id.title);
        mainImage= findViewById(R.id.mainImage);
        textfact1= findViewById(R.id.textView3);
        textfact2= findViewById(R.id.textView4);
        textfact3= findViewById(R.id.textView5);


        Intent i = getIntent();
        int image=i.getIntExtra("image",1);
        String title= i.getStringExtra("title");
        String fact1=i.getStringExtra("fact1");
        String fact2=i.getStringExtra("fact2");
        String fact3=i.getStringExtra("fact3");

        textTitle.setText(title);
        mainImage.setImageResource(image);
        textfact1.setText(fact1);
        textfact2.setText(fact2);
        textfact3.setText(fact3);
    }
}