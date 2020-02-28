package com.example.memebox;

import com.example.memebox.modelClass.memes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetApi {
    @GET("connect.php?cat=funny")
    Call<List<memes>>getImages();
}
