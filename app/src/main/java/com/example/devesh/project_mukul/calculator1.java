package com.example.devesh.project_mukul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator1 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    TextView t1;
    EditText e1,e2;
    String s1="",s2="",s3="";
    Float  i1,i2,i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator1);
        b1=(Button)findViewById(R.id.button2); //add
        b2=(Button)findViewById(R.id.button4); //subtract
        b3=(Button)findViewById(R.id.button5);  //divide
        b4=(Button)findViewById(R.id.button8);   //multiply
        b5=(Button)findViewById(R.id.button20);    //back
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();


                i1 = Float.parseFloat(s1);
                i2 = Float.parseFloat(s2);
                i3 = i1 + i2;
                s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(calculator1.this, "Answer is "+s3, Toast.LENGTH_SHORT).show();







            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i1=Float.parseFloat(s1);
                i2=Float.parseFloat(s2);
                i3=i1-i2;
                s3=Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(calculator1.this,"Answer is "+ s3, Toast.LENGTH_SHORT).show();



            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i1=Float.parseFloat(s1);
                i2=Float.parseFloat(s2);
                i3=i1/i2;
                s3=Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(calculator1.this,"Answer is "+ s3, Toast.LENGTH_SHORT).show();



            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i1=Float.parseFloat(s1);
                i2=Float.parseFloat(s2);
                i3=i1*i2;
                s3=Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(calculator1.this,"Answer is "+ s3, Toast.LENGTH_SHORT).show();



            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(calculator1.this,second.class);
                startActivity(i);
                finish();
            }
        });


    }
}
