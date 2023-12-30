package com.example.geometricshapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class standard9Activity extends AppCompatActivity {
   CardView cd,re,squ,cu,cub,par,tri,tr,cy,rho,cn,sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard9);
        cd=findViewById(R.id.cir);
        re=findViewById(R.id.rec);
        squ=findViewById(R.id.sq);
        cu=findViewById(R.id.c1);
        cub=findViewById(R.id.c2);
        par=findViewById(R.id.par);
        tri=findViewById(R.id.tri);
        tr=findViewById(R.id.Trap);
        cy=findViewById(R.id.i6);
        rho=findViewById(R.id.rhom);
        cn=findViewById(R.id.cone);
        sp=findViewById(R.id.sphere);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, circleActivity.class);
                startActivity(intent);
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, RectangleActivity.class);
                startActivity(intent);
            }
        });
        squ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, SquareActivity.class);
                startActivity(intent);
            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, CubeActivity.class);
                startActivity(intent);
            }
        });
        cub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, CuboidActivity.class);
                startActivity(intent);
            }
        });
        par.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, ParaActivity.class);
                startActivity(intent);
            }
        });
        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, TriangleActivity.class);
                startActivity(intent);
            }
        });
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, TrapActivity.class);
                startActivity(intent);
            }
        });
        cy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, CylinderActivity.class);
                startActivity(intent);
            }
        });
        rho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, RhombusActivity.class);
                startActivity(intent);
            }
        });
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, coneActivity.class);
                startActivity(intent);
            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(standard9Activity.this, sphereActivity.class);
                startActivity(intent);
            }
        });

    }
}