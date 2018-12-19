package com.example.simulation.imageview;

import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Random rand = new Random();
    int n;
    ImageView Iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        Iv = (ImageView) findViewById(R.id.Iv);
    }

    public void btnclick(View view) {
        n = rand.nextInt(3) + 1;
        btn.setText("The picture number is:" + n);
        switch (n){
            case 1:Iv.setImageResource(R.drawable.hello);break;
            case 2:Iv.setImageResource(R.drawable.didipass);break;
            case 3:Iv.setImageResource(R.drawable.questionmark);break;


        }
    }
}

