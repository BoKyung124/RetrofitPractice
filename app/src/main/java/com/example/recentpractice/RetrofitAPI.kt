package com.example.recentpractice

import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RetrofitAPI {
    @FormUrlEncoded
    @POST("/api/v1/posts")
    fun postUser(): Call<User>

    @GET("/api/v1/posts/{id}")
    fun getUser(@Path("id") id: Long): Call<User>
}