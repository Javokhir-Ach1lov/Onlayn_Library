package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityBolalarBinding

class BolalarActivity : AppCompatActivity() {

    lateinit var binding: ActivityBolalarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBolalarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2F0099-raqamli-yolgonchi-Anvar-Obidjon-1%20(1).pdf?alt=media&token=ae8d81af-51da-4f49-88ce-2fd7995add3d")
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2FAbdurahmon%20Akbar.%20G'aroyib%20avtobus%20(2).pdf?alt=media&token=1016ec8c-af0a-4b03-9cd6-6084fb316550")
            startActivity(intent)
        }

        binding.btn3.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2FAnvar%20Obidjon.%20Juda%20qiziq%20voqea.pdf?alt=media&token=adfd06f2-ba3f-4dd7-92a2-660bd30a5df4")
            startActivity(intent)
        }
        binding.btn4.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2FAnvar%20Obidjon.%20O'g'irlangan%20pahlavon.pdf?alt=media&token=a0c1582c-7db1-418a-870a-bd23db67dff8")
            startActivity(intent)
        }

        binding.btn5.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2FMalik%20Erkin%20Bolaligim%20ertaklari%201%20kitob%20.pdf?alt=media&token=1145a770-c182-403c-99c6-3b44847314f1")
            startActivity(intent)
        }

        binding.btn6.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2FPo'lat%20Mo'min.%20Bolajon-bolajonim.pdf?alt=media&token=9a78c447-e904-4c9d-9c4d-cafc95184f31")
            startActivity(intent)
        }
        binding.btn7.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2FQambar%20Ota.%20Toshpolvon%20va%20Ishpolvon%20haqida%20ertak%20(1).pdf?alt=media&token=697e06ed-a573-4cb9-9b02-6f470fe338e3")
            startActivity(intent)
        }

        binding.btn8.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2FXudoyberdi%20To'xtaboyev.%20Sehrli%20qalpoqcha%20(qissa).pdf?alt=media&token=41cdb93e-c5c9-460c-bc7a-f5a1fb3f3f53")
            startActivity(intent)
        }

        binding.btn9.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FBolalar%20adabiyoti%2FTursunboy-Adashboyev-Orzularim-qosh-qanotim-02%20(2).pdf?alt=media&token=3a295d05-7161-4ea3-9b35-1583b6313d54")
            startActivity(intent)
        }
        binding.btn10.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java)
            intent.putExtra("pdfUrl", "")
            startActivity(intent)
        }
    }
}
