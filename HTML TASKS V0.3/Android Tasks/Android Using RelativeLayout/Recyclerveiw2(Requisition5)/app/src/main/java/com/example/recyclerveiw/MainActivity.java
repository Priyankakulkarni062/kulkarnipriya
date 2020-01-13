package com.example.recyclerveiw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
   Adapter adapter;
   ArrayList<String> items;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items=new ArrayList<>();
        items.add("JOHN");
        items.add("Kate Gill");
        items.add("Harry Weasley");




        recyclerView=findViewById(R.id.item);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        adapter=new Adapter(this,items);
        recyclerView.setAdapter(adapter);
    }
}
