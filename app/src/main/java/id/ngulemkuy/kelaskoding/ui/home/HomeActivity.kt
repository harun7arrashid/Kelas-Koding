package id.ngulemkuy.kelaskoding.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.ngulemkuy.kelaskoding.R
import id.ngulemkuy.kelaskoding.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarHome)
        supportActionBar?.hide()
        setupNavController()
    }

    private fun setupNavController() {
        val navView: BottomNavigationView = binding.bottomNavHome
        val navController: NavController  = findNavController(R.id.nav_host_home)

        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.navigation_bootcamp,
            R.id.navigation_profile
        ).build()

     setupActionBarWithNavController(navController, appBarConfiguration)
     navView.setupWithNavController(navController)
    }
}