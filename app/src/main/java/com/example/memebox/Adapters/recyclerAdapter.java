package com.example.memebox.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memebox.R;
import com.example.memebox.modelClass.memes;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static android.widget.ImageView.ScaleType.FIT_START;


public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.holder> {
    private Context context;
    private List<memes> list;

    public recyclerAdapter(Context context, List<memes> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_custom_view, null, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final holder holder, final int position) {

        final memes m = list.get(position);
        Picasso.get().load(m.getLocation()).into(holder.imageView);



        holder.share.setOnClickListener(v -> {
           /* Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
          shareIntent.putExtra(Intent.EXTRA_STREAM, );
            shareIntent.setType("images/*");
            context.startActivity(Intent.createChooser(shareIntent, "Share"));*/
        });
        holder.save.setOnClickListener(v -> {


        });
        holder.like.setOnClickListener(v -> {

        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        Button like, share, save;

        holder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_meme);
            like = itemView.findViewById(R.id.like_me);
            share = itemView.findViewById(R.id.share_me);
            save = itemView.findViewById(R.id.save_me);
        }
    }

}

