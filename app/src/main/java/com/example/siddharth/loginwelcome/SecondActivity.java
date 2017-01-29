package com.example.siddharth.loginwelcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTv = (TextView)findViewById(R.id.textView);
        Intent parentIntent = getIntent();
        String UserName = parentIntent.getStringExtra("username");
        mTv.setText("Welcome "+UserName);
    }
}
