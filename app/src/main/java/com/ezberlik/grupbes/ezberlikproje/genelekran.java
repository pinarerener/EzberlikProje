package com.ezberlik.grupbes.ezberlikproje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class genelekran extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genelekran);

        Button Bugünkü_kelimelerim=(Button)findViewById(R.id.button11);
        Button Ezberlediklerim=(Button)findViewById(R.id.button12);
        Button Favorilerim=(Button)findViewById(R.id.button13);
        Button Günlük_Quiz=(Button)findViewById(R.id.button14);
        Button Haftalık_Quiz=(Button)findViewById(R.id.button15);

        Bugünkü_kelimelerim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Ezberlediklerim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Favorilerim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Günlük_Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Haftalık_Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
