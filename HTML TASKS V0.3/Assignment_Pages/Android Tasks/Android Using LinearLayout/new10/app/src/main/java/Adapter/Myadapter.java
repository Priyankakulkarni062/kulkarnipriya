package Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.new10.R;

import java.util.List;

import Model.ListItem;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {


    private android.view.LayoutInflater LayoutInflater;
    private Context context;
    private List<ListItem> listItems;

    public Myadapter(Context context, List listItem){
        this.LayoutInflater= LayoutInflater.from(context);
        this.listItems=listItem;

    }

    @NonNull
    @Override
    public Myadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View	view	=	LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,	parent,	false);
        return	new	ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.ViewHolder holder, int position) {
        ListItem	item	=	listItems.get(position);
        holder.Jtle.setText(item.getTitle());
        holder.descripJon.setText(item.getDescripJon());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView Jtle, descripJon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Jtle	=	(TextView)	itemView.findViewById(R.id.tleID);
            descripJon	=	(TextView)	itemView.findViewById(R.id.descriponID);
        }
    }
}
