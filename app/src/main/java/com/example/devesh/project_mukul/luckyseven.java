package com.example.devesh.project_mukul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class luckyseven extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    TextView t1,t2;
    Random rn= new Random();
    Integer i1,score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luckyseven);
        b1=(Button)findViewById(R.id.button26);  //less than 7
        b2=(Button)findViewById(R.id.button27);   //greater than 7
        b3=(Button)findViewById(R.id.button28);    //equal to 7
        b4=(Button)findViewById(R.id.button29);    //result
        b5=(Button)findViewById(R.id.button30);    //back
        t1=(TextView)findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1=rn.nextInt(12)+1;

                if(i1==1)
                {
                    i1=2;
                }
                t1.setText(""+i1);
                if (i1 < 7) {

                    Toast.makeText(luckyseven.this, "Correct! Number is less than 7", Toast.LENGTH_SHORT).show();
                    //t2.setText(""+score*50);
                    score++;
                    //score=score*50;
                }
                else
                    {

                    Toast.makeText(luckyseven.this, "Incorrect! Number is not less than 7", Toast.LENGTH_SHORT).show();
                        score--;
                        //score= score*50;

                }
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1=rn.nextInt(12)+1;

                if(i1==1)
                {
                    i1=2;
                }
                t1.setText(""+i1);
                if (i1 ==7) {

                    Toast.makeText(luckyseven.this, "Correct! Number is equual to 7", Toast.LENGTH_SHORT).show();
                    //t2.setText(""+score*50);
                    score++;
                   // score=score*50;
                }
                else
                {

                    Toast.makeText(luckyseven.this, "Incorrect! Number is not equal to  7", Toast.LENGTH_SHORT).show();
                    score--;
                   // score= score*50;

                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1=rn.nextInt(12)+1;

                if(i1==1)
                {
                    i1=2;
                }
                t1.setText(""+i1);
                if (i1 >7) {

                    Toast.makeText(luckyseven.this, "Correct! Number is greater than 7", Toast.LENGTH_SHORT).show();
                    //t2.setText(""+score*50);
                    score++;
                    //score=score*50;
                }
                else
                {

                    Toast.makeText(luckyseven.this, "Incorrect! Number is not greater than 7", Toast.LENGTH_SHORT).show();
                    score--;
                    //score= score*50;

                }
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=Integer.toString(score);
                Intent i= new Intent(luckyseven.this,luckysevenresult.class);
                i.putExtra("data",s1);
                startActivity(i);
                finish();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(luckyseven.this,specialfunction.class);
                startActivity(i);
                finish();
            }
        });



    }
}
