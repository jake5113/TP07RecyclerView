package com.jake5113.tp7recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] names;
    String[] quotes;
    ArrayList<Item> items = new ArrayList<>();
    RecyclerView recyclerView;
    ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = getResources().getStringArray(R.array.name);
        quotes = getResources().getStringArray(R.array.quotes);

        for (int i = 0; i < names.length; i++) {
            items.add(new Item(quotes[i], names[i], R.drawable.car_01 + i));
        }
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new ItemAdapter(this, items);
        recyclerView.setAdapter(adapter);

    }
}