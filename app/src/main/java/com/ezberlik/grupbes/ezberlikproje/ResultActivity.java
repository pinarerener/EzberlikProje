package com.ezberlik.grupbes.ezberlikproje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView) findViewById(R.id.result);

        Intent intent=getIntent();
        int finalScore= intent.getIntExtra("level",0);
        if(finalScore==1)
            result.setText("Beginner");
        else if(finalScore==2)
            result.setText("Elementary");
        else if(finalScore==3)
            result.setText("Pre-Intermediate");
        else if(finalScore==4)
            result.setText("Intermediate");
        else if(finalScore==5)
            result.setText("Upper-Intermediate");
        else if(finalScore==6)
            result.setText("Advanced");
    }
}
