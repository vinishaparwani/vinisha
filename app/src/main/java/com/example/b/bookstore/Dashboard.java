package com.example.b.bookstore;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {
    Button btnscience,btnmath,btncomic,btnhealth,btntravel,btnhorror;

    TextView tvscience,tvmath,tvcomic,tvhealth,tvtravel,tvhorror;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        tvscience= (TextView) findViewById(R.id.tvscience);
        tvmath= (TextView) findViewById(R.id.tvmath);
        tvcomic= (TextView) findViewById(R.id.tvcomic);
        tvhealth= (TextView) findViewById(R.id.tvhealth);
        tvtravel= (TextView) findViewById(R.id.tvtravel);
        tvhorror= (TextView) findViewById(R.id.tvhorror);
        btnmath= (Button) findViewById(R.id.btnmath);
        btnscience= (Button) findViewById(R.id.btnscience);
        btncomic= (Button) findViewById(R.id.btncomic);
        btnhealth= (Button) findViewById(R.id.btnhealth);
        btntravel= (Button) findViewById(R.id.btntravel);
        btnhorror= (Button) findViewById(R.id.btnhorror);

        btnscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvscience.setBackgroundColor(Color.rgb(85,146,207));

                Intent i=new Intent(Dashboard.this,ScienceCategories.class);
                startActivity(i);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                Log.d("abc","show");

            }
        });
        btnmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmath.setBackgroundColor(Color.rgb(65,646,207));
            }
        });

        btncomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvcomic.setBackgroundColor(Color.rgb(95,146,207));
            }
        });

        btnhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvhealth.setBackgroundColor(Color.rgb(85,246,207));
            }
        });
        btntravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtravel.setBackgroundColor(Color.rgb(85,446,207));
            }
        });
        btnhorror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvhorror.setBackgroundColor(Color.rgb(85,146,407));
            }
        });
    }


}
