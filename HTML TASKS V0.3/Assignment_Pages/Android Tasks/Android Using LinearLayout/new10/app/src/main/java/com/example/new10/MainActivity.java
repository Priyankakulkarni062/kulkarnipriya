package com.example.new10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.Myadapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private	RecyclerView.Adapter	adapter;
    private List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView	=	(RecyclerView)	findViewById(R.id.item);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems	=	new ArrayList<>();
        for(int i	=0;	i<10;	i++){
            ListItem	item	=	new	ListItem
                    (
                            "JHON	"	+	(i+1),
                            "DescripJon	"	+	(i+1)

                    );

            listItems.add(item);
        }
        adapter	=	new Myadapter(this,	listItems);
        recyclerView.setAdapter(adapter);
    }
}