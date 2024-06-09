package uz.javokhir_apps.onlaynlibrary.book

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.util.Log
import classlar.ChildItem
import classlar.CustomExpandableListAdapter
import classlar.GroupItem
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.databinding.ActivityErtaklar2Binding

class ErtaklarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityErtaklar2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityErtaklar2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val groupList = mutableListOf<GroupItem>()

        val group1Children = mutableListOf(
            ChildItem(R.drawable.ertaklarlogo, "Alpomish Botir", "Sibir xalq ertaklari", "https://firebasestorage.googleapis.com/v0/b/onlayn-library-a8bf4.appspot.com/o/book%2FTarix%20adabiyotlar%2F5-sinf%20Tarixdan%20hikoyalar%20(%40tarix).pdf?alt=media&token=7fd47be6-036f-4815-aa17-d22aa9eeb611"),
            ChildItem(R.drawable.ertaklarlogo, "Ming bir kecha", "Arab halq ertaklari", "https://example.com/link2"),
            ChildItem(R.drawable.ertaklarlogo, "Oltin Bola", "Gans Xristian Andersen", "https://example.com/link3")
        )
        groupList.add(GroupItem("Group 1", group1Children))

        val group2Children = mutableListOf(
            ChildItem(R.drawable.ertaklarlogo, "Eshitmadim demanglar", "Rauf Tolib", "https://example.com/link4"),
            ChildItem(R.drawable.ertaklarlogo, "Muqaddas xazina", "Ertaklar to'plami", "https://example.com/link5"),
            ChildItem(R.drawable.ertaklarlogo, "O'tmishdan ertaklar(1)", "Abdulla Qahhor", "https://example.com/link6")
        )
        groupList.add(GroupItem("Group 2", group2Children))

        val group3Children = mutableListOf(
            ChildItem(R.drawable.ertaklarlogo, "O'tmishdan ertaklar(2)", "Abdulla Qahhor", "https://example.com/link7"),
            ChildItem(R.drawable.ertaklarlogo, "Ertaklar", "Pushkin", "https://example.com/link8"),
            ChildItem(R.drawable.ertaklarlogo, "Ertaklar", "Aka Ukan Grimlar", "https://example.com/link9")
        )
        groupList.add(GroupItem("Group 3", group3Children))

        val group4Children = mutableListOf(
            ChildItem(R.drawable.ertaklarlogo, "Xitoy xalq ertaklari", "Xitoy xalq ertaklari", "https://example.com/link10"),
            ChildItem(R.drawable.ertaklarlogo, "Rus xalq ertaklari", "Rus xalq ertaklari", "https://example.com/link11")
        )
        groupList.add(GroupItem("Group 4", group4Children))

        val group5Children = mutableListOf(
            ChildItem(R.drawable.ertaklarlogo, "Arab xalq ertaklari", "Arab xalq ertaklari", "https://example.com/link12"),
            ChildItem(R.drawable.ertaklarlogo, "Fransuz xalq ertaklari", "Fransuz xalq ertaklari", "https://example.com/link13"),
            ChildItem(R.drawable.ertaklarlogo, "Nemis xalq ertaklari", "Nemis xalq ertaklari", "https://example.com/link14")
        )
        groupList.add(GroupItem("Group 5", group5Children))

        val adapter = CustomExpandableListAdapter(this, groupList, ::openPdfFromUrl)
        binding.expandableListView.setAdapter(adapter)
    }

    private fun openPdfFromUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(Uri.parse(url), "application/pdf")
        intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY
        try {
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "No PDF viewer found", Toast.LENGTH_SHORT).show()
            Log.e("ErtaklarActivity", "PDF viewer not found", e)
        }
    }
}
