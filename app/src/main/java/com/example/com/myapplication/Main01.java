package com.example.com.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main01 extends AppCompatActivity {
    private Handler Handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);

        Handler = new Handler();
        Handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent Intent = new Intent(Main01.this,Main02.class);
                startActivity(Intent);
                finish();


            }
        }, 3000);

    }
}