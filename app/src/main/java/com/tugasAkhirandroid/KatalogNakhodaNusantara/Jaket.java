package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Jaket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaket);

        ArrayList<Katalog> data= JaketData.getData(getApplicationContext());
        RecyclerView recyclerView =findViewById(R.id.list_item_view);
        JaketAdapter adapter = new JaketAdapter(data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}