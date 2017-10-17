package com.example.aj.audio;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.afrojack);

        ImageView start=(ImageView)findViewById(R.id.play);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        ImageView pause=(ImageView)findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

        ImageView stop=(ImageView)findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });

//        MediaPlayer mp=new MediaPlayer();
//        try{
//            mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"/Explorer/categories/Music/AjjloudRingtone.mp3");
//            mp.prepare();
//            mp.start();
//            //Explorer/categories/Music/AjjloudRingtone.mp3"
//
//        }catch(Exception e){e.printStackTrace();}

//    }
}
}
