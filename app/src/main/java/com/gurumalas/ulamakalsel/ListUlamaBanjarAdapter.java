package com.gurumalas.ulamakalsel;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListUlamaBanjarAdapter  extends RecyclerView.Adapter<ListUlamaBanjarAdapter.ListViewHolder> {
    private ArrayList<Ulamabanjar> daftarUlama;

    public ListUlamaBanjarAdapter(ArrayList<Ulamabanjar> daftar) {
        this.daftarUlama = daftar;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_ulamabanjar, viewGroup, false);
//        LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hero, viewGroup, false);
//        return new ListViewHolder(view);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Ulamabanjar ulamabanjar = daftarUlama.get(position);
        Glide.with(holder.itemView.getContext())
                .load(ulamabanjar.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgFoto);
        holder.teksNama.setText(ulamabanjar.getNama());
        holder.teksDetail.setText(ulamabanjar.getDetail());
    }

    @Override
    public int getItemCount() {
        return daftarUlama.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView teksNama, teksDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_item_photo);
            teksNama = itemView.findViewById(R.id.tv_item_nama);
            teksDetail =itemView.findViewById(R.id.tv_item_detail);
        }
    }
//    public class ListViewHolder {
//
//    }
}
