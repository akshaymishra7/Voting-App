package com.example.votingapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class result3 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result3);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=findViewById(R.id.txt5);



        String btn11 = getIntent().getStringExtra("key11");
        String btn22 = getIntent().getStringExtra("key22");
        String btn33 = getIntent().getStringExtra("key33");

        txt1.setText("Votes of Candidate 1 are:   "+btn11);
        txt2.setText("Votes of Candidate 2 are:   "+btn22);
        txt3.setText("Votes of Candidate 3 are:   "+btn33);
        int a=Integer.parseInt(btn11);
        int b=Integer.parseInt(btn22);
        int c=Integer.parseInt(btn33);


        int x = b+a+c;
        txt4.setText("Total no. of Votes are:     "+Integer.toString(x));



    }
}

