package com.example.minggu6;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.IOException;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showText = findViewById(R.id.getText);
    }
    public void back(View view){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
    public void getPublic(View view){
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);//folder name
        File myFile = new File(folder, "Data1.txt");//file name
        String text = getdata(myFile);
        if (text != null){
            showText.setText(text);
        }else{
            showText.setText("Ga Ada Data");
        }
    }

    public void getPrivate(View view){
        File folder = getExternalFilesDir("Fahim");//folder name
        File myFile = new File(folder, "Data2.txt");
        String text = getdata(myFile);
        if (text != null){
            showText.setText(text);
        }else{
            showText.setText("Ga Ada Data");
        }
    }

    private String getdata(File myfile){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(myfile);
            int i = -1;
            StringBuffer buffer = new StringBuffer();
            while ((i=fileInputStream.read())!=-1){
                buffer.append((char)i);
            }
            return buffer.toString();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}