package id.ngulemkuy.kelaskoding.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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

            binding.tvEmail.text = "harun7arrashid@gmail.com"
        }
    }

    private fun initListener() {
        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_registerDetailFragment_to_loginFragment)
        }

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_registerDetailFragment_to_registerFragment)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)

    }
}