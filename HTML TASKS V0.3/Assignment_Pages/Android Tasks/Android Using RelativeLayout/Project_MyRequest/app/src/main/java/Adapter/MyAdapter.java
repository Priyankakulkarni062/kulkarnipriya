package Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_myrequest.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private android.view.LayoutInflater LayoutInflater;
    private List<String> data;

    public MyAdapter(Context context, List<String> data) {
        this.LayoutInflater= LayoutInflater.from(context);
        this.data=data;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.inflate(R.layout.cardview,viewGroup,false);
        return new MyAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {
        String item1=data.get(i);
        viewHolder.textitem1.setText(item1);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textitem1,textitem2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textitem1=itemView.findViewById(R.id.item1);
            textitem2=itemView.findViewById(R.id.item2);
        }
    }
}
