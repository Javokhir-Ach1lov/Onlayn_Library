package uz.javokhir_apps.onlaynlibrary

import android.content.ClipData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.widget.Toast

class QuotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_quotes, container, false)

        view.findViewById<View>(R.id.share).setOnClickListener {
            val subject = "Share Subject"
            val body = "Your text here"
            shareText(requireContext(), subject, body)
        }

        // Copy text when Copy button is clicked
        return view
    }

    private fun shareText(context: Context, subject: String, body: String) {
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.type = "text/plain"
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        sharingIntent.putExtra(Intent.EXTRA_TEXT, body)
        context.startActivity(Intent.createChooser(sharingIntent, "Share using"))
    }

}
