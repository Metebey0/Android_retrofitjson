package com.example.retrofitjsondata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/posts")
    Call<List<Posts>> getPosts();
    @GET("/user")
    Call<List<Posts>> getUsers();
}
