package com.example.recentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //서비스 호출
        val service: RetrofitAPI = RetrofitClientInstance().getRetrofitInstance().create(RetrofitAPI::class.java)

        //콜백 정의
        var call: Call<User> = service.getUser(1)

        var interceptor = HttpLoggingInterceptor()
        var client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        call.enqueue(object : Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if(response.isSuccessful) {
                    var result : User? = response.body()
                    Log.d("YMC", "onResponse 성공: " + result?.toString())

                } else {
                    Log.d("YMC", "onResponse 실패")
                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.d("YMC", "onFailure 에러: " + t.message.toString())
            }
        })
    }
}