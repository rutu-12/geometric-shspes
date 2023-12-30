package com.example.geometricshapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class standard6Activity extends AppCompatActivity {
    CardView cd,re,sq,is,sc,rt,eq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard6);
        cd=findViewById(R.id.cir);
        re=findViewById(R.id.rec);
        sq=findViewById(R.id.square);
        is=findViewById(R.id.iso);
        sc=findViewById(R.id.sc);
        rt=findViewById(R.id.rt);
        eq=findViewById(R.id.eq);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard6Activity.this, circleActivity.class);
                startActivity(intent);
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard6Activity.this, RectangleActivity.class);
                startActivity(intent);
            }
        });
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard6Activity.this, SquareActivity.class);
                startActivity(intent);
            }
        });
        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard6Activity.this, IsoActivity.class);
                startActivity(intent);
            }
        });
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard6Activity.this, scalenActivity.class);
                startActivity(intent);
            }
        });
        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard6Activity.this, rightActivity.class);
                startActivity(intent);
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard6Activity.this, equiActivity.class);
                startActivity(intent);
            }
        });

    }
}