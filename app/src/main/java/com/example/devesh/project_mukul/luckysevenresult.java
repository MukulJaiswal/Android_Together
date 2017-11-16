package com.example.devesh.project_mukul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class luckysevenresult extends AppCompatActivity {
    TextView t1,t2,t3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luckysevenresult);
        t1=(TextView)findViewById(R.id.textView3);  //score
        t2=(TextView)findViewById(R.id.textView4);   //complement
        t3=(TextView)findViewById(R.id.textView5);
        b1=(Button)findViewById(R.id.button31);
        b2=(Button)findViewById(R.id.button32);
        Intent i=getIntent();
        String s1=i.getStringExtra("data");
        t3.setText("Your Final score is :");
        t1.setText(s1);

        t2.setText("Thanks for Participation! \n Happy Playing...");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(luckysevenresult.this,luckyseven.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(luckysevenresult.this,share.class);
                startActivity(i);
                finish();
            }
        });

    }
}
