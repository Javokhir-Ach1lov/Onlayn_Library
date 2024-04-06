package uz.javokhir_apps.onlaynlibrary.audio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityGazallarBinding

class GazallarActivity : AppCompatActivity() {

    lateinit var binding: ActivityGazallarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGazallarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fgazallar%2Fjudo.mp3?alt=media&token=8ceb180c-e47e-4477-bf18-77beb498c3b0"
            goToPlayerPage(url)
        }

        binding.btn2.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fgazallar%2Fyoshligim.mp3?alt=media&token=acd9fc7d-28da-4aa1-9e55-96e572eefc7f"
            goToPlayerPage(url)
        }
        binding.btn3.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fgazallar%2Fuvaysiy.mp3?alt=media&token=2e6cfb00-87c1-4a60-b1d0-69b454f76922"
            goToPlayerPage(url)
        }
        binding.btn4.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fgazallar%2Fjomiy.mp3?alt=media&token=96a0ae2d-2783-4c21-9e1a-ac48d2b7f050"
            goToPlayerPage(url)
        }
        binding.btn5.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fgazallar%2Fvosit.mp3?alt=media&token=ed33199b-2cda-423f-9ad4-4edfbb1d8aab"
            goToPlayerPage(url)
        }
        binding.btn6.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fgazallar%2Fouqiz.mp3?alt=media&token=8f4acbd9-7354-4dac-87ed-641ad6886c8d"
            goToPlayerPage(url)
        }
    }

    private fun goToPlayerPage(url: String) {
        val intent = Intent(this, MusicPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
