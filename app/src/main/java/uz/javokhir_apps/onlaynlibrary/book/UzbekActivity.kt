package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import uz.javokhir_apps.onlaynlibrary.MainActivity
import uz.javokhir_apps.onlaynlibrary.MainActivity2
import uz.javokhir_apps.onlaynlibrary.R

class UzbekActivity : AppCompatActivity() {

    lateinit var btn:RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uzbek)

        btn=findViewById(R.id.btn1)

        btn.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        btn=findViewById(R.id.btn2)

        btn.setOnClickListener {
            startActivity(Intent(this,navoiybook::class.java))

        }
    }
}