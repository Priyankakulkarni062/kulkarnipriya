package com.example.project_myrequsetpage;

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


        recyclerView=findViewById(R.id.item);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        adapter=new Adapter(this,getdata());
        recyclerView.setAdapter(adapter);



    }

    private ArrayList<data> getdata() {
        ArrayList<data> data=new ArrayList<>();
        data d=new data(R.drawable.circle,"AWAITING APPROVAL");
        data.add(d);

        d=new data(R.drawable.circle4,"APPROVED");
        data.add(d);

        d=new data(R.drawable.circle3,"DRAFT");
        data.add(d);

        d=new data(R.drawable.circle2,"REJECTED");
        data.add(d);




        return data;
    }
}
