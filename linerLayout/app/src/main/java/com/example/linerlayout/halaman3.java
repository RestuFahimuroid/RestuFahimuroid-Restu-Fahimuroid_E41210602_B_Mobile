package com.example.linerlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class halaman3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);
    }
    public void pindah(View view) {
        Intent intent = new Intent(halaman3.this, halaman4.class);
        startActivity(intent);
    }
}