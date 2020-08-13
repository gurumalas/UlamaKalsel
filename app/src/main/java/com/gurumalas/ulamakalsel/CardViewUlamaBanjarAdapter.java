package com.gurumalas.ulamakalsel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewUlamaBanjarAdapter extends RecyclerView.Adapter<CardViewUlamaBanjarAdapter.CardViewViewHolder> {
    private ArrayList<Ulamabanjar> dafatarUlama;
    public CardViewUlamaBanjarAdapter(ArrayList<Ulamabanjar> list) {
        this.dafatarUlama = list;
    }
    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView nama, detailnya;
        Button btnFavorite, btnShare;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_item_foto);
            nama = itemView.findViewById(R.id.tv_item_nama);
            detailnya = itemView.findViewById(R.id.tv_item_detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }

    @NonNull
    @Override
    public CardViewUlamaBanjarAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_ulama, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewUlamaBanjarAdapter.CardViewViewHolder holder, int position) {
        Ulamabanjar ulamabanjar = dafatarUlama.get(position);
        Glide.with(holder.itemView.getContext())
                .load(ulamabanjar.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgFoto);
        holder.nama.setText(ulamabanjar.getNama());
        holder.detailnya.setText(ulamabanjar.getDetail());
        holder.btnFavorite.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        dafatarUlama.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dafatarUlama.size();
    }
}
