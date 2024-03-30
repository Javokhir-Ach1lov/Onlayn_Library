package uz.javokhir_apps.onlaynlibrary.audio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.javokhir_apps.onlaynlibrary.MediaPlayerActivity
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityUzbekAudioBinding

class UzbekAudio : AppCompatActivity() {

    private lateinit var binding: ActivityUzbekAudioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUzbekAudioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fqo'shiq.mp3?alt=media&token=b91a258e-8d9a-4f29-967d-560937412fb9"
            goToPlayerPage(url)
        }

        binding.btn2.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fmuzika.mp3?alt=media&token=3ddd61b5-c8c0-47bd-a35f-1de6fa2682da"
            goToPlayerPage(url)
        }
        binding.btn3.setOnClickListener {
            val url = ""
            goToPlayerPage(url)
        }
        binding.btn4.setOnClickListener {
            val url = ""
            goToPlayerPage(url)
        }
        binding.btn5.setOnClickListener {
            val url = ""
            goToPlayerPage(url)
        }
        binding.btn6.setOnClickListener {
            val url = ""
            goToPlayerPage(url)
        }
    }

    private fun goToPlayerPage(url: String) {
        val intent = Intent(this, MusicPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
