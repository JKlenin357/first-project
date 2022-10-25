package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private EditText username;
    private Button button;
 List user=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        button=findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }

    public void sigupPage(View view) {
        user.add(username.getText().toString());
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}