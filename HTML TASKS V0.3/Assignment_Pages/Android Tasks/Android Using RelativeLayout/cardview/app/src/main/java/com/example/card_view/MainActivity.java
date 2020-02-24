package com.example.card_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        adapter=new Adapter(this,getdata());
        recyclerView.setLayoutManager(new LinearLayoutManager( this));

        recyclerView.setAdapter(adapter);


    }
    private ArrayList<data> getdata() {
ArrayList<data> data=new ArrayList<>();
data d=new data(R.drawable.img1,"Pav Bhaji");
data.add(d);


d=new data(R.drawable.img2,"Pani puri");
        data.add(d);

        d=new data(R.drawable.img3,"pav");
        data.add(d);


        return data;
    }
}