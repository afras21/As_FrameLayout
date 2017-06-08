package com.example.afrasali.as_framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RelativeLayout)findViewById(R.id.R1);
        r2=(RelativeLayout)findViewById(R.id.R2);
         r1.setVisibility(View.GONE);
    }
    public void nClick(View view){
        r1.setVisibility(View.GONE);
        r2.setVisibility(View.VISIBLE);
    }
    public void cClick(View view){
        r1.setVisibility(View.VISIBLE);
        r2.setVisibility(View.GONE);
    }
}
