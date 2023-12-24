package com.rinihusadiyah.suitmediatestrini.network

import com.rinihusadiyah.suitmediatestrini.model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {
    @GET("api/users")
    fun getUser(
        @QueryMap parameters: HashMap<String, String>
    ): Call<ApiResponse>
}