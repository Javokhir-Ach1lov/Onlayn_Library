package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.load.resource.gif.GifDrawable
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.login.SingInActivity

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)



        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,SingInActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // 2000 is the delayed time in milliseconds.
    }
}
