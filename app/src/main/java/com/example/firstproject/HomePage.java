package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    ArrayList  page=new ArrayList<String>();
    EditText getUsername;
    TextView setusername;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getUsername=findViewById(R.id.search);
        setusername=findViewById(R.id.information);
    }

    public void save(View view) {
//        setusername.setText(getUsername.getText().toString());
        Toast.makeText(this,"saved",Toast.LENGTH_SHORT).show();
        page.add(getUsername.getText().toString());

        for(int i=0;i<page.size();i++){
            s+=page.get(i).toString();

        }
        Log.e("TAG","AFter"+s);
        setusername.setText(s);
        getUsername.getText().clear();
         s="";
    }
}