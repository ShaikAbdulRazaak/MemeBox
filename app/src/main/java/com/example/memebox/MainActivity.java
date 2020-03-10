package com.example.memebox;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memebox.Adapters.recyclerAdapter;
import com.example.memebox.modelClass.ParentMeme;
import com.example.memebox.modelClass.memes;

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
        Call<ParentMeme>call =getApi.getImages(100);
        call.enqueue(new Callback<ParentMeme>() {


            @Override
            public void onResponse(Call<ParentMeme> call, Response<ParentMeme> response) {

                generateList(response.body());
                Log.e("Success","Found");
            }

            @Override
            public void onFailure(Call<ParentMeme> call, Throwable t) {

            }
        });
    }
    void generateList(ParentMeme parentMeme){
        List<memes> list= parentMeme.getMemes();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerAdapter recyclerAdapter=new recyclerAdapter(this,list);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
