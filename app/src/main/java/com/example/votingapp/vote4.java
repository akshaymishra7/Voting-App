package com.example.votingapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class vote4 extends AppCompatActivity {
    TextView cand1, cand2,cand3,cand4;
    public Button btn1, btn2, btn3,btn4,btn5;
    public int count1;
    public int count2;
    public int count3;
    public int count4;
    String count11,count22,count33,count44;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote4);
        cand1 = findViewById(R.id.cand1);
        cand2 = findViewById(R.id.cand2);
        cand3 = findViewById(R.id.cand3);
        cand4 = findViewById(R.id.cand4);
        String cand11 = getIntent().getStringExtra("key1");
        String cand22 = getIntent().getStringExtra("key2");
        String cand33 = getIntent().getStringExtra("key3");
        String cand44 = getIntent().getStringExtra("key4");
        cand1.setText(cand11);
        cand2.setText(cand22);
        cand3.setText(cand33);
        cand4.setText(cand44);

        View backgroundimage = findViewById(R.id.background);
        Drawable background = backgroundimage.getBackground();
        background.setAlpha(95);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        mp = MediaPlayer.create(this, R.raw.beep);



        final AlertDialog.Builder alert=new AlertDialog.Builder(vote4.this);
        View m1view =getLayoutInflater().inflate(R.layout.auth,null);
        final EditText uid=m1view.findViewById(R.id.uid);
        final EditText password=m1view.findViewById(R.id.password);
        Button login=m1view.findViewById(R.id.login);
        alert.setView(m1view);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid1=uid.getText().toString().trim();
                String password1=password.getText().toString().trim();
                if ((uid1.equals("001")&&password1.equals("111"))||(uid1.equals("002")&&password1.equals("222"))||(uid1.equals("003")&&password1.equals("333"))||(uid1.equals("004")&&password1.equals("444"))||(uid1.equals("005")&&password1.equals("555"))||(uid1.equals("006")&&password1.equals("666"))||(uid1.equals("008")&&password1.equals("888")))
                {
                    alertDialog.dismiss();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alertDialog.show();
        alertDialog.setCancelable(false);

    }
    //@Override
    //public void onBackPressed() {
    //}

    public void onclick (View view){
        mp.start();
        count1++;
        Toast.makeText(getApplicationContext(), "Thank you for Voting..!", Toast.LENGTH_SHORT).show();

        final AlertDialog.Builder alert=new AlertDialog.Builder(vote4.this);
        View m1view =getLayoutInflater().inflate(R.layout.auth,null);
        final EditText uid=m1view.findViewById(R.id.uid);
        final EditText password=m1view.findViewById(R.id.password);
        Button login=m1view.findViewById(R.id.login);
        alert.setView(m1view);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid1=uid.getText().toString().trim();
                String password1=password.getText().toString().trim();
                if ((uid1.equals("001")&&password1.equals("111"))||(uid1.equals("002")&&password1.equals("222"))||(uid1.equals("003")&&password1.equals("333"))||(uid1.equals("004")&&password1.equals("444"))||(uid1.equals("005")&&password1.equals("555"))||(uid1.equals("006")&&password1.equals("666"))||(uid1.equals("008")&&password1.equals("888")))
                {
                    alertDialog.dismiss();
                }
                else {
                    Toast.makeText(getApplicationContext(), "wrong field", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alertDialog.show();
        alertDialog.setCancelable(false);
    }

    public void on2click(View view) {
        mp.start();
        count2++;
        Toast.makeText(getApplicationContext(),"Thank you for Voting..!", Toast.LENGTH_SHORT).show();

        final AlertDialog.Builder alert=new AlertDialog.Builder(vote4.this);
        View m1view =getLayoutInflater().inflate(R.layout.auth,null);
        final EditText uid=m1view.findViewById(R.id.uid);
        final EditText password=m1view.findViewById(R.id.password);
        Button login=m1view.findViewById(R.id.login);
        alert.setView(m1view);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid1=uid.getText().toString().trim();
                String password1=password.getText().toString().trim();
                if ((uid1.equals("001")&&password1.equals("111"))||(uid1.equals("002")&&password1.equals("222"))||(uid1.equals("003")&&password1.equals("333"))||(uid1.equals("004")&&password1.equals("444"))||(uid1.equals("005")&&password1.equals("555"))||(uid1.equals("006")&&password1.equals("666"))||(uid1.equals("008")&&password1.equals("888")))
                {
                    alertDialog.dismiss();
                }
                else {
                    Toast.makeText(getApplicationContext(), "wrong field", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alertDialog.show();
        alertDialog.setCancelable(false);
    }

    public void on3click(View view) {
        mp.start();
        count3++;
        Toast.makeText(getApplicationContext(),"Thank you for Voting..!", Toast.LENGTH_SHORT).show();

        final AlertDialog.Builder alert=new AlertDialog.Builder(vote4.this);
        View m1view =getLayoutInflater().inflate(R.layout.auth,null);
        final EditText uid=m1view.findViewById(R.id.uid);
        final EditText password=m1view.findViewById(R.id.password);
        Button login=m1view.findViewById(R.id.login);
        alert.setView(m1view);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid1=uid.getText().toString().trim();
                String password1=password.getText().toString().trim();
                if ((uid1.equals("001")&&password1.equals("111"))||(uid1.equals("002")&&password1.equals("222"))||(uid1.equals("003")&&password1.equals("333"))||(uid1.equals("004")&&password1.equals("444"))||(uid1.equals("005")&&password1.equals("555"))||(uid1.equals("006")&&password1.equals("666"))||(uid1.equals("008")&&password1.equals("888")))
                {
                    alertDialog.dismiss();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alertDialog.show();
        alertDialog.setCancelable(false);
    }

    public void on4click(View view) {
        mp.start();
        count4++;
        Toast.makeText(getApplicationContext(),"Thank you for Voting..!", Toast.LENGTH_SHORT).show();

        final AlertDialog.Builder alert=new AlertDialog.Builder(vote4.this);
        View m1view =getLayoutInflater().inflate(R.layout.auth,null);
        final EditText uid=m1view.findViewById(R.id.uid);
        final EditText password=m1view.findViewById(R.id.password);
        Button login=m1view.findViewById(R.id.login);
        alert.setView(m1view);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid1=uid.getText().toString().trim();
                String password1=password.getText().toString().trim();
                if ((uid1.equals("001")&&password1.equals("111"))||(uid1.equals("002")&&password1.equals("222"))||(uid1.equals("003")&&password1.equals("333"))||(uid1.equals("004")&&password1.equals("444"))||(uid1.equals("005")&&password1.equals("555"))||(uid1.equals("006")&&password1.equals("666"))||(uid1.equals("008")&&password1.equals("888")))
                {
                    alertDialog.dismiss();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alertDialog.show();
        alertDialog.setCancelable(false);
    }

    public void onSubmit(View view) {
        final AlertDialog.Builder alert=new AlertDialog.Builder(vote4.this);
        View mview =getLayoutInflater().inflate(R.layout.dialog2,null);
        final EditText password=mview.findViewById(R.id.password);
        Button cancel=mview.findViewById(R.id.cancel);
        Button confirm=mview.findViewById(R.id.confirm);
        alert.setView(mview);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }

        });
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password1=password.getText().toString().trim();
                if(password1.equals("voting")){
                    Intent intent=new Intent(vote4.this,result4.class);
                    count11=Integer.toString(count1);
                    count22=Integer.toString(count2);
                    count33=Integer.toString(count3);
                    count44=Integer.toString(count4);

                    intent.putExtra("key11",count11);
                    intent.putExtra("key22",count22);
                    intent.putExtra("key33",count33);
                    intent.putExtra("key44",count44);

                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"wrong password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alertDialog.show();

        //Intent intent=new Intent(vote2.this,result2.class);
        // count11=Integer.toString(count1);
        // count22=Integer.toString(count2);

        // intent.putExtra("key11",count11);
        // intent.putExtra("key22",count22);

        //startActivity(intent);
    }



}



