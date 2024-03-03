package com.coingecko.mappers.coin

import com.coingecko.models.coins.Coin
import com.coingecko.models.coins.RemoteCoinModel

fun RemoteCoinModel.toDomain(): Coin {
    return Coin(
        id = this.id,
        symbol = this.symbol,
        name = this.name
    )
}
