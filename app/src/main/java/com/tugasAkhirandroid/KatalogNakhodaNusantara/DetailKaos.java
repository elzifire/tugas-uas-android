package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailKaos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kaos);

        int id = getIntent().getIntExtra("id", -1);

        ArrayList<Katalog> list = KaosData.getData(getApplicationContext());
        Katalog katalog = list.get(id);

        if (katalog != null) {
            TextView judulTV = findViewById(R.id.detail_judul);
            TextView deskripsiTV = findViewById(R.id.detail_deskripsi);
            ImageView image = findViewById(R.id.detail_kaos);

            image.setImageDrawable(katalog.image);
            judulTV.setText(katalog.judul);
            deskripsiTV.setText(katalog.deskripsi);
        }

        Button pesan = (Button) findViewById(R.id.pesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailKaos.this,Info.class);
                startActivity(i);
            }
        });
    }
}