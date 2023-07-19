package com.louis.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.HttpRequestRetry
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.cache.HttpCache
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.ANDROID
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class GithubRemoteSource : GithubService {

    val client = HttpClient(OkHttp) {
        install(HttpCache)
        install(Logging) {
            logger = Logger.ANDROID
            level = LogLevel.ALL
        }
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
        install(Auth)
        install(HttpRequestRetry) {
            retryOnExceptionOrServerErrors(maxRetries = 2)
            exponentialDelay()
        }
    }

    override suspend fun auth() {
        try {
            val httpResponse = client.get("https://api.bridgeapi.io/v2/banks") {
                headers {
                    append("Bridge-Version", "2021-06-01")
                }
            }

            if (httpResponse.status.value in 200..299) {
                println("Successful response!")
            }
        } catch (e: Exception) {
            println(e.message)
            println(e.cause)
        }
    }
}