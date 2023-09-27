package com.example.loginvitordubiela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginvitordubiela.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        val i = intent
        val password = i.extras?.getString("password")

        if (!password.isNullOrEmpty())
            setContentView(binding.root)
        else
            finish()

        binding.buttonSubmit.setOnClickListener {
            finish()
        }
    }

    fun voltar(view: View) {}
}