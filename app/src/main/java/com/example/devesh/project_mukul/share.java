package com.example.devesh.project_mukul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class share extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    WebView w1;
    String s1="https://facebook.com";
    String s2="https://twitter.com";
    String s3="http://netcamp.in";
    String s4="https://instagram.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        b1=(Button)findViewById(R.id.button33);  //facebook
        b2=(Button)findViewById(R.id.button34);  //twitter
        b3=(Button)findViewById(R.id.button35);  //netcamp
        b4=(Button)findViewById(R.id.button36);   //instagram
        b5=(Button)findViewById(R.id.button37);   //home
        b6=(Button)findViewById(R.id.button38);   //back
        w1=(WebView)findViewById(R.id.webView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w1.loadUrl(s1);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w1.loadUrl(s2);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w1.loadUrl(s3);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w1.loadUrl(s4);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(share.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(share.this,luckysevenresult.class);
                startActivity(i);
                finish();
            }
        });




    }
}
