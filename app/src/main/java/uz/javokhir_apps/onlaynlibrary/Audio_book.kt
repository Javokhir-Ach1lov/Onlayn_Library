package uz.javokhir_apps.onlaynlibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.javokhir_apps.onlaynlibrary.databinding.FragmentAudioBookBinding

class Audio_book : Fragment() {

    lateinit var binding: FragmentAudioBookBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        binding= FragmentAudioBookBinding.inflate(layoutInflater)
        return (binding.root)
    }
}