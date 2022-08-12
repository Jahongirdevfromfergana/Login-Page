package com.example.login_app

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import com.example.login_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.singUp.setOnClickListener {
            binding.singUp.background = resources.getDrawable(R.drawable.switch_trk, null)
            binding.singUp.setTextColor(resources.getColor(R.color.white, null))
            binding.logim.background = null
            binding.singUpLayout.visibility = View.VISIBLE
            binding.logInLayout.visibility = View.GONE
            binding.logim.setTextColor(resources.getColor(R.color.pinkColor, null))

        }
        binding.logim.setOnClickListener {
            binding.singUp.background = null
            binding.singUp.setTextColor(resources.getColor(R.color.pinkColor, null))
            binding.logim.background = resources.getDrawable(R.drawable.switch_trk, null)
            binding.singUpLayout.visibility = View.GONE
            binding.logInLayout.visibility = View.VISIBLE
            binding.logim.setTextColor(resources.getColor(R.color.white, null))
        }
        binding.singIns.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}