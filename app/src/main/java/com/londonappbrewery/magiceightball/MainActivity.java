package com.londonappbrewery.magiceightball;

import android.nfc.Tag;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MyButton;
        MyButton = findViewById(R.id.askButton);

    final ImageView ballDisplay = (ImageView)findViewById(R.id.image_eightBall);

    final int [] Ballarray = new int[]{R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };
        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new  Random();
                int number = randomNumberGenerator.nextInt(5);
                int imageResourceId = Ballarray [number];
                ballDisplay.setImageResource(imageResourceId);

            }
        });




    }
};
