package com.example.devesh.project_mukul;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class third extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2,e3,e4,e5,e6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=(Button)findViewById(R.id.button3);    //sign up
        b2=(Button)findViewById(R.id.button17);   //back login page
        e1=(EditText)findViewById(R.id.editText16);
        e2=(EditText)findViewById(R.id.editText5);
        e3=(EditText)findViewById(R.id.editText6);
        e4=(EditText)findViewById(R.id.editText7);
        e5=(EditText)findViewById(R.id.editText8);
        e6=(EditText)findViewById(R.id.editText9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                String s5=e5.getText().toString();
                String s6=e6.getText().toString();

                if(s1.equals("") || s4.equals("") ||  s5.equals("") || s6.equals("") )
                {
                    Toast.makeText(third.this, "Fill all the Fields !", Toast.LENGTH_SHORT).show();
                }
                else if (!s2.equals(s3))
                {
                    Toast.makeText(third.this, "Password doesn't matched.", Toast.LENGTH_SHORT).show();
                }
                else if(s2.equals(""))
                {
                    Toast.makeText(third.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("netcamp",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student(username varchar,password varchar,confirmpassword varchar,email varchar,city varchar,phone varchar)");
                    String s7="select * from student where (username ='"+s1+"' and password ='"+s2+"')" ;
                    Cursor cursor=data.rawQuery(s7,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(third.this, "User already exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into student values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
                        Toast.makeText(third.this, "Congratulations! You are Successfully Registered.", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(third.this,MainActivity.class);
                        startActivity(i);
                        finish();

                    }

                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(third.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });




    }
}
