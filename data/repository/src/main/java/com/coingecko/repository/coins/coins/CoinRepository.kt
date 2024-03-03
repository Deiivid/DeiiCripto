package com.coingecko.repository.coins.coins

import com.coingecko.models.coins.Coin


interface CoinRepository {
    suspend fun getAllCoins(
        page: Int
    ): List<Coin>
}
