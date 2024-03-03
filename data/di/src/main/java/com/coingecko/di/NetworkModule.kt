package com.coingecko.di

import com.coingecko.datasources.Constants.BASE_URL
import com.coingecko.datasources.CoinGeckoService
import com.coingecko.repository.coins.coins.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val TIMER = 120L

    @Singleton
    @Provides
    fun provideRetrofit(): CoinGeckoService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(provideOkHttpClient())
            .build().create(CoinGeckoService::class.java)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(TIMER, TimeUnit.SECONDS)
            .readTimeout(TIMER, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun provideCharacterRepository(remoteService: CoinGeckoService): CoinRepository {
        return RemoteCoinDataStoreImpl(remoteService)
    }
}
