package com.example.memebox;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleTon {
    private static Retrofit retrofit;
    static Retrofit getInstance(){
        if(retrofit==null){
           retrofit =new Retrofit.Builder()
                    .baseUrl("https://oxmanga.com")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
