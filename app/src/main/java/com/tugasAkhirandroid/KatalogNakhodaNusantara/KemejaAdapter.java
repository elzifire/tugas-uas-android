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

public class KemejaAdapter extends RecyclerView.Adapter<KemejaAdapter.ListViewHolder> {
    private ArrayList<Katalog> kemejaData;

    KemejaAdapter(ArrayList<Katalog>list){
        this.kemejaData=list;
    }

    @NonNull
    @Override
    public KemejaAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kemeja_item,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public  void onBindViewHolder(@NonNull KemejaAdapter.ListViewHolder holder, int position) {
        Katalog katalog = kemejaData.get(position);
        holder.judul.setText(katalog.judul);
        holder.image.setImageDrawable(katalog.image);
    }

    @Override
    public int getItemCount() {
        return kemejaData.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView judul;
        public ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_kemeja);
            judul = itemView.findViewById(R.id.kemeja_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int selected = getLayoutPosition();
            Intent intent = new Intent(view.getContext(), DetailKemeja.class);
            intent.putExtra("id", selected);
            view.getContext().startActivity(intent);
        }
    }

}
