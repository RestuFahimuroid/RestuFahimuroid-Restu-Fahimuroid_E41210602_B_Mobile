package com.example.minggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class acara15 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private mahasiswaAdapter adapter;
    private ArrayList<mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acara15);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        adapter = new mahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(acara15.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void  addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new mahasiswa("Restu Fahimuroid", "E41210602", "32312321321"));
        mahasiswaArrayList.add(new mahasiswa("Agos Budi", "E41210603", "023828937823"));
        mahasiswaArrayList.add(new mahasiswa("Eka Cahya", "E41210604", "028328372837"));
        mahasiswaArrayList.add(new mahasiswa("Pak Budi sebelah", "E41210621", "02372832873"));
        mahasiswaArrayList.add(new mahasiswa("Pak RW sebelah sana", "E41210622", "02372832873"));
        mahasiswaArrayList.add(new mahasiswa("Restu Fahimuroid", "E41210602", "32312321321"));
        mahasiswaArrayList.add(new mahasiswa("Agos Budi", "E41210603", "023828937823"));
        mahasiswaArrayList.add(new mahasiswa("Eka Cahya", "E41210604", "028328372837"));
        mahasiswaArrayList.add(new mahasiswa("Pak Budi sebelah", "E41210621", "02372832873"));
        mahasiswaArrayList.add(new mahasiswa("Pak RW sebelah sana", "E41210622", "02372832873"));
        mahasiswaArrayList.add(new mahasiswa("Restu Fahimuroid", "E41210602", "32312321321"));
        mahasiswaArrayList.add(new mahasiswa("Agos Budi", "E41210603", "023828937823"));
        mahasiswaArrayList.add(new mahasiswa("Eka Cahya", "E41210604", "028328372837"));
        mahasiswaArrayList.add(new mahasiswa("Pak Budi sebelah", "E41210621", "02372832873"));
        mahasiswaArrayList.add(new mahasiswa("Pak RW sebelah sana", "E41210622", "02372832873"));
        mahasiswaArrayList.add(new mahasiswa("Restu Fahimuroid", "E41210602", "32312321321"));
        mahasiswaArrayList.add(new mahasiswa("Agos Budi", "E41210603", "023828937823"));
        mahasiswaArrayList.add(new mahasiswa("Eka Cahya", "E41210604", "028328372837"));
        mahasiswaArrayList.add(new mahasiswa("Pak Budi sebelah", "E41210621", "02372832873"));
        mahasiswaArrayList.add(new mahasiswa("Pak RW sebelah sana", "E41210622", "02372832873"));

    }
}