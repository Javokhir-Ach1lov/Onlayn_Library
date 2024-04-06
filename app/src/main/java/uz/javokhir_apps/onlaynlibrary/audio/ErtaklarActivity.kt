package uz.javokhir_apps.onlaynlibrary.audio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityErtaklarBinding

class ErtaklarActivity : AppCompatActivity() {

    lateinit var binding: ActivityErtaklarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityErtaklarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fertaklar%2Foltin%20yurakli.mp3?alt=media&token=f6cd97d6-b700-476d-884e-3ceeaf5c6130"
            goToPlayerPage(url)
        }

        binding.btn2.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fertaklar%2Faqilli%20bola.mp3?alt=media&token=1e3d7d10-3a5b-47b6-9dd3-8dd6184f8a03"
            goToPlayerPage(url)
        }
        binding.btn3.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fertaklar%2Fxurmacha.mp3?alt=media&token=6bd0b7a0-3a27-4b13-8a67-4f766f1b51b6"
            goToPlayerPage(url)
        }
        binding.btn4.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fertaklar%2F3%20dost.mp3?alt=media&token=c3407b91-c4f5-4761-91df-b84c9940bc00"
            goToPlayerPage(url)
        }
        binding.btn5.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fertaklar%2Fchoqqi.mp3?alt=media&token=0f0a3d2f-3c25-442b-a159-39b09b8f1615"
            goToPlayerPage(url)
        }
        binding.btn6.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fertaklar%2Fbo'ri.mp3?alt=media&token=c0eec75c-4caf-449c-ab83-fa72a4b586f6"
            goToPlayerPage(url)
        }
    }

    private fun goToPlayerPage(url: String) {
        val intent = Intent(this, MusicPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
