package com.coingecko.repository.coins.coins.`interface`

import com.coingecko.models.coins.Coin

interface CoinsDataStore {
    suspend fun getAllCoins(page: Int): List<Coin>
}
