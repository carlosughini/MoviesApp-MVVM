package com.example.carlosughini.appmovie.utils.service;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class MovieApi {

    private final static String URL_THEMOVIE_DB_API = "https://developers.themoviedb.org/3/";
    final static String API_KEY = "c5850ed73901b8d268d0898a8a9d8bff";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL_THEMOVIE_DB_API)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
