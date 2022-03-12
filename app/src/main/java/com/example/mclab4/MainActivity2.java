package com.example.mclab4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
 Button b7,b11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b7= (Button) this.findViewById(R.id.button9);
    }

    public void Simple(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

    public void Quiz(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(intent);
    }



    public void learn(View view) {
        Uri uri = Uri.parse("http:www.developer android.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void TF(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
        startActivity(intent);
    }
}