package com.gurumalas.ulamakalsel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.gurumalas.ulamakalsel.GridUlamaBanjarAdapter;
import com.gurumalas.ulamakalsel.ListUlamaBanjarAdapter;
import com.gurumalas.ulamakalsel.DataUlamaBanjar;
import com.gurumalas.ulamakalsel.Ulamabanjar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Mode Grid";
    private RecyclerView rvUlama;
    private ArrayList<Ulamabanjar> uruatan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvUlama = findViewById(R.id.rv_ulama);
        rvUlama.setHasFixedSize(true);
        setActionBarTitle(title);
        uruatan.addAll(DataUlamaBanjar.getListData());
//        showRecyclerList();
        showRecyclerGrid();
    }

    private void showRecyclerGrid(){
        rvUlama.setLayoutManager(new GridLayoutManager(this, 2));
        GridUlamaBanjarAdapter gridUlamaBanjarAdapter = new GridUlamaBanjarAdapter(uruatan);
        rvUlama.setAdapter(gridUlamaBanjarAdapter);
        gridUlamaBanjarAdapter.setOnItemClickCallback( new GridUlamaBanjarAdapter.OnItemClickCallback()
    {
            @Override
            public void onItemClicked(Ulamabanjar data) {
                showSelectedUlama(data);
            }

    });
    }
    private void showRecyclerList(){
//        rvUlama.setLayoutManager(new LinearLayoutManager(this));
//        ListUlamaBanjarAdapter listUlamaBanjarAdapter = new ListUlamaBanjarAdapter(uruatan);
//        rvUlama.setAdapter(listUlamaBanjarAdapter);
//        listUlamaBanjarAdapter.setOnItemClickCallback(new ListUlamaBanjarAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(Ulamabanjar data) { showSelectedUlama(data); }
//        });
    }

    private void showRecyclerCardView(){
        rvUlama.setLayoutManager(new LinearLayoutManager(this));
        CardViewUlamaBanjarAdapter cardViewUlamaBanjarAdapter = new CardViewUlamaBanjarAdapter(uruatan);
        rvUlama.setAdapter(cardViewUlamaBanjarAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_cardview:
                title = "Mode Card View";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedUlama(Ulamabanjar ulamabanjar) {
        Toast.makeText(this, "Kamu memilih " + ulamabanjar.getNama(), Toast.LENGTH_SHORT).show();
    }



}