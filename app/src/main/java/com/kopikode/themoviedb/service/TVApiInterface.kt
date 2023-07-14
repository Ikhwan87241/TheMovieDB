package com.kopikode.themoviedb.service

import com.kopikode.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=3010e0582f479bf6e18d974ff0ceaf42")
    fun getTVList(): Call<TVResponse>
}