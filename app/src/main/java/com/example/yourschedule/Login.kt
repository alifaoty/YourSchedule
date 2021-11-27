package com.example.yourschedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val inputEmail: EditText = findViewById(R.id.etEmail)
        val inputPassword: EditText = findViewById(R.id.etPassword)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        val Email = "Haekal Hanasta"
        val Password = "HaekalH660"
        btnLogin.setOnClickListener {
            if (inputEmail.length() == 0) {
                val toast = Toast.makeText(this,"Masukkan username", Toast.LENGTH_SHORT)
                toast.show()
                if (inputPassword.length() == 0) {
                    val toast2 = Toast.makeText(this,"Masukkan password", Toast.LENGTH_SHORT)
                    toast2.show()}


            }else{
                val inputemail = inputEmail.getText().toString()
                if(inputemail==Email){
                    val toast = Toast.makeText(this,"Haekal", Toast.LENGTH_SHORT)
                    toast.show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)




                }else{
                    val toast = Toast.makeText(this, "Username dan Password tidak terdaftar", Toast.LENGTH_SHORT)
                    toast.show()

                }

            }


            if (inputEmail.length() == 0) {
                val toast = Toast.makeText(this,"Masukkan password", Toast.LENGTH_SHORT)
                toast.show()

            }else{
                val inputPassword = inputPassword.getText().toString()
                if(inputPassword==Password){
                    val toast = Toast.makeText(this,"Hai, Haekal Hanasta", Toast.LENGTH_SHORT)
                    toast.show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)


                }else{

                }
            }
        }
    }
}