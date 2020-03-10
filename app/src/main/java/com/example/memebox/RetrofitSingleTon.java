package com.example.memebox;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class RetrofitSingleTon {
    private static Retrofit retrofit;
    static Retrofit getInstance(){
        if(retrofit==null){
           retrofit =new Retrofit.Builder()
                    .baseUrl("https://meme-api.herokuapp.com")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
