package uz.javokhir_apps.onlaynlibrary.book

import android.os.AsyncTask
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import uz.javokhir_apps.onlaynlibrary.R
import java.io.BufferedInputStream
import java.io.IOException
import java.io.InputStream
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class BooksActivity : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    private lateinit var pdfurl: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        pdfView = findViewById(R.id.idPDFView)
        pdfurl = intent.getStringExtra("pdfUrl") ?: ""

        RetrievePDFfromUrl().execute(pdfurl)
    }

    inner class RetrievePDFfromUrl : AsyncTask<String, Void, InputStream>() {
        override fun doInBackground(vararg strings: String): InputStream? {
            var inputStream: InputStream? = null
            try {
                val url = URL(strings[0])

                val urlConnection = url.openConnection() as HttpsURLConnection
                if (urlConnection.responseCode == 200) {
                    inputStream = BufferedInputStream(urlConnection.inputStream)
                }
            } catch (e: IOException) {
                e.printStackTrace()
                return null
            }
            return inputStream
        }

        override fun onPostExecute(inputStream: InputStream) {
            pdfView.fromStream(inputStream).load()
        }
    }
}