package com.gurumalas.ulamakalsel;

//import androidx.recyclerview.widget.RecyclerView;

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
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView teksNama, teksDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
//            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            imgFoto = itemView.findViewById(R.id.img_item_photo);
            teksNama = itemView.findViewById(R.id.tv_item_nama);
            teksDetail =itemView.findViewById(R.id.tv_item_detail);
        }
    }
//    public class ListViewHolder {
//
//    }
}
