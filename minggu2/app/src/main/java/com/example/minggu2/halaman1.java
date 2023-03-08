package com.example.minggu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class halaman1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
    }

    public void pindah(View view) {
        Intent intent = new Intent(halaman1.this,halaman2.class);
        startActivity(intent);
    }
}