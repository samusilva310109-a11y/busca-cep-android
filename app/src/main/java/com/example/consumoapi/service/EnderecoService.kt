package com.example.consumoapi.service

import com.example.consumoapi.model.Endereco
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {
    @GET("{cep}/json/") // Define o protocolo HTTP utilizado e sua rota
    fun getEnderecoByCep(
        //Define qual o parametro da rota
        @Path("cep") cep: String
    ): Call<Endereco>

    @GET("{uf}/{cidade}/{rua}/json")
    fun getEnderecoByUFCidadeRua(
        @Path("uf") uf: String,
        @Path("cidade") cidade: String,
        @Path("rua") rua: String
    ): Call<List<Endereco>>
}