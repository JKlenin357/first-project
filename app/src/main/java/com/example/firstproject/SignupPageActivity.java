package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SignupPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        Log.e("TAG","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
        Log.e("TAG","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void homePage(View view) {

    }
}