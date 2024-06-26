package uz.javokhir_apps.onlaynlibrary

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import uz.javokhir_apps.onlaynlibrary.databinding.FragmentProfilBookBinding

class Profil_book : Fragment() {

    lateinit var binding: FragmentProfilBookBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfilBookBinding.inflate(layoutInflater)

        

        binding.telephon.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:+998 90 141 73 31")
            }
            startActivity(intent)
        }
        binding.github.setOnClickListener {
            val username = "ErgashevaMashxura" // GitHub profil nomini yozing
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/$username"))
            startActivity(intent)
        }

        binding.telegram.setOnClickListener {
            val telegramUsername = "Mashkhurakhon_Ergasheva"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/$telegramUsername"))
            startActivity(intent)
        }

        binding.pochta.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:emashxuraxon@gmail.com")
                putExtra(Intent.EXTRA_SUBJECT, "Subject")
                putExtra(Intent.EXTRA_TEXT, "Message body")
            }
        }
        return binding.root
    }
}
