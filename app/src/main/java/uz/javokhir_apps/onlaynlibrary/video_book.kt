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

        return binding.root
    }

    fun goToPlayerPaget(url: String) {
        val intent = Intent(requireContext(), MediaPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

}