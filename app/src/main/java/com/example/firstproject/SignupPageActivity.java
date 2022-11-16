package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupPageActivity extends AppCompatActivity {
    private EditText username,pass,repass;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        username = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        repass = findViewById(R.id.rePassword);
        button = findViewById(R.id.save);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String user = username.getText().toString();
                String password = pass.getText().toString();
                String Repassword = repass.getText().toString();

                if (!password.isEmpty() && !user.isEmpty() && !Repassword.isEmpty()) {
                    if(user.length()>=3){
                    startActivity( new Intent(getApplicationContext(), HomePage.class));
                    }else {
                        Toast.makeText(getApplicationContext(), "user name should be 3 letter", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Fill the empty", Toast.LENGTH_SHORT).show();
                }
            }

            });

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
        Log.e("TAG","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG","Onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG","Ondestroy");
    }

    public void homePage(View view) {

    }
}