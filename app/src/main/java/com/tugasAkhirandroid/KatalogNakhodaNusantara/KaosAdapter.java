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

public class KaosAdapter extends RecyclerView.Adapter<KaosAdapter.ListViewHolder>{
    private ArrayList<Katalog> kaosData;

    KaosAdapter(ArrayList<Katalog>list){
        this.kaosData=list;
    }

    @NonNull
    @Override
    public KaosAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kaos_item,parent,false);
        return new KaosAdapter.ListViewHolder(view);
    }

    @Override
    public  void onBindViewHolder(@NonNull KaosAdapter.ListViewHolder holder, int position) {
        Katalog katalog = kaosData.get(position);
        holder.judul.setText(katalog.judul);
        holder.image.setImageDrawable(katalog.image);
    }

    @Override
    public int getItemCount() {
        return kaosData.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView judul;
        public ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_kaos);
            judul = itemView.findViewById(R.id.kaos_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int selected = getLayoutPosition();
            Intent intent = new Intent(view.getContext(), DetailKaos.class);
            intent.putExtra("id", selected);
            view.getContext().startActivity(intent);
        }
    }
}
