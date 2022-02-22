package com.example.aplikasicovid.api

import android.telecom.Call
import com.example.aplikasicovid.model.IndonesiaResponse
import com.example.aplikasicovid.model.ProvinceResponse
import retrofit2.http.GET

interface Api{
    @GET ("casenumber.json")
    fun getIndonesia(): retrofit2.Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): retrofit2.Call<ArrayList<ProvinceResponse>>
}
