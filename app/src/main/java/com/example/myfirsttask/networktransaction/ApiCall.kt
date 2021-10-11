package com.example.myfirsttask.networktransaction




import com.example.myfirsttask.models.requestToLogin
import com.example.myfirsttask.models.requestToOrders
import com.example.myfirsttask.models.responseOfLogin
import com.example.myfirsttask.models.responseOfOrders
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiCall {

    @POST("/api/v1/user/login")
    fun login(@Body param: requestToLogin): Call<responseOfLogin>





    @POST("/api/v1/merchants/orders")
    fun getNewOrders(@Body param: requestToOrders): List<responseOfOrders>


}


