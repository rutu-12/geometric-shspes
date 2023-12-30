package com.example.geometricshapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class standard7Activity extends AppCompatActivity {
    CardView cd,re,squ,cu,cub,tri,rt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard7);
        cd=findViewById(R.id.cir);
        re=findViewById(R.id.rec);
        squ=findViewById(R.id.sq);
        cu=findViewById(R.id.cube);
        cub=findViewById(R.id.cuboid);
        tri=findViewById(R.id.tri);
        rt=findViewById(R.id.rt);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard7Activity.this, circleActivity.class);
                startActivity(intent);
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard7Activity.this, RectangleActivity.class);
                startActivity(intent);
            }
        });
        squ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard7Activity.this, SquareActivity.class);
                startActivity(intent);
            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard7Activity.this, CubeActivity.class);
                startActivity(intent);
            }
        });
        cub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard7Activity.this, CuboidActivity.class);
                startActivity(intent);
            }
        });
        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard7Activity.this, TriangleActivity.class);
                startActivity(intent);
            }
        });
        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard7Activity.this, rightActivity.class);
                startActivity(intent);
            }
        });
    }
}