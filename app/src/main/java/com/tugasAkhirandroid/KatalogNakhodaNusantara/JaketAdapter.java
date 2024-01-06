package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JaketAdapter extends RecyclerView.Adapter<JaketAdapter.ListViewHolder>{
    private ArrayList<Katalog> jaketData;

    JaketAdapter(ArrayList<Katalog>list){
        this.jaketData=list;
    }

    @NonNull
    @Override
    public JaketAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jaket_item,parent,false);
        return new JaketAdapter.ListViewHolder(view);
    }

    @Override
    public  void onBindViewHolder(@NonNull JaketAdapter.ListViewHolder holder, int position) {
        Katalog katalog = jaketData.get(position);
        holder.judul.setText(katalog.judul);
        holder.image.setImageDrawable(katalog.image);
    }

    @Override
    public int getItemCount() {
        return jaketData.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView judul;
        public ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_jaket);
            judul = itemView.findViewById(R.id.jaket_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int selected = getLayoutPosition();
            Intent intent = new Intent(view.getContext(), DetailJaket.class);
            intent.putExtra("id", selected);
            view.getContext().startActivity(intent);
        }
    }

}