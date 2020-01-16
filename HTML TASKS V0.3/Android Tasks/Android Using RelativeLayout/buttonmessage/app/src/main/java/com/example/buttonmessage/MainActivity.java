package com.example.buttonmessage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

private RecyclerView.LayoutManager layoutManager;
private List<String> Listdata=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupList();

RecyclerView recyclerView=(RecyclerView)findViewById(R.id.item);
recyclerView.setHasFixedSize(true);

layoutManager=new LinearLayoutManager(this);
recyclerView.setLayoutManager(layoutManager);
       Recycleradapter adapter=new Recycleradapter(Listdata,this);
recyclerView.setAdapter(adapter);
    }

    private void setupList() {
        for(int i=1;i<=1;i++)
            Listdata.add("");

    }
}
