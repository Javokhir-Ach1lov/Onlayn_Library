package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityErtaklar2Binding
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityErtaklarBinding
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityJaxonBinding

class ErtaklarActivity : AppCompatActivity() {
    lateinit var binding: ActivityErtaklar2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityErtaklar2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2F%40BOOKS_KITOB%20XITOY%20ERTAKLARI.PDF?alt=media&token=4d8ff517-c9e9-44bc-9a15-ade1beeb5f98")
            startActivity(intent)
        }
        binding.btn2.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2FGans%20Xristian%20Andersen.%20Oltin%20bola%20(ertaklar).pdf?alt=media&token=ab1b7543-8efe-4f48-b620-8cc609392998")
            startActivity(intent)
        }
        binding.btn3.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2FArab%20xalq%20ertaklari.Ming%20bir%20kecha%20(1%20-%20kitob).pdf?alt=media&token=f1e872b3-39c8-44b0-8dee-7daf419c9228")
            startActivity(intent)
        }
        binding.btn4.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2FAlpomish%20Botir.%20Sibir%20xalq%20ertaklari.pdf?alt=media&token=bfb23b95-fe49-47b9-ad31-d3571ee48324")
            startActivity(intent)
        }
        binding.btn5.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2F30.Pushkin%20-%20Ertaklar.pdf?alt=media&token=7611f57c-7bb1-4625-a810-66c64a4a546a")
            startActivity(intent)
        }
        binding.btn6.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2F%40BOOKS_KITOB%20BESTSELLER%20ERTAKLAR.PDF?alt=media&token=a138b7c7-128c-427b-8578-20a4f260f2b9")
            startActivity(intent)
        }
        binding.btn7.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2F%40BOOKS_KITOB%20XITOY%20ERTAKLARI.PDF?alt=media&token=4d8ff517-c9e9-44bc-9a15-ade1beeb5f98")
            startActivity(intent)
        }
        binding.btn8.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2F%40Elektron_Kutubxona%20BESTSELLER%20ERTAKLAR.PDF?alt=media&token=521d04c6-d977-49a9-a7c7-aed67b249087")
            startActivity(intent)
        }
        binding.btn9.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2FAKA-UKA%20GRIM%20ERTAKLARI%20RUS%20UZB(1).pdf?alt=media&token=4c295a77-77d4-41dc-b235-a532f48980a6")
            startActivity(intent)
        }
        binding.btn10.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2FAKA-UKA%20GRIM%20ERTAKLARI%20RUS%20UZB.pdf?alt=media&token=66d2fb10-4e44-4a17-842d-507b61e950b3")
            startActivity(intent)
        }
        binding.btn11.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FErtaklar%2FAbdulla%20Qahhor.%20O'tmishdan%20ertaklar%20(qissa)%20(2).pdf?alt=media&token=824d6a93-dcaf-4630-a617-15aad7e1db10")
            startActivity(intent)
        }



    }
}
