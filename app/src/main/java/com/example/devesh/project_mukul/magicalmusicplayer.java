package com.example.devesh.project_mukul;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class magicalmusicplayer extends AppCompatActivity implements SensorEventListener{
    MediaPlayer mp;
    Sensor s;
    SensorManager sm;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magicalmusicplayer);
        mp=MediaPlayer.create(this,R.raw.a);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b1=(Button)findViewById(R.id.button24);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(magicalmusicplayer.this,second.class);
                startActivity(i);
                finish();
            }
        });


    }

    @Override
    public void onSensorChanged(SensorEvent eventEvent) {
        if (eventEvent.values[0] > 4)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
