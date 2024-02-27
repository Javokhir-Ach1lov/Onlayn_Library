package uz.javokhir_apps.onlaynlibrary

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.javokhir_apps.onlaynlibrary.databinding.FragmentVideoBookBinding

class video_book : Fragment() {

    lateinit var binding: FragmentVideoBookBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVideoBookBinding.inflate(layoutInflater)

        binding.btn1.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Video_book%2Fvideo_2024-02-27_02-47-47.mp4?alt=media&token=db3c15ca-709e-4fe8-8b89-ecb6503fd09e"
            goToPlayerPaget(url)
        }

        binding.btn2.setOnClickListener {
            val url = ""
            goToPlayerPaget(url)
        }

        binding.btn3.setOnClickListener {
            val url = ""
            goToPlayerPaget(url)
        }

        binding.btn4.setOnClickListener {
            val url = ""
            goToPlayerPaget(url)
        }

        return binding.root
    }

    fun goToPlayerPaget(url: String) {
        val intent = Intent(requireContext(), MediaPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

}