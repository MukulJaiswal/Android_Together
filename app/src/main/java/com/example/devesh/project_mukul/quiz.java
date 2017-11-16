package com.example.devesh.project_mukul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.HashMap;

public class quiz extends AppCompatActivity {
    private TextView textView;
    private Button sub,exit;
    private RadioGroup rg;
    private RadioButton aa,bb,cc,dd;
    int count=1;
    int score=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        textView=(TextView)findViewById(R.id.textView6);
        sub=(Button)findViewById(R.id.button28);
        exit=(Button)findViewById(R.id.button39);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        aa=(RadioButton)findViewById(R.id.radioButton);
        bb=(RadioButton)findViewById(R.id.radioButton2);
        cc=(RadioButton)findViewById(R.id.radioButton3);
        dd=(RadioButton)findViewById(R.id.radioButton4);
        textView.setText("DNS Stands for :");
        aa.setText("Data Name Server");
        bb.setText("Domain Name Server");
        cc.setText("Disk Name System");
        dd.setText("Document Name System");
        final HashMap<String,String> data = new HashMap<>();
        data.put("ques1","DNS Stands for :");
        data.put("a1","Data Name Server");
        data.put("b1","Domain Name Server");
        data.put("c1","Disk Name System");
        data.put("d1","Document Name System");
        data.put("ques2","Windows 10 is :");
        data.put("a2","Computer");
        data.put("b2","Oven Machine");
        data.put("c2","Operating System");
        data.put("d2","Cofee Machine");
        data.put("ques4","Java SE is :");
        data.put("a4","Programming Language");
        data.put("b4","Cofee Computing");
        data.put("c4","Computer Game");
        data.put("d4","Hacking Site");
        data.put("ques3","FTP Stands for :");
        data.put("a3","Find Time to Ping");
        data.put("b3","Fill The Pool");
        data.put("c3","File Transfer Protocol");
        data.put("d3","First Time Ping");
        data.put("ques5","DHCP Stands for :");
        data.put("a5","Dynamic Host Class Provider");
        data.put("b5","Disable Host Configuration Protocol");
        data.put("c5","Dynamic Host Confirm Protocol");
        data.put("d5","Dynamic Host Configuration Protocol");

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(count){
                    case 1:
                        if(bb.isChecked()){
                            score+=10;
                        }
                        else{
                            score-=2;
                        }
                        break;
                    case 2: if(cc.isChecked()){
                        score+=10;
                    }
                    else{
                        score-=2;
                    }
                        break;
                    case 3:
                        if (cc.isChecked()){
                            score+=10;
                        }
                        break;
                    case 4:
                        if (aa.isChecked()){
                            score+=10;
                        }
                        else{
                            score-=2;
                        }
                        break;
                    case 5:
                        if (dd.isChecked()){
                            score+=10;
                        }
                        else{
                            score-=2;
                        }
                        Intent i = new Intent(quiz.this,quizscore.class);
                        i.putExtra("score",Integer.toString(score));
                        startActivity(i);
                        finish();
                }
                if(count!=5){
                    count++;
                    String varque="ques"+count;
                    String vara="a"+count;
                    String varb="b"+count;
                    String varc="c"+count;
                    String vard="d"+count;
                    textView.setText(data.get(varque));
                    aa.setText(data.get(vara));
                    bb.setText(data.get(varb));
                    cc.setText(data.get(varc));
                    dd.setText(data.get(vard));
                }
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(quiz.this,specialfunction.class);
                startActivity(i);
                finish();
            }
        });

    }
}
