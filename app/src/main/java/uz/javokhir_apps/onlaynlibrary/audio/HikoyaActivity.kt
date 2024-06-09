package uz.javokhir_apps.onlaynlibrary.audio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityHikoyaBinding

class HikoyaActivity : AppCompatActivity() {

    lateinit var binding: ActivityHikoyaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHikoyaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2FHikoya%2Fqor%20quynida%20lola.mp3?alt=media&token=f2901bab-9d54-4dca-8367-ec231fe2cc02"
            goToPlayerPage(url)
        }

        binding.btn2.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2FHikoya%2Fqor%20quynida%20lola.mp3?alt=media&token=f2901bab-9d54-4dca-8367-ec231fe2cc02"
            goToPlayerPage(url)
        }
        binding.btn3.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2FHikoya%2Fmeshpalvon.mp3?alt=media&token=279a5f1b-8153-40ce-933c-d010ca77a1db"
            goToPlayerPage(url)
        }
        binding.btn4.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2FHikoya%2Fnetay.mp3?alt=media&token=4d060ffa-4cb8-4b35-b03d-6eac0d1f476d"
            goToPlayerPage(url)
        }
        binding.btn5.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2FHikoya%2Fhavviy.mp3?alt=media&token=bc5c638a-b7e5-46a0-b4a1-06a37139177b"
            goToPlayerPage(url)
        }
        binding.btn6.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2FHikoya%2Fuy.mp3?alt=media&token=ac8012b3-3de0-46cc-a17b-ad82ab964532"
            goToPlayerPage(url)
        }
    }

    private fun goToPlayerPage(url: String) {
        val intent = Intent(this, MusicPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
