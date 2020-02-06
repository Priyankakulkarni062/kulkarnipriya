package com.example.project_myrequest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items=new ArrayList<>();

            items.add("PUR - 2019 - 056 ");
            items.add("PUR - 2019 - 056 ");
            items.add("PUR - 2019 - 056 ");
            items.add("PUR - 2019 - 056 ");


        recyclerView=findViewById(R.id.item);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        adapter=new MyAdapter(this,items);
        recyclerView.setAdapter(adapter);

    }
}
