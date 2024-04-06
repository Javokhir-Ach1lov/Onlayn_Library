package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityErtaklar2Binding

class ErtaklarActivity : AppCompatActivity() {

    lateinit var binding: ActivityErtaklar2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityErtaklar2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FIkki%20eshik%20orasi%20.pdf?alt=media&token=35944b13-a42c-4c1a-a5ea-4d0571d75c43")
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FDaftar%20hoshiyasidagi%20bitiklar.pdf?alt=media&token=1b18c0ce-a820-419d-a354-b7cf5cf04b03")
            startActivity(intent)
        }

        binding.btn3.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FPirimqul%20Qodirov.%20Avlodlar%20dovoni%20(roman).pdf?alt=media&token=7507c52c-ccb8-4308-b20c-621d33018ee2")
            startActivity(intent)
        }
    }
}
