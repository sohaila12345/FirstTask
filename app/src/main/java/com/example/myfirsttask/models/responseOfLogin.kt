package com.example.myfirsttask.models

class responseOfLogin {

    @SerializedName("token")
    @Expose
    private var token: String? = null

    annotation class SerializedName(val value: String)

    annotation class Expose

    fun getToken(): String? {
        return token
    }

    fun setToken(token: String?) {
        this.token = token
    }
}