package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1= (CardView) findViewById(R.id.btnkemeja);
        card2= (CardView) findViewById(R.id.btnjaket);
        card3= (CardView) findViewById(R.id.btnkaos);
        card4= (CardView) findViewById(R.id.btninfo);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.btnkemeja:
                i = new Intent(this,Kemeja.class);
                startActivity(i);
                break;

            case R.id.btnjaket:
                i = new Intent(this,Jaket.class);
                startActivity(i);
                break;

            case R.id.btnkaos:
                i = new Intent(this,Kaos.class);
                startActivity(i);
                break;

            case R.id.btninfo:
                i = new Intent(this,Info.class);
                startActivity(i);
                break;
        }
    }
}