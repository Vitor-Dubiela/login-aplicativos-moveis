package com.example.loginvitordubiela

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginvitordubiela.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonSubmit.setOnClickListener {
            val userName: String = binding.editTextText.text.toString().trim()
            val passW : String = binding.editTextTextPassword.text.toString()

            if (userName.isEmpty() || passW.isEmpty())
                Toast
                    .makeText(applicationContext,
                        R.string.msg_empty_fields,
                        Toast.LENGTH_LONG)
                    .show()
            else if(!binding.checkBox.isChecked) {
                Toast
                    .makeText(applicationContext,
                        R.string.msg_term_not_checked,
                        Toast.LENGTH_LONG)
                    .show()
            }
            else {
                val i = Intent(this, HomeActivity::class.java)
                i.putExtra("password", passW)

                startActivity(i)
            }
        }
    }
}