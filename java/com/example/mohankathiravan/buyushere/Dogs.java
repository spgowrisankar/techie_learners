package com.example.mohankathiravan.buyushere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.mohankathiravan.buyushere.R.id.textlab;

public class Dogs extends AppCompatActivity {
    TextView lab,ger,bull,pug,pup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);
        lab = findViewById(R.id.textlab);
        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dogs.this,Labrador.class);
                startActivity(intent);
            }
        });
        ger = findViewById(R.id.textger);
        ger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(Dogs.this,.class);
                startActivity(intent);*/
            }
        });

    }

}
