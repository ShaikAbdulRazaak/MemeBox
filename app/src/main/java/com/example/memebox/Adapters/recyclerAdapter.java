package com.example.memebox.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memebox.R;
import com.example.memebox.modelClass.memes;

import java.util.ArrayList;

import static android.widget.ImageView.ScaleType.FIT_CENTER;
import static android.widget.ImageView.ScaleType.FIT_START;
import static android.widget.ImageView.ScaleType.FIT_XY;


public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.holder> {
    Context context;
    int resource;
    ArrayList<memes>list;
    public recyclerAdapter(Context context,int resource,ArrayList<memes>list) {
        this.context=context;
        this.resource=resource;
        this.list=list;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.recycler_custom_view,null,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        memes m=list.get(position);
        holder.imageView.setScaleType(FIT_START);
        holder.imageView.setImageResource(m.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        Button button;
        holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_meme);
            button=itemView.findViewById(R.id.like_me);
        }
    }

}

