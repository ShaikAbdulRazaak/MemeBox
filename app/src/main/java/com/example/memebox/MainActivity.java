package com.example.memebox;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memebox.Adapters.recyclerAdapter;
import com.example.memebox.modelClass.memes;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        GetApi getApi=RetrofitSingleTon.getInstance().create(GetApi.class);
        Call<List<memes>>call =getApi.getImages();
        call.enqueue(new Callback<List<memes>>() {
            @Override
            public void onResponse(Call<List<memes>> call, Response<List<memes>> response) {
                generateList(response.body());
            }

            @Override
            public void onFailure(Call<List<memes>> call, Throwable t) {
                Log.d("message",t.getMessage());
            }
        });
    }
    void generateList(List<memes> listMemes){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerAdapter recyclerAdapter=new recyclerAdapter(this,listMemes);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
