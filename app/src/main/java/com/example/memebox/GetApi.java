package com.example.memebox;

import com.example.memebox.modelClass.ParentMeme;
import com.example.memebox.modelClass.memes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetApi {


    @GET("/gimme/{value}")
    Call<ParentMeme> getImages(@Path("value") int value);
}
