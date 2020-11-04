package com.example.votingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class button4 extends AppCompatActivity {
    Button submit;
    EditText cand1,cand2,cand3,cand4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);
        cand1=findViewById(R.id.cand1);
        cand2=findViewById(R.id.cand2);
        cand3 = findViewById(R.id.cand3);
        cand4 = findViewById(R.id.cand4);
        submit=findViewById(R.id.confirm);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cand11 = cand1.getText().toString();
                String cand22 = cand2.getText().toString();
                String cand33 = cand3.getText().toString();
                String cand44 = cand4.getText().toString();
                Intent intent=new Intent(button4.this,vote4.class);
                intent.putExtra("key1",cand11);
                intent.putExtra("key2",cand22);
                intent.putExtra("key3",cand33);
                intent.putExtra("key4",cand44);
                startActivity(intent);

            }
        });
    }
}