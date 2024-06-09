package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityXorijBinding

class XorijActivity : AppCompatActivity() {

    lateinit var binding: ActivityXorijBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityXorijBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2F1_Frank_Reilly's_Investment_Analysis_and_Portfolio_Management_10th.pdf?alt=media&token=2a8851ce-d81a-45b6-bbd8-d57d653c4946")
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2F2_Edwin_J_Elton%2C_Martin_J_Gruber%2C_Stephen_J_Brow_Modern_Portfolio.pdf?alt=media&token=401cadd4-f60e-4855-bd17-20598c8ebea3")
            startActivity(intent)
        }

        binding.btn3.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2F6_Bodie's%20Investments%2C%2010th%20Edition.pdf?alt=media&token=d1300451-9389-4248-9da8-14e9d48a9ac7")
            startActivity(intent)
        }
        binding.btn4.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2FAmfibiya%20odam.pdf?alt=media&token=942fb85a-aab9-4f0f-b193-466b7ba34468")
            startActivity(intent)
        }

        binding.btn5.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2FBankir%20%5B%40kitoblar_pdf%5D.PDF?alt=media&token=1190415c-b9be-4293-84d0-0371ad9bcd3e")
            startActivity(intent)
        }

        binding.btn6.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2FG.G.Markes._Bizning_sharimizda_ogri_yoq.pdf?alt=media&token=f2650c57-0abb-458a-ac6d-a5639d954ed4")
            startActivity(intent)
        }
        binding.btn7.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2FKo%CA%BBzlarim%20yo%CA%BBlingda%20Xazonrezgi.pdf?alt=media&token=57acb65d-8038-4c58-81f1-48bfd2e35a1e")
            startActivity(intent)
        }

        binding.btn8.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2FMo'jiza%20sodir%20bo'lmaydi%20%5B%40kitoblar_pdf%5D.pdf?alt=media&token=029a7f82-5598-45a9-9bd3-968dcc082506")
            startActivity(intent)
        }

        binding.btn9.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2F%D0%90%D0%B3%D0%B0%D1%82%D0%B0%20%D0%9A%D1%80%D0%B8%D1%81%D1%82%D0%B8.%20%D0%A2%D0%B8%D0%BB%D0%BC%D0%B8%D1%81%D0%BB%D0%B8%20%D1%88%D0%B0%D1%85%D0%BC%D0%B0%D1%82.pdf?alt=media&token=fa3ac46f-7c32-4f99-8f0b-4a0c849331f1")
            startActivity(intent)
        }
        binding.btn10.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2FMorella.%20Edgar%20Po..pdf?alt=media&token=c99e0ac4-75b4-4c42-8663-0e1995d25ab3")
            startActivity(intent)
        }
        binding.btn11.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2FRichard%20Bax.%20Oqcharloq%20Jonatan%20Livingston.pdf?alt=media&token=f0e9f0c3-7b4e-458c-a7b1-c30b21a5a69e")
            startActivity(intent)
        }
        binding.btn12.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FXorij%20adabiyoti%2F%D0%AD%D0%B2%D1%80%D0%B8%D0%BB%D0%B8%D1%88.%20%D0%A4%D1%80%D0%B0%D0%BD%D1%86%20%D0%9A%D0%B0%D1%84%D0%BA%D0%B0.%20%D0%A2%D0%BE%D1%88%D0%BA%D0%B5%D0%BD%D1%82-2021.pdf?alt=media&token=74b641f4-a162-4a36-bbec-64f429d624f2")
            startActivity(intent)
        }
    }
}
