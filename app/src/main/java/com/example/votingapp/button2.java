package com.example.votingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class button2 extends AppCompatActivity {
    Button submit;
    EditText cand1,cand2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        cand1=findViewById(R.id.cand1);
        cand2=findViewById(R.id.cand2);
        submit=findViewById(R.id.confirm);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cand11 = cand1.getText().toString();
                String cand22 = cand2.getText().toString();
                Intent intent=new Intent(button2.this,vote2.class);
                intent.putExtra("key1",cand11);
                intent.putExtra("key2",cand22);
                startActivity(intent);

            }
        });
    }
}