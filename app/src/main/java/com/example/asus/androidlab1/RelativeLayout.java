package com.example.asus.androidlab1;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        TextView red = (TextView) findViewById(R.id.red);
        red.setBackgroundColor(Color.parseColor("red"));

        TextView yellow = (TextView) findViewById(R.id.yellow);
        yellow.setBackgroundColor(Color.parseColor("yellow"));

        TextView orange = (TextView) findViewById(R.id.orange);
        orange.setBackgroundColor(Color.parseColor("#FF6600"));

        TextView blue = (TextView) findViewById(R.id.blue);
        blue.setBackgroundColor(Color.parseColor("blue"));

        TextView green = (TextView) findViewById(R.id.green);
        green.setBackgroundColor(Color.parseColor("green"));

        TextView indigo = (TextView) findViewById(R.id.indigo);
        indigo.setBackgroundColor(Color.parseColor("#FF33FF"));

        TextView pink = (TextView) findViewById(R.id.pink);
        pink.setBackgroundColor(Color.parseColor("#FFCCFF"));
    }
}
