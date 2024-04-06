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
            val url=""
            goToPlayerPage(url)
        }

        binding.btn2.setOnClickListener {
            val url=""
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
