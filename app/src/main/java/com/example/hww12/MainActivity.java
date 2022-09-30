package com.example.hww12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAddFood, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAddFood = (Button) findViewById(R.id.AddFood);
        bAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddData();
            }
        });


        bShowImages = (Button) findViewById(R.id.ShowFoods);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowFoods();
            }
        });

    }

    private void showAddData(){
        Intent intent = new Intent(MainActivity.this, AddData.class);
        MainActivity.this.startActivity(intent);
    }

    private void ShowFoods(){
        Intent intent = new Intent(MainActivity.this, ShowFoods.class);
        MainActivity.this.startActivity(intent);
    }

}

