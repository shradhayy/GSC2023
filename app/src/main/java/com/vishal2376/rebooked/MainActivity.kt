package com.vishal2376.rebooked

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.vishal2376.rebooked.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    private lateinit var navController: NavController

    companion object {
        lateinit var bottomNav: BottomNavigationView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNav = binding.bottomNav

        //only light mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        //nav host setup
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        // Set up the BottomNavigationView with the NavController
        bottomNav.setupWithNavController(navController)

        //handle bottom menu click
        bottomNav.setOnNavigationItemSelectedListener { menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.itemHome -> {
                    navController.navigate(R.id.homeFragment)
                    true
                }
                R.id.itemSearch -> {
                    navController.navigate(R.id.searchFragment)
                    true
                }
                R.id.itemUpload -> {
                    navController.navigate(R.id.uploadFragment)
                    true
                }
                R.id.itemProfile -> {
                    navController.navigate(R.id.profileFragment)
                    true
                }
                else -> false
            }
        }
    }
}