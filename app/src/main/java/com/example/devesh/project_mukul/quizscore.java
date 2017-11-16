package com.example.devesh.project_mukul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class quizscore extends AppCompatActivity {
    TextView t1,t2,t3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luckysevenresult);
        t1=(TextView)findViewById(R.id.textView3);  //score
        t2=(TextView)findViewById(R.id.textView4);   //complement
        t3=(TextView)findViewById(R.id.textView5);
        b1=(Button)findViewById(R.id.button31);    //back
        b2=(Button)findViewById(R.id.button32);   //share
        Intent i=getIntent();
        String s1=i.getStringExtra("score");
        t3.setText("Your Final score is :");
        t1.setText(s1);

        t2.setText("Thanks for Participation! \n Happy Playing...");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(quizscore.this,specialfunction.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(quizscore.this,share.class);
                startActivity(i);
                finish();
            }
        });

    }
}
