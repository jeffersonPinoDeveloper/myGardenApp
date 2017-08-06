package com.developer.jeffersonpino.myGardenApp.api;

import com.developer.jeffersonpino.myGardenApp.utilities.EnviromentFields;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by adminJefferson on 18/06/17.
 */

public class Implements {
    private static Retrofit retrofit = null;

    /**
     * Encargado de crear el cliente con la instacia retrofit a implementar
     * @return cliente retrifit.
     */
    public static Retrofit getClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(EnviromentFields.SERVER_ROUTE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }

}
