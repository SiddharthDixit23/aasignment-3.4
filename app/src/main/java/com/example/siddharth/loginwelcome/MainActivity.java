package com.example.siddharth.loginwelcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = e1.getText().toString();
                String Password = e2.getText().toString();
                if(UserName!=null && Password!=null)
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("username",UserName);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Please fill the fields",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
