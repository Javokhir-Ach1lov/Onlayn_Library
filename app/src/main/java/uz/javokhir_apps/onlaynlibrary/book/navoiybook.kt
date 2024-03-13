package uz.javokhir_apps.onlaynlibrary.book

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import uz.javokhir_apps.onlaynlibrary.R

class navoiybook : AppCompatActivity() {

    lateinit var  pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        pdfView=findViewById(R.id.pdfview1)

        pdfView.fromAsset("Navoiy.pdf").load()
    }
}