package com.example.mclab4;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView t1;
 ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)this.findViewById(R.id.textView);
        img=(ImageView)findViewById(R.id.imageView);
          Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
                  img.setVisibility(View.VISIBLE);
                  img.startAnimation(anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        },3000);
    }
}