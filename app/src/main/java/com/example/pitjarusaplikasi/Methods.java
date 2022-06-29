package com.example.pitjarusaplikasi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {

    @GET("login/loginTest")
    Call<Model> getAllData();
}
