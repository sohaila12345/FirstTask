package com.example.myfirsttask.adapters

import com.example.myfirsttask.networktransaction.ApiCall
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Instantiation {
    private fun getRetrofit(): Retrofit? {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val okHttpClient = OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()
        return Retrofit.Builder()
            .baseUrl("https://api-stg.martcart.pk/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun generateCallToAPI(): ApiCall? {
        val callToAPI = getRetrofit()!!.create(ApiCall::class.java)
        return callToAPI
    }
}