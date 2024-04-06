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
            val url="https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fsheriat%2Fvatan.mp3?alt=media&token=284ac1f2-f93b-446e-b934-e7badb59019d"
            goToPlayerPage(url)
        }

        binding.btn2.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fsheriat%2Fjoni%20dilim.mp3?alt=media&token=18e9c252-1f7e-45b8-bdcd-74c8e973191d"
            goToPlayerPage(url)
        }
        binding.btn3.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fsheriat%2Foltin%20kuz.mp3?alt=media&token=2a313f51-e1d9-4013-b3d4-4cb0264e60bf"
            goToPlayerPage(url)
        }
        binding.btn4.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fsheriat%2Fo'zbek%20momo.mp3?alt=media&token=8d2bac14-b51b-4a49-829b-15f72216643c"
            goToPlayerPage(url)
        }
        binding.btn5.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fsheriat%2FBolalaigim.mp3?alt=media&token=8fc5f6b7-ddbc-45ff-b206-8de76f8535b7 "
            goToPlayerPage(url)
        }
        binding.btn6.setOnClickListener {
            val url = "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/Audio%2Fsheriat%2Fsherlar.mp3?alt=media&token=f59791a2-5f2f-455c-947f-9f50294732b4"
            goToPlayerPage(url)
        }
    }

    private fun goToPlayerPage(url: String) {
        val intent = Intent(this, MusicPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
