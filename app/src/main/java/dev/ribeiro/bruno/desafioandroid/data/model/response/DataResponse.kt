package dev.ribeiro.bruno.desafioandroid.data.model.response

import com.google.gson.annotations.SerializedName

data class DataResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("results")
    val results: List<ResultResponse>,
    @SerializedName("total")
    val total: Int
)