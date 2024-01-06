package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Info extends AppCompatActivity{
    public CardView card, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        card = (CardView) findViewById(R.id.Hubungi);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://api.whatsapp.com/send/?phone=%2B628112241014&text&type=phone_number&app_absent=0")));
            }
        });

        card2 = (CardView) findViewById(R.id.Email);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("mailto:nahkoda.nusantara@gmail.com")));
            }
        });
    }

}