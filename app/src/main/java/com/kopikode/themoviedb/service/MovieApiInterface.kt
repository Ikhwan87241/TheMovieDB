package com.kopikode.themoviedb.service

import com.kopikode.themoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=3010e0582f479bf6e18d974ff0ceaf42")
    fun getMovieList(): Call<MovieResponse>
}