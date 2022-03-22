package com.example.week_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvCoffee;
    List<Coffee> lstCoffee;
    CoffeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCoffee = findViewById(R.id.rvCoffee);
        lstCoffee = Coffee.init();
        rvCoffee.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CoffeeAdapter(this, lstCoffee);
        rvCoffee.setAdapter(adapter);
    }
}