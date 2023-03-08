package com.example.minggu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class main_class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_class);
    }
    //Routing View
    public void linear(View view) {
        Intent intent = new Intent(main_class.this, halaman1.class);
        startActivity(intent);
    }
    public void Relative(View view) {
        Intent intent = new Intent(main_class.this, halaman2.class);
        startActivity(intent);
    }
    public void Constraint(View view) {
        Intent intent = new Intent(main_class.this, halaman3.class);
        startActivity(intent);
    }
    public void Frame(View view) {
        Intent intent = new Intent(main_class.this, halaman4.class);
        startActivity(intent);
    }
    public void Table(View view) {
        Intent intent = new Intent(main_class.this, halaman5.class);
        startActivity(intent);
    }
    public void Material(View view) {
        Intent intent = new Intent(main_class.this, halaman9.class);
        startActivity(intent);
    }
    public void ScrollV(View view) {
        Intent intent = new Intent(main_class.this, halaman6.class);
        startActivity(intent);
    }
    public void ScrollVH(View view) {
        Intent intent = new Intent(main_class.this, halaman7.class);
        startActivity(intent);
    }
}