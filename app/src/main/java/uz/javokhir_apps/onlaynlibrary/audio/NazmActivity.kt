package uz.javokhir_apps.onlaynlibrary.audio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityNazmBinding

class NazmActivity : AppCompatActivity() {

    lateinit var binding: ActivityNazmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNazmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fnazm%2FHalima%20Xudoyberdieva.mp3?alt=media&token=a64b9019-366c-4878-a819-0cb723213237"
            goToPlayerPage(url)
        }

        binding.btn2.setOnClickListener {
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fnazm%2FZahiriddin%20Muhammad%20Bobur.mp3?alt=media&token=318280c8-19c3-4829-b974-de448868d441"
            goToPlayerPage(url)
        }
        binding.btn3.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fnazm%2Fcho'lpon.mp3?alt=media&token=a559c01c-2cec-40f5-b931-5388bb166a54"
            goToPlayerPage(url)
        }
        binding.btn4.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fnazm%2Fnavoiy.mp3?alt=media&token=6a3fafb2-96fd-4668-b13b-579829a0e1ed"
            goToPlayerPage(url)
        }
        binding.btn5.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fnazm%2Fyusuf.mp3?alt=media&token=bb7273b2-a6f3-443c-a666-ecb3b05ac650"
            goToPlayerPage(url)
        }
        binding.btn6.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fnazm%2Fkelmadi.mp3?alt=media&token=e78de017-98cf-4b6d-af75-29d40e3f24ef"
            goToPlayerPage(url)
        }
    }

    private fun goToPlayerPage(url: String) {
        val intent = Intent(this, MusicPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
