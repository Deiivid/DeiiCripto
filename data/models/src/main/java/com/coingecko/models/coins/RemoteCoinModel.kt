package com.coingecko.models.coins

import com.google.gson.annotations.SerializedName

data class RemoteCoinModel(
    @SerializedName("id") val id: String,
    @SerializedName("symbol") val symbol: String,
    @SerializedName("name") val name: String
)


