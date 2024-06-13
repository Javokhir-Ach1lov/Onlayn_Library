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
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Video_book%2FO'tgan_kunlar_o'zbek_film___Уткан.mp4?alt=media&token=43c50909-af2f-4d08-b1d7-764f4dd0b410"
            goToPlayerPaget(url)
        }
        binding.btn2.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Video_book%2FKecha%20va%20kunduz.mp4?alt=media&token=7e0681c6-bd8c-47f3-9949-1cfc3233b9e6"
            goToPlayerPaget(url)
        }
        binding.btn3.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Video_book%2FBobur.mp4?alt=media&token=b4122135-2882-4b1e-8580-060059ecb43d"
            goToPlayerPaget(url)
        }
        binding.btn4.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Video_book%2FSariq%20devni%20minib.mp4?alt=media&token=1b14d8ef-3ce1-4d11-9c6f-c5f35ebb9ecb"
            goToPlayerPaget(url)
        }
        binding.btn5.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Video_book%2FJannat.mp4?alt=media&token=8ef5db1f-14fb-4c3e-bf89-0f0fec2edb3a"
            goToPlayerPaget(url)
        }
        binding.btn6.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Video_book%2FTangalik%20bolalr.mp4?alt=media&token=4f6ea605-cc7d-4214-8daa-56b33d12fa2c"
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