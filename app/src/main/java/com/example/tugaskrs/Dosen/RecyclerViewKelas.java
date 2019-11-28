package com.example.tugaskrs.Dosen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaskrs.Dosen.Adapter.KelasAdapter;
import com.example.tugaskrs.Dosen.Model.Kelas;
import com.example.tugaskrs.R;

import java.util.ArrayList;

public class RecyclerViewKelas extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KelasAdapter kelasAdapter;
    private ArrayList<Kelas> kelasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_kelas);

        this.setTitle("SI KRS - Hai");

        tambahData();

        recyclerView = findViewById(R.id.rvKelas);
        kelasAdapter = new KelasAdapter(kelasList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewKelas.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(kelasAdapter);
    }

    public void tambahData(){
        kelasList = new ArrayList<>();
        kelasList.add(new Kelas("S1","DDP","3","Selasa","Katon","40"));
        kelasList.add(new Kelas("S2","Progweb","3","Kamis","Erick","40"));
        kelasList.add(new Kelas("S3","Progmob","3","Jumat","Doni","40"));
    }
}
