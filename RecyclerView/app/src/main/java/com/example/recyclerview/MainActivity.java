package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvPerson;
    List<Person> lstPerson;
    PersonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPerson = findViewById(R.id.rvPerson);
        lstPerson = Person.init();
        rvPerson.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PersonAdapter(this, lstPerson);
        rvPerson.setAdapter(adapter);
    }
}