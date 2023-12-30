package com.example.geometricshapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class class_selectActivity extends AppCompatActivity {
    CardView cd_5,cd_6,cd_7,cd_8,cd_9,cd_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_select);

        cd_5=findViewById(R.id.tex_5th);
        cd_6=findViewById(R.id.tex_6th);
        cd_7=findViewById(R.id.tex_7th);
        cd_8=findViewById(R.id.tex_8th);
        cd_9=findViewById(R.id.tex_9th);
        cd_10=findViewById(R.id.tex_10th);

        cd_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(class_selectActivity.this,standard5Activity.class);
                startActivity(intent);
            }
        });

        cd_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(class_selectActivity.this,standard6Activity.class);
                startActivity(intent);
            }
        });

        cd_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(class_selectActivity.this,standard7Activity.class);
                startActivity(intent);
            }
        });

        cd_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(class_selectActivity.this,standard8Activity.class);
                startActivity(intent);
            }
        });

        cd_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(class_selectActivity.this,standard9Activity.class);
                startActivity(intent);
            }
        });

        cd_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(class_selectActivity.this,standard10Activity.class);
                startActivity(intent);
            }
        });


    }
}