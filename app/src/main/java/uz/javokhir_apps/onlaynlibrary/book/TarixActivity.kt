package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityTarixBinding

class TarixActivity : AppCompatActivity() {

    lateinit var binding: ActivityTarixBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTarixBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F5-sinf%20Tarixdan%20hikoyalar%20(%40tarix).pdf?alt=media&token=7fd47be6-036f-4815-aa17-d22aa9eeb611")
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F6-sinf%20tarix%20darsligi%20(%40tarix).pdf?alt=media&token=6e86a380-dbd6-49c5-b135-c6dbf16c1395")
            startActivity(intent)
        }

        binding.btn3.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F7-sinf%20Jahon%20tarixi%20(%40tarix).pdf?alt=media&token=6c58c6d6-2309-44ee-b73c-bcfdcb0ef95c")
            startActivity(intent)
        }
        binding.btn4.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2FO%20zbekiston%20tarixi%207(%40Kitob_ulashaman_bot).pdf?alt=media&token=1ff77fd9-e90c-403a-a187-67213268d978")
            startActivity(intent)
        }

        binding.btn5.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F8-sinf%20Jahon%20tarixi%202019%20(%40tarix).pdf?alt=media&token=86345e73-77c0-4198-853f-99ffd4b833f5")
            startActivity(intent)
        }

        binding.btn6.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F8-sinf%20Ozbekiston%20tarixi%202019%20(%40tarix).pdf?alt=media&token=4d1a321d-0d7b-41ec-8b94-775374a66dd5")
            startActivity(intent)
        }
        binding.btn7.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F9-sinf%20Jahon%20tarixi%202019%20(%40tarix).pdf?alt=media&token=631d18ec-8062-483a-b9dd-395bae01c567")
            startActivity(intent)
        }

        binding.btn8.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F9-sinf%20Ozbekiston%20tarixi%202019%20(%40tarix).pdf?alt=media&token=fa086d38-dd4a-4a51-a78a-864c5b1dd87f")
            startActivity(intent)
        }

        binding.btn9.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F10-sinf%20Jahon%20tarixi%20(%40tarix).pdf?alt=media&token=dfe88138-6ba7-4ad8-a401-a5092037b42e")
            startActivity(intent)
        }
        binding.btn10.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F10-sinf%20Ozbekiston%20tarixi%20(%40tarix).pdf?alt=media&token=5f629289-ba8d-4c98-b5f0-cdaa69c99c65")
            startActivity(intent)
        }
        binding.btn11.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F11-sinf%20Ozbekiston%20tarixi%20(%40tarix).pdf?alt=media&token=5d7d4a0d-85aa-4dc8-b96b-1d9fad512a96")
            startActivity(intent)
        }
        binding.btn12.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F11-sinf%20Jahon%20tarixi%20(%40tarix).pdf?alt=media&token=ce8ef730-c197-43cf-b72a-50aa6d072c5a")
            startActivity(intent)
        }
    }
}