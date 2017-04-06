package com.internet.hw_image;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview1;
    ImageView imageview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = (TextView) findViewById(R.id.textview1);
        textview1.setTextColor(Color.RED);
        textview1.setText("This is my first Application");

        imageview1 = (ImageView) findViewById(R.id.imageview1);
        imageview1.setImageResource(R.drawable.close);

    }
}
