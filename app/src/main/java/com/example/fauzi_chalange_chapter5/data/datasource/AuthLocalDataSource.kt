package com.example.fauzi_chalange_chapter5.data.datasource

interface AuthLocalDataSource {
   suspend fun saveToken(logtoken: String)
   suspend fun loadToken(): String?
   suspend fun clearToken()
}