package uz.javokhir_apps.onlaynlibrary

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.javokhir_apps.onlaynlibrary.book.UzbekActivity
import uz.javokhir_apps.onlaynlibrary.databinding.FragmentKitobBinding

class Kitob : Fragment() {
    lateinit var binding: FragmentKitobBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKitobBinding.inflate(inflater, container, false)

        binding.btn1.setOnClickListener {
            val intent = Intent(requireContext(), UzbekActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }
}