package id.ngulemkuy.kelaskoding.ui.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.ngulemkuy.kelaskoding.R
import id.ngulemkuy.kelaskoding.databinding.FragmentRegisterDetailBinding

class RegisterDetailFragment : Fragment() {

    private lateinit var binding: FragmentRegisterDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRegisterDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            initListener()
        }
    }

    private fun initListener() {

    }
}