package com.example.geometricshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalTriangleActivity extends AppCompatActivity {
      Button b,Reset;
      EditText e1,e2;
      TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_triangle);
        b=findViewById(R.id.btn1);
        e1=findViewById(R.id.b);
        e2=findViewById(R.id.h);
        t1=findViewById(R.id.t4);
        Reset=findViewById(R.id.b2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String height = e2.getText().toString();
                String base = e1.getText().toString();

                if (!height.equals("") && !base.equals("")) {
                    double he= Double.parseDouble(height);
                    double ba = Double.parseDouble(base);

                    double area = (ba * he) / 2;
                    t1.setText("Area= ("+ba+" ×"+ he+")×0.5"+ "\n"+
                            "Area=" + ba*he+"×0.5"+ "\n" +
                            "Area= " +area+"\n");
                } else {
                    t1.setText("Please enter both height and base.");
                }
                Reset.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset the editText fields, the result TextView, and make the reset button invisible
                e2.setText("");
                e1.setText("");
                t1.setText("");
                Reset.setVisibility(View.INVISIBLE);
                b.setVisibility(View.VISIBLE);
            }
        });

    }
}