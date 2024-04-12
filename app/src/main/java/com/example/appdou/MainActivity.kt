package com.example.appdou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), View.onClickListener
{
    private lateinit var binding: ActivityMainBinding
    private lateinit var securityPreferences:
    SecurityPreferences
    private var filter: Int = MotivationConstants.PHRASEFILTER.GERAL
    private val mock: Mock = Mock()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}