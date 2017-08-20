package com.ezberlik.grupbes.ezberlikproje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button BeginnerA1=(Button)findViewById(R.id.button);
        Button ElementaryA2=(Button)findViewById(R.id.button2);
        Button PreIntermediateB1=(Button)findViewById(R.id.button3);
        Button IntermediateB2=(Button)findViewById(R.id.button4);
        Button UpperIntermediateC1=(Button)findViewById(R.id.button5);
        Button AdvancedC2=(Button)findViewById(R.id.button6);



        BeginnerA1.setOnClickListener(new View.OnClickListener() {

                                          @Override
                                          public void onClick(View view) {
                                              //Kodlar buraya
                                          }
                                      }
        );

        ElementaryA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        PreIntermediateB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        IntermediateB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        UpperIntermediateC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        AdvancedC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






    }

}
