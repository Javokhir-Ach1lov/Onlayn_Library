package uz.javokhir_apps.onlaynlibrary

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.barteksc.pdfviewer.PDFView

class MainActivity2 : AppCompatActivity() {

    lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        pdfView=findViewById(R.id.pdfview)

        pdfView.fromAsset("O'tgan kunlar.pdf").load()
    }
}