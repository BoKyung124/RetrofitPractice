package com.example.recentpractice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientInstance {
    companion object{
        private val BASE_URL: String = "https://eunproject.herokuapp.com";
    }

    fun getRetrofitInstance(): Retrofit {
        var retrofit = retrofit2
            .Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            //.addConverterFactory(ScalarsConverterFactory.create())
            .build()!!
        return retrofit
    }
}