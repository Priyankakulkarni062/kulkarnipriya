package com.example.twocardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataset();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Adapter adapter=new Adapter(arr);
        recyclerView.setAdapter(adapter);



    }

    private void dataset(){

        arr=new ArrayList<>();
        arr.add(new Model("title one",Model.ONE_TYPE));
        arr.add(new Model("title two",Model.TWO_TYPE));
        arr.add(new Model("title two",Model.TWO_TYPE));
        arr.add(new Model("title one",Model.ONE_TYPE));
        arr.add(new Model("title one",Model.ONE_TYPE));
        arr.add(new Model("title two",Model.TWO_TYPE));


    }
}
