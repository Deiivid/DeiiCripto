package com.coingecko.repository.coins.coins


import com.coingecko.models.coins.Coin
import com.coingecko.repository.coins.coins.factroy.CoinGeckoCoinFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoinsRepositoryImpl @Inject constructor(
    private val factory: CoinGeckoCoinFactory
) : CoinRepository {
    override suspend fun getAllCoins(
        page: Int
    ): List<Coin> =
        factory.remote.getAllCoins(page)
}