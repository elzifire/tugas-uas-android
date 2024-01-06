package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Kaos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaos);

        ArrayList<Katalog> data= KaosData.getData(getApplicationContext());
        RecyclerView recyclerView =findViewById(R.id.list_item_view);
        KaosAdapter adapter = new KaosAdapter(data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}