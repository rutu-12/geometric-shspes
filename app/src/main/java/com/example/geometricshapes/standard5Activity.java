package com.example.geometricshapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class standard5Activity extends AppCompatActivity {
     CardView cd,re,sq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard5);
        cd=findViewById(R.id.cd_1);
        re=findViewById(R.id.cd_2);
        sq=findViewById(R.id.cd_3);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard5Activity.this, circleActivity.class);
                startActivity(intent);
            }
            });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard5Activity.this, RectangleActivity.class);
                startActivity(intent);
            }
        });
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard5Activity.this, SquareActivity.class);
                startActivity(intent);
            }
        });
    }
}