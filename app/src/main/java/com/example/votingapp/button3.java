package com.example.votingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class button3 extends AppCompatActivity {
    Button submit;
    EditText cand1,cand2,cand3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);
        cand1=findViewById(R.id.cand1);
        cand2=findViewById(R.id.cand2);
        cand3 = findViewById(R.id.cand3);
        submit=findViewById(R.id.confirm);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cand11 = cand1.getText().toString();
                String cand22 = cand2.getText().toString();
                String cand33 = cand3.getText().toString();
                Intent intent=new Intent(button3.this,vote3.class);
                intent.putExtra("key1",cand11);
                intent.putExtra("key2",cand22);
                intent.putExtra("key3",cand33);
                startActivity(intent);

            }
        });
    }
}