package com.example.rawgame.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.rawgame.R
import com.example.rawgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
   private lateinit var navController: NavController
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
      setContentView(binding.root)

      val navHostFragment =
         supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
      navController = navHostFragment.navController
   }
}