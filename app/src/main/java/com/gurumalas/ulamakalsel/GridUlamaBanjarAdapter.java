package com.gurumalas.ulamakalsel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GridUlamaBanjarAdapter extends   RecyclerView.Adapter<GridUlamaBanjarAdapter.GridViewHolder>{
    private ArrayList<Ulamabanjar> daftarulama;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(GridUlamaBanjarAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public GridUlamaBanjarAdapter(ArrayList<Ulamabanjar> daftarulama) {
        this.daftarulama = daftarulama;
    }



    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_ulama, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Ulamabanjar ulamabanjar = daftarulama.get(position);
        Glide.with(holder.itemView.getContext())
                .load(daftarulama.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(daftarulama.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return daftarulama.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Ulamabanjar data);
    }
}
