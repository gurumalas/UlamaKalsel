package com.gurumalas.ulamakalsel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUlama;
    private ArrayList<Ulamabanjar> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvUlama = findViewById(R.id.rv_ulama);
        rvUlama.setHasFixedSize(true);

        list.addAll(DataUlamaBanjar.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvUlama.setLayoutManager(new LinearLayoutManager(this));
        ListUlamaBanjarAdapter listUlamaBanjarAdapter = new ListUlamaBanjarAdapter(list);
        rvUlama.setAdapter(listUlamaBanjarAdapter);
    }
}