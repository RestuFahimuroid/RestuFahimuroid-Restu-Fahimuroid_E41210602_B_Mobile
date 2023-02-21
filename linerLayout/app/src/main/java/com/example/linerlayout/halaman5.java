package com.example.linerlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class halaman5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman5);
    }
    public void pindah(View view) {
        Intent intent = new Intent(halaman5.this, halaman6.class);
        startActivity(intent);
    }
}