package com.example.linerlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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