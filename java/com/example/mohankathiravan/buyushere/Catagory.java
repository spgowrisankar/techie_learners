package com.example.mohankathiravan.buyushere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Catagory extends AppCompatActivity {

    Button dogs,cats,birds,aquarium,rabbits,hamster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);

        dogs=findViewById(R.id.buttondogs);
        dogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Catagory.this,Dogs.class);
                startActivity(intent);

            }
        });
        cats=findViewById(R.id.buttoncats);
        cats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Catagory.this,Cats.class);
                startActivity(intent);

            }
        });
        birds=findViewById(R.id.buttonbirds);
        birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        aquarium=findViewById(R.id.buttonaquarium);
        aquarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rabbits=findViewById(R.id.buttonrabbits);
        rabbits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        hamster=findViewById(R.id.buttonhamster);
        hamster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
