package com.example.tugaskrs.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaskrs.Admin.Adapter.MatkulAdapter;
import com.example.tugaskrs.Admin.Model.Matakuliah;
import com.example.tugaskrs.R;

import java.util.ArrayList;

public class RecyclerViewDaftarMatkul extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MatkulAdapter matkulAdapter;
    private ArrayList<Matakuliah> mkList;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucreate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(RecyclerViewDaftarMatkul.this,CreateMatkulActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_matkul);
        this.setTitle("SI KRS - Hai");

        tambahData();

        recyclerView = findViewById(R.id.rvMatkul);
        matkulAdapter = new MatkulAdapter(mkList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewDaftarMatkul.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(matkulAdapter);
    }

    public void tambahData(){
        mkList = new ArrayList<>();
        mkList.add(new Matakuliah("S1","DDP","Selasa","3","2"));
        mkList.add(new Matakuliah("S2","Progweb","Kamis","3","2"));
        mkList.add(new Matakuliah("S3","Progmob","Jumat","3","4"));
    }
}
