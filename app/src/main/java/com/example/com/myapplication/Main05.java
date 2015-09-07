package com.example.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Main05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main05);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main05, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClickMain11(View v){
        Intent i = new Intent(getApplicationContext(),Main11.class);
        startActivity(i);
    }
    public void onClickMain12(View v){
        Intent i = new Intent(getApplicationContext(),Main12.class);
        startActivity(i);
    }
    public void onClickMain13(View v){
        Intent i = new Intent(getApplicationContext(),Main13.class);
        startActivity(i);
    }
    public void onClickMain14(View v){
        Intent i = new Intent(getApplicationContext(),Main14.class);
        startActivity(i);
    }
    public void onClickMain15(View v){
        Intent i = new Intent(getApplicationContext(),Main15.class);
        startActivity(i);
    }
    public void onClickMain16(View v){
        Intent i = new Intent(getApplicationContext(),Main16.class);
        startActivity(i);
    }
    public void onClickMain17(View v){
        Intent i = new Intent(getApplicationContext(),Main17.class);
        startActivity(i);
    }
    public void onClickMain18(View v){
        Intent i = new Intent(getApplicationContext(),Main18.class);
        startActivity(i);
    }
    public void onClickMain19(View v){
        Intent i = new Intent(getApplicationContext(),Main19.class);
        startActivity(i);
    }
    public void onClickMain20(View v){
        Intent i = new Intent(getApplicationContext(),Main20.class);
        startActivity(i);
    }
    public void onClickMain21(View v){
        Intent i = new Intent(getApplicationContext(),Main21.class);
        startActivity(i);
    }
    public void onClickMain22(View v){
        Intent i = new Intent(getApplicationContext(),Main22.class);
        startActivity(i);
    }
    public void onClickMain23(View v){
        Intent i = new Intent(getApplicationContext(),Main23.class);
        startActivity(i);
    }
    public void onClickMain24(View v){
        Intent i = new Intent(getApplicationContext(),Main24.class);
        startActivity(i);
    }
    public void onClickMain25(View v){
        Intent i = new Intent(getApplicationContext(),Main25.class);
        startActivity(i);
    }
    public void onClickMain26(View v){
        Intent i = new Intent(getApplicationContext(),Main26.class);
        startActivity(i);
    }

}
