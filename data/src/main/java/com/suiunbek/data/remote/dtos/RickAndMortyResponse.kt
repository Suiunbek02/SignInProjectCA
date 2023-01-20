package com.suiunbek.data.remote.dtos

import android.icu.text.IDNA
import com.google.gson.annotations.SerializedName

 data class RickAndMortyResponse<T> (

     @SerializedName("info")
    val info: Info,

     @SerializedName("results")
    val results: ArrayList<T>

 )