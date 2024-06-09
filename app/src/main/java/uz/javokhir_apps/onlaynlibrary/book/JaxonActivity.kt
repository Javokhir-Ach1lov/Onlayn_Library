package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityJaxonBinding

class JaxonActivity : AppCompatActivity() {
    lateinit var binding: ActivityJaxonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityJaxonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FAleksandr%20Grin%20Alvon%20yelkanlar.pdf?alt=media&token=52b8582b-b47e-4f6a-a562-1dff87b963be")
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FBerislav%20Kosier.%20Qaysar%20chol%20qissasi%20(roman).pdf?alt=media&token=d5b5842e-d666-4686-bdcd-b40dc7f5079c")
            startActivity(intent)
        }

        binding.btn3.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FBhisham%20Sahniy.%20Darichalar%20(qissa%20va%20hikoyalar).pdf?alt=media&token=5db27c8b-48ea-4f9b-80bb-4b88a0207f16")
            startActivity(intent)
        }
        binding.btn4.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FBir%20ko'zli%20qirol.pdf?alt=media&token=715b2029-9034-4cd2-a616-5c29a349a50d")
            startActivity(intent)
        }

        binding.btn5.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FBoris%20Gorbatov.%20Aleksey%20Kulikov%20jangchi%20(1943).pdf?alt=media&token=f5652f55-79d8-41b6-929f-5bbe48ae03d5")
            startActivity(intent)
        }

        binding.btn6.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FBoris%20Parmuzin.%20Maxsus%20topshiriq%20(roman).pdf?alt=media&token=5b661138-973f-4436-99fa-6aa905bb6210")
            startActivity(intent)
        }
        binding.btn7.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FBoris%20Polevoy.%20Nyurnberg%20qasosi%20(roman).pdf?alt=media&token=a48db12b-436c-4b97-b24f-51874d6e6660")
            startActivity(intent)
        }

        binding.btn8.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FBoris%20Vasilev.%20Tonglar%20edi%20sokin%20bu%20yerda%20(qissa).pdf?alt=media&token=209f6a4a-5586-4c3a-9db0-3754f957b43a")
            startActivity(intent)
        }

        binding.btn9.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FChabua%20Amirejibi.%20Data%20Tutashxia%20(roman).pdf?alt=media&token=44b12e2d-5f7b-4b03-ac6f-e0d3e7dc2d1b")
            startActivity(intent)
        }
        binding.btn10.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FD.Karnegi%20-%20Sabot%20ortidagi%20manzil.pdf?alt=media&token=123eaee8-e049-479e-a401-a7bf235042cd")
            startActivity(intent)
        }
        binding.btn11.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2FVilyam%20Shekspir.%20Hamlet%20(tragediya).pdf?alt=media&token=a2a74df8-1769-4c32-aa36-f53b70529d82")
            startActivity(intent)
        }
        binding.btn12.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FJaxon%20adabiyoti%2F%D0%94%D0%B5%D0%B9%D0%BB%20%D0%9A%D0%BE%D1%80%D0%BD%D0%B5%D0%B3%D0%B8.%20%D0%A7%D0%B8%D0%B4%D0%B0%D1%88%20%D1%81%D0%B0%D0%BD%D1%8A%D0%B0%D1%82%D0%B8.pdf?alt=media&token=ca20abab-d953-4f8b-a479-4104ce34870b")
            startActivity(intent)
        }
    }
}
