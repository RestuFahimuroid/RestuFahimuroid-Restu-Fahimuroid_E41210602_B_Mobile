package com.example.minggu7_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Deklarasi var nama layout dari activity_main.xml//
        setContentView(R.layout.activity_main);
        TextView nama = findViewById(R.id.tv_namaMain);

        //set label nama dengan data user dari login preferrences//
        nama.setText(preferences.getLoggedinUser(getBaseContext()));

        //Set status user sedang login menjadi default / kosong//
        findViewById(R.id.button_logoutMain).setOnClickListener((view -> {
            //Menghapus status login dan kembali ke login activity
            preferences.clearLoggedInUser(getBaseContext());
            startActivity(new Intent(getBaseContext(), loginActivity.class));
            finish();
        }));

    }
}