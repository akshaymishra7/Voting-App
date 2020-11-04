package com.example.votingapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class result4 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result4);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=findViewById(R.id.txt4);
        txt5=findViewById(R.id.txt5);



        String btn11 = getIntent().getStringExtra("key11");
        String btn22 = getIntent().getStringExtra("key22");
        String btn33 = getIntent().getStringExtra("key33");
        String btn44 = getIntent().getStringExtra("key44");

        txt1.setText("Votes of Candidate 1 are:   "+btn11);
        txt2.setText("Votes of Candidate 2 are:   "+btn22);
        txt3.setText("Votes of Candidate 3 are:   "+btn33);
        txt4.setText("Votes of Candidate 4 are:   "+btn44);
        int a=Integer.parseInt(btn11);
        int b=Integer.parseInt(btn22);
        int c=Integer.parseInt(btn33);
        int d=Integer.parseInt(btn44);


        int x = b+a+c+d;
        txt5.setText("Total no. of Votes are:     "+Integer.toString(x));



    }
}

