package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Kemeja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kemeja);

        ArrayList<Katalog> data= KemejaData.getData(getApplicationContext());
        RecyclerView recyclerView =findViewById(R.id.list_item_view);
        KemejaAdapter adapter = new KemejaAdapter(data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}