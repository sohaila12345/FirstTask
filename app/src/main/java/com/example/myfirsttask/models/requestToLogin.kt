package com.example.myfirsttask.models

import com.google.gson.annotations.Expose

class requestToLogin {
    @responseOfLogin.SerializedName("userName")
    @Expose
    private var userName: String? = null

    @responseOfLogin.SerializedName("password")
    @Expose
    private var password: String? = null

    fun getUserName(): String? {
        return userName
    }

    fun setUserName(userName: String?) {
        this.userName = userName
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String?) {
        this.password = password
    }
}