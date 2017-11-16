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

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);  //login
        b2=(Button)findViewById(R.id.button15);   //signup

        e1=(EditText)findViewById(R.id.editText15);
        e2=(EditText)findViewById(R.id.editText3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                if (s1.equals("") || s2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill all the fields!", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        SQLiteDatabase data=openOrCreateDatabase("netcamp",MODE_PRIVATE,null);
                        data.execSQL("create table if not exists student(username varchar,password varchar,confirmpassword varchar,email varchar,city varchar,phone varchar)");
                        String s3="select * from student where username ='"+s1+"' and password ='"+s2+"'";
                        Cursor cursor = data.rawQuery(s3,null);

                        if(cursor.getCount()>0)
                        {
                            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(MainActivity.this, second.class);
                            startActivity(i);
                            finish();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "Username and password does not matched", Toast.LENGTH_SHORT).show();
                        }


                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,third.class);
                startActivity(i);
                finish();

            }
        });


    }

}
