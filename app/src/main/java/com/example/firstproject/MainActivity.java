package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private EditText username,pass;
    private Button button;
 List user=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        button=findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String user=username.getText().toString();//aa

                String password=pass.getText().toString();//aaa

                if(!password.isEmpty() &&!user.isEmpty() ){
                    if(user.length()>=3){

                        Intent intent = new Intent(getApplicationContext(), HomePage.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(getApplicationContext(),"user name should be 3 letter",Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Fill the empty",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    public void sigupPage(View view) {
        user.add(username.getText().toString());
        Intent intent = new Intent(this, SignupPageActivity.class);
        startActivity(intent);
    }
}