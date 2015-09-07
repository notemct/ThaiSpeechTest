package com.example.com.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main02 extends AppCompatActivity {
    private Handler Handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);

        Handler = new Handler();
        Handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent Intent = new Intent(Main02.this,Main03.class);
                startActivity(Intent);
                finish();

            }
        }, 3000);

    }
}