package id.ngulemkuy.kelaskoding.ui.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import id.ngulemkuy.kelaskoding.R
import id.ngulemkuy.kelaskoding.databinding.FragmentLoginDetailBinding


class LoginDetailFragment : Fragment() {

    private lateinit var binding: FragmentLoginDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLoginDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            initListener()
        }
    }

    private fun initListener() {
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginDetailFragment_to_homeActivity)
            requireActivity().finish()
        }

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_loginDetailFragment_to_loginFragment)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)
    }

}