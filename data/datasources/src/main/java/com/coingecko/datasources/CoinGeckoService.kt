package com.coingecko.datasources

import com.coingecko.datasources.Constants.COIN_LIST
import com.coingecko.models.coins.RemoteCoinModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinGeckoService {
    @GET(COIN_LIST)
    suspend fun getAllCoins(
        @Query("page") currentPage: Int,
    ): Response<List <RemoteCoinModel>>
}