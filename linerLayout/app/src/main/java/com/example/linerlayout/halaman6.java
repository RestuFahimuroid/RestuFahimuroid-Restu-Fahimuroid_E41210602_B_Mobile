package com.example.linerlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class halaman6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman6);
    }
    public void pindah(View view) {
        Intent intent = new Intent(halaman6.this, halaman7.class);
        startActivity(intent);
    }
}