package com.example.buttonmessage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener
{
    public TextView txt_item1;
    private onclick onclick;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_item1=(TextView)itemView.findViewById(R.id.item1);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void Setonclick(onclick onclick)
    {
        this.onclick=onclick;
    }

    @Override
    public void onClick(View v) {
       onclick.onclick(v,getAdapterPosition(),false);
    }

    @Override
    public boolean onLongClick(View v) {
        onclick.onclick(v,getAdapterPosition(),true);
        return true;
    }
}
public class Recycleradapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<String> listdata=new ArrayList<>();
    private Context context;

    public Recycleradapter(List<String> listdata,Context context) {
       this.context=context;
       this.listdata=listdata;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemview=inflater.inflate(R.layout.cardview,parent,false);
        return new RecyclerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, final int position) {
holder.txt_item1.setText(listdata.get(position));
holder.Setonclick(new onclick() {
    @Override
    public void onclick(View view, int postion, boolean isLongClick) {
        if (isLongClick)
            Toast.makeText(context, "Long click :" + listdata.get(position), Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(context, "Name:JOHN\nADD:#111\nRoll.no:1" + listdata.get(position), Toast.LENGTH_SHORT).show();

    }
});
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }
}
