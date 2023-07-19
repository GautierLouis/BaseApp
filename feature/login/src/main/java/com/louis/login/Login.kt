package com.louis.login

import com.louis.network.GithubRemoteSource

class Login {

    val service = GithubRemoteSource()

    suspend fun doLogin() = service.auth()
}