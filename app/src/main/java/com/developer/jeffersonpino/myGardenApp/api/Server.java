package com.developer.jeffersonpino.myGardenApp.api;

import android.content.Context;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 18/06/17.
 */

public class Server {
    private static Server instance;
    private IServer facade;

    private Server() {}

    public static Server getInstance() {

        if (instance == null) {
            instance = new Server();
        }
        return instance;

    }

    public void init(String url, final Context context) {

        //TODO: Adicionar con ssl
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        facade = retrofit.create(IServer.class);

    }

}
