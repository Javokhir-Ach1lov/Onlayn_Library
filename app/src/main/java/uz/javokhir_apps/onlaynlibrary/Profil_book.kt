package uz.javokhir_apps.onlaynlibrary

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.javokhir_apps.onlaynlibrary.databinding.FragmentProfilBookBinding

class Profil_book : Fragment() {

    lateinit var binding: FragmentProfilBookBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentProfilBookBinding.inflate(layoutInflater)

        binding.telephon.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:+998930696374")
            }
        binding.telegram.setOnClickListener {
            val telegramUsername = "Javokhir_achilov"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/Javokhir_achilov"))
            startActivity(intent)
        }
        binding.pochta.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:achilojavokhir@gmail.com")
                putExtra(Intent.EXTRA_SUBJECT, "Subject")
                putExtra(Intent.EXTRA_TEXT, "Message body")
            }
        }
            startActivity(intent)
        }

        return binding.root
    }
}