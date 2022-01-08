package id.ngulemkuy.kelaskoding.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import id.ngulemkuy.kelaskoding.databinding.ActivitySplashBinding
import id.ngulemkuy.kelaskoding.ui.user.LoginActivity

class SplashActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySplashBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed( {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 1500)
    }
}