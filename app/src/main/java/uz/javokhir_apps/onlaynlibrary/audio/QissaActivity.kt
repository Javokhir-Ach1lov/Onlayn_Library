package uz.javokhir_apps.onlaynlibrary.audio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityQissaBinding

class QissaActivity : AppCompatActivity() {

    lateinit var binding: ActivityQissaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityQissaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fqissa%2Fsaraton.mp3?alt=media&token=3a3afc5f-f51b-4bab-a97c-c45a2539db99"
            goToPlayerPage(url)
        }

        binding.btn2.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fqissa%2Fqor%20xat.mp3?alt=media&token=2f8c47db-0e77-4e0d-99ec-e98273cd6fbb"
            goToPlayerPage(url)
        }
        binding.btn3.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fqissa%2Ftashvish.mp3?alt=media&token=e6c8e7b6-ddd6-4adc-9be6-d94f40df1904"
            goToPlayerPage(url)
        }
        binding.btn4.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fqissa%2Fiblis.mp3?alt=media&token=8d48278e-346f-41a6-a508-ec6fce4441dc"
            goToPlayerPage(url)
        }
        binding.btn5.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fqissa%2Fgildirak.mp3?alt=media&token=99f3d2a4-d87f-4da0-9283-e11b601fabf3"
            goToPlayerPage(url)
        }
        binding.btn6.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fqissa%2Ftun%20panjara.mp3?alt=media&token=4de380f0-a368-4064-9cca-5d4a155dfda2"
            goToPlayerPage(url)
        }
    }

    private fun goToPlayerPage(url: String) {
        val intent = Intent(this, MusicPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
