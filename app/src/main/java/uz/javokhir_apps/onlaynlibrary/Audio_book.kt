package uz.javokhir_apps.onlaynlibrary

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.javokhir_apps.onlaynlibrary.audio.ErtaklarActivity
import uz.javokhir_apps.onlaynlibrary.audio.GazallarActivity
import uz.javokhir_apps.onlaynlibrary.audio.NazmActivity
import uz.javokhir_apps.onlaynlibrary.audio.QissaActivity
import uz.javokhir_apps.onlaynlibrary.audio.UzbekAudio
import uz.javokhir_apps.onlaynlibrary.databinding.FragmentAudioBookBinding

class Audio_book : Fragment() {

    lateinit var binding: FragmentAudioBookBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        binding= FragmentAudioBookBinding.inflate(layoutInflater)

        binding.btn1.setOnClickListener {
            val intent=Intent(requireContext(),UzbekAudio::class.java)
            startActivity(intent)
        }
        binding.btn2.setOnClickListener {
            val intent=Intent(requireContext(),ErtaklarActivity::class.java)
            startActivity(intent)
        }
        binding.btn12.setOnClickListener {
            val intent=Intent(requireContext(),GazallarActivity::class.java)
            startActivity(intent)
        }
        binding.btn3.setOnClickListener {
            val intent=Intent(requireContext(),NazmActivity::class.java)
            startActivity(intent)
        }
        binding.btn34.setOnClickListener {
            val intent=Intent(requireContext(),QissaActivity::class.java)
            startActivity(intent)
        }

        return (binding.root)


    }
}