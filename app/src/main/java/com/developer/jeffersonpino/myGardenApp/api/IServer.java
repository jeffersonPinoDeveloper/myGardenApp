package com.developer.jeffersonpino.myGardenApp.api;

import com.developer.jeffersonpino.myGardenApp.model.request.LoginRequest;
import com.developer.jeffersonpino.myGardenApp.model.response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by jeffersonpino on 18/06/17.
 */

interface IServer {

    /**
     * ejemplo de implementacion para intento POST Login con Call Retrofit
     * */
    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @POST("/iAgree/rest/AndroidWS/login") //ruta del webservices
    Call<LoginResponse> login (@Body LoginRequest request);

}
