package com.example.myfirsttask

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirsttask.adapters.Instantiation
import com.example.myfirsttask.models.requestToLogin
import com.example.myfirsttask.models.responseOfLogin
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
var username:String = "sobankhn4"
var password:String = "Maliks0ban"
var token:String = "Maliks0ban"
    var dialog: CustomDialogue? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dialog = CustomDialogue(this@MainActivity)
        val requestToLogin = requestToLogin()
        requestToLogin.setUserName(username)
        requestToLogin.setPassword(password)
        dialog!!.show()
        val instantiation = Instantiation()
        val loginResponseCall: Call<responseOfLogin> = instantiation.generateCallToAPI()!!.login(requestToLogin)
        loginResponseCall.enqueue(object : Callback<responseOfLogin> {
            override fun onResponse(call: Call<responseOfLogin>, response: Response<responseOfLogin>) {
                if (response.isSuccessful()) {
                    Toast.makeText(this@MainActivity, "Logged in Successfully", Toast.LENGTH_SHORT).show()
                    token= response.body()?.getToken().toString()
                } else {
                    Toast.makeText(this@MainActivity, "Failed to Login", Toast.LENGTH_SHORT).show()
                }
                dialog!!.dismiss()
            }
            override fun onFailure(call: Call<responseOfLogin>, t: Throwable) {
                Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })





    }
}