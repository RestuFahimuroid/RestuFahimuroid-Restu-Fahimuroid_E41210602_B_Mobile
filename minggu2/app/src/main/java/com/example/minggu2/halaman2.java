package com.example.minggu2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class halaman2 extends AppCompatActivity {
    DatePickerDialog picker;
    EditText eText;
    Button btnGet;
    TextView tView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        tView=(TextView) findViewById(R.id.textView1);
        eText=(EditText) findViewById(R.id.isiTanggal);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener(){
            @Override

                    public void onClick(View v){
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month =cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                //date picker dialog
                picker = new DatePickerDialog(halaman2.this,
                new DatePickerDialog.OnDateSetListener(){
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth){
                        eText.setText(dayOfMonth + "/"+(monthOfYear + 1)+ "/" +year);
                    }
                }, year, month, year);
                picker.show();
            }
        });
        btnGet=(Button) findViewById(R.id.button1);
        btnGet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tView.setText("Selected Date: "+ eText.getText());
            }
        });
    }

    public void pindah(View view) {
        Intent intent = new Intent(halaman2.this, halaman3.class);
        startActivity(intent);
    }
}