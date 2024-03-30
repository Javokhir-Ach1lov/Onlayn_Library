package uz.javokhir_apps.onlaynlibrary.audio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityMediaPlayerBinding
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityMusicPlayerBinding

class MusicPlayerActivity : AppCompatActivity() {

    lateinit var binding: ActivityMusicPlayerBinding
    lateinit var player: ExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMusicPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url=intent.getStringExtra("url")

        player=ExoPlayer.Builder(this).build()
        binding.playerView.player=player

        val mediaItem= MediaItem.fromUri(url!!)
        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()

        player.addListener(object : Player.Listener{
            override fun onPlayerError(error: PlaybackException) {
                Toast.makeText(applicationContext,"Error playing media", Toast.LENGTH_SHORT).show()
                super.onPlayerError(error)
            }
        })
    }


    override fun onStart() {
        super.onStart()
        player.playWhenReady=true
    }

    override fun onStop() {
        super.onStop()
        player.playWhenReady=false
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}