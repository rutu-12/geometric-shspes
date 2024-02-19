package com.example.geometricshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalSquareActivity extends AppCompatActivity {
    Button b,Reset;
    EditText e1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_square);
        b=findViewById(R.id.btn1);
        e1=findViewById(R.id.s);
        t1=findViewById(R.id.t4);
        Reset=findViewById(R.id.b2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String side = e1.getText().toString();

                if ( !side.equals("")) {
                    double ss= Double.parseDouble(side);

                    double area = (ss*ss);
                    t1.setText("Area= ("+ss+" ×"+ ss+")"+ "\n"+
                            "Area=" +ss*ss+ "\n" +
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
                e1.setText("");
                t1.setText("");
                Reset.setVisibility(View.INVISIBLE);
                b.setVisibility(View.VISIBLE);
            }
        });

    }
    }
