package com.example.arnahome.data.remote


import com.example.arnahome.data.remote.NetworkFastBuilder.Companion.provideOkHttpClientBuilder
import com.example.arnahome.data.remote.NetworkFastBuilder.Companion.provideRetrofit
import com.example.arnahome.data.remote.apiService.auth.AuthenticationApiService
import com.example.arnahome.data.remote.apiService.auth.RefreshAccessTokenApiService
import com.example.arnahome.data.remote.apiService.tours.PagingApiService
import com.example.arnahome.data.remote.apiService.user.UserApiService
import com.example.arnahome.data.remote.interceptor.AuthenticationInterceptor
import retrofit2.Retrofit
import javax.inject.Inject

class NetworkClient @Inject constructor(
    private val authenticationInterceptor: AuthenticationInterceptor,
    private val authenticator: Authenticator
) {

    private val retrofit =
        provideRetrofit(
            provideOkHttpClientBuilder().apply {
                addInterceptor(authenticationInterceptor)
                authenticator(authenticator)
            }.build()
        )

    fun generatePagingApiService() = retrofit.createAnApi<PagingApiService>()

    fun generateUserApiService() = retrofit.createAnApi<UserApiService>()

    fun generateToursApiService() = retrofit.createAnApi<ToursApiService>()


    class AuthenticationNetworkClient @Inject constructor() {
        private val retrofitNoAuth =
            provideRetrofit(provideOkHttpClientBuilder().build())

        fun generateAuthenticationApiService() =
            retrofitNoAuth.createAnApi<AuthenticationApiService>()

        fun generateRefreshAccessTokenApiService() =
            retrofitNoAuth.createAnApi<RefreshAccessTokenApiService>()
    }
}

inline fun <reified T : Any> Retrofit.createAnApi(): T = create(T::class.java)