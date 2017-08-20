package com.ezberlik.grupbes.ezberlikproje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class basitekran extends AppCompatActivity {

    TextView ad;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basitekran);

        Button Başla=(Button)findViewById(R.id.button7);


        Başla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }




}
