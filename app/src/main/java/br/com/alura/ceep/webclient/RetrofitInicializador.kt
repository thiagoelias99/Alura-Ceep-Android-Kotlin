package br.com.alura.ceep.webclient

import br.com.alura.ceep.webclient.services.NotaService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitInicializador {
    private val client by lazy {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }

    private val retrofit: Retrofit = Retrofit.Builder()
//        .baseUrl("http://192.168.1.145:8080/")   //Note
        .baseUrl("http://192.168.1.75:8080/")  //PC
        .addConverterFactory(MoshiConverterFactory.create())
        .client(client)
        .build()

    val notaService = retrofit.create(NotaService::class.java)
}