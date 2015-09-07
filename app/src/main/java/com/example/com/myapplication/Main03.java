package com.example.com.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main03 extends AppCompatActivity {
    private android.os.Handler Handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03);

        Handler = new Handler();
        Handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent Intent = new Intent(Main03.this,Main04.class);
                startActivity(Intent);
                finish();

            }
        }, 3000);

    }
}