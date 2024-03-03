package com.coingecko.repository.coins.coins.datastore

import com.coingecko.datasources.CoinGeckoService
import com.coingecko.mappers.coin.toDomain
import com.coingecko.models.coins.Coin
import com.coingecko.repository.coins.coins.CoinRepository

class RemoteCoinDataStoreImpl(
    private val coinGeckoService: CoinGeckoService
) : CoinRepository {
    override suspend fun getAllCoins(
        page: Int
    ): List<Coin> {
        val result =
            this@RemoteCoinDataStoreImpl.coinGeckoService.getAllCoins(page)

        if (result.isSuccessful)
            return (result.body()?.map { coins ->
                coins.toDomain()
            } ?: emptyList())

        return emptyList()

    }

}
