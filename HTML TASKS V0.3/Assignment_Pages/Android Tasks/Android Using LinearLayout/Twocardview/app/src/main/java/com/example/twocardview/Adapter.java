package com.example.twocardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.twocardview.Model.ONE_TYPE;
import static com.example.twocardview.Model.TWO_TYPE;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    ArrayList<Model> model;
    public Adapter(ArrayList<Model> model) {
        this.model = model;
    }

    @Override
    public int getItemViewType(int position) {
        Model  m=model.get(position);
        if(m!=null)
        {
           return m.getType();
        }
        return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view;
       switch (viewType)
       {
           case ONE_TYPE:
                      view=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_one,parent,false);
                      return new oneViewHolder(view);
           case TWO_TYPE:
               view=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_two,parent,false);
               return new twoViewHolder(view);
       }
 return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Model  m=model.get(position);
        switch (m.getType()){
            case ONE_TYPE:
                ((oneViewHolder) holder).title1.setText(m.getText1());
                break;
            case TWO_TYPE:
                ((twoViewHolder) holder).title1.setText(m.getText1());
                break;
        }

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class oneViewHolder extends RecyclerView.ViewHolder{
      TextView title1;
        public oneViewHolder(@NonNull View itemView) {
            super(itemView);

            title1=itemView.findViewById(R.id.item1);
        }
    }
    class twoViewHolder extends RecyclerView.ViewHolder{
        TextView title1;
        public twoViewHolder(@NonNull View itemView) {
            super(itemView);
            title1=itemView.findViewById(R.id.item2);
        }
    }

}
