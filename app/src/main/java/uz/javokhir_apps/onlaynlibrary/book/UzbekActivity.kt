package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityUzbekBinding

class UzbekActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUzbekBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUzbekBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FAsrga%20tatigulik%20kun_Ch.Aytmatov.pdf?alt=media&token=157918e5-f982-4185-bccd-3363f6f86ed9")
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FChinor_A.Muxtor.pdf?alt=media&token=33f47309-717d-44b0-bb97-224ed0333048")
            startActivity(intent)
        }

        binding.btn3.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FDaftar%20hoshiyasidagi%20bitiklar.pdf?alt=media&token=1b18c0ce-a820-419d-a354-b7cf5cf04b03")
            startActivity(intent)
        }
        binding.btn4.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FDunyoning%20ishlari_O%E2%80%98.Hoshimov.pdf?alt=media&token=253c7d3f-6701-474d-8f02-026c991d21fe")
            startActivity(intent)
        }

        binding.btn5.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FIkki%20eshik%20orasi%20.pdf?alt=media&token=35944b13-a42c-4c1a-a5ea-4d0571d75c43")
            startActivity(intent)
        }

        binding.btn6.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FJimjitlik_S.Ahmad.pdf?alt=media&token=dc361724-03be-4e70-a114-56c2128736c3")
            startActivity(intent)
        }
        binding.btn7.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FKo%E2%80%98hna%20dunyo_O.Yoqubov.pdf?alt=media&token=8a827a16-241e-413e-8da7-f6aa6b09bf7c")
            startActivity(intent)
        }

        binding.btn8.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FOltin%20zanglamas_Shuhrat.pdf?alt=media&token=5aeeae52-ff49-4b12-b854-f74e8a27dc6b")
            startActivity(intent)
        }

        binding.btn9.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FOtamdan%20qolgan%20dalalar_T.Murod.pdf?alt=media&token=21973dc6-68ce-4f36-b2cf-cffefa4e21bd")
            startActivity(intent)
        }
        binding.btn10.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FPirimqul%20Qodirov.%20Avlodlar%20dovoni%20(roman).pdf?alt=media&token=7507c52c-ccb8-4308-b20c-621d33018ee2")
            startActivity(intent)
        }
        binding.btn11.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FSohibqiron%20A.Oripov.pdf?alt=media&token=8fa4d571-a54b-4f45-8434-00bc03abcf81")
            startActivity(intent)
        }
        binding.btn12.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FO'zbek%20adabiyoti%2FTemir%20xotin_Sh.Boshbekov.pdf?alt=media&token=9bddea01-571b-439c-a94d-861ba0122160")
            startActivity(intent)
        }
    }
}
