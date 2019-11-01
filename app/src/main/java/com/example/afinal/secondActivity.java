package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txt=findViewById(R.id.txt);
        Intent intent=getIntent();
        String s=intent.getStringExtra("name");
        txt.setText(s);
    }
}
