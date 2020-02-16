package com.example.memebox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.memebox.Adapters.recyclerAdapter;
import com.example.memebox.modelClass.memes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<memes>arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        arrayList.add(new memes(R.drawable.im1));
        arrayList.add(new memes(R.drawable.im2));
        arrayList.add(new memes(R.drawable.im4));
        arrayList.add(new memes(R.drawable.im5));        arrayList.add(new memes(R.drawable.im6));
        arrayList.add(new memes(R.drawable.im7));
        recyclerAdapter recyclerAdapter=new recyclerAdapter(MainActivity.this,
                R.layout.recycler_custom_view,arrayList);
        recyclerView.setAdapter(recyclerAdapter);


    }
}
