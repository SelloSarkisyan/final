package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("message","on create");
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Toast.makeText(MainActivity.this,"sdfdf",Toast.LENGTH_LONG).show();
                                       Intent intent=new Intent(MainActivity.this,secondActivity.class);
                                       intent.putExtra("name","serly");
                                       startActivity(intent);
                                   }
                               }

        );

    }
}
