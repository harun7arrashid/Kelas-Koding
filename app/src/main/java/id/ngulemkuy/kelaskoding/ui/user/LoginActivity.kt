package id.ngulemkuy.kelaskoding.ui.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ngulemkuy.kelaskoding.R
import id.ngulemkuy.kelaskoding.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarLogin)
    }
}