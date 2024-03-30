package uz.javokhir_apps.onlaynlibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView

class QuotesFragment : Fragment() {

    private lateinit var listView: ListView
    private lateinit var searchView: SearchView
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var originalItems: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_quotes, container, false)
        listView = view.findViewById<ListView>(R.id.listView)
        searchView = view.findViewById<SearchView>(R.id.searchView)

        // So'zlar ro'yxati
        originalItems = ArrayList()
        originalItems.add("Hayot sizga necha qiyinchilik yetkazsa-da, uning erishilgan natijasi uchun qandayda ishlashingizni tanlashingiz muhimdir.\n- Nelson Mandela")
        originalItems.add("Ishonch — o'zgarishlar uchun kerakli bo'lgan narsa.\n- Barak Obama")
        originalItems.add("Biror narsa ish qilishga yo'naltirilganligingizda, siz uning natijasini olishingizni istaysiz.\n- Maya Angelou")
        originalItems.add("Hamma narsa imkoniyatni topish uchun paydo bo'lgan.\n- Thomas A. Edison")
        originalItems.add("Muomala qilayotgan insonlar qiyinchiliklar orqali kimdir yuqoriga ko'tarishadi.\n- Bruce Lee")
        originalItems.add("Qo'lga ega bo'lish haqiqiy muvaffaqiyatning boshlang'ichi.\n- Winston Churchill")
        originalItems.add("Yoshlar uchun muvaffaqiyat — uning birinchi mukofotasi; sabrli va kuchli bo'lish — o'rtaligi.\n- George Washington")
        originalItems.add("Sizga kerak bo'lgan kuchni izlash va uning ustiga ishlashga to'g'ri kelishingiz kerak.\n- Ralph Waldo Emerson")
        originalItems.add("Har kuni bir oz ushbu kuni bo'lishi kerak.\n- Abraham Lincoln")
        originalItems.add("To'g'ri yo'l — odatda qiyinchilik va tizim bilan belgilanadi, ammo u xavfsizdir va eng ko'p foydali natijalarga olib keladi.\n- Napoleon Hill")

        // ArrayAdapter ni yaratish va ListView ga bog'lash
        adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, originalItems)
        listView.adapter = adapter

        // Qidiruvni o'zgartirish
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        })

        // ListView chiroyliroq qilish
        listView.setBackgroundColor(resources.getColor
        // Fon rangi o'zgartirish
                (com.bumptech.glide.R.color.abc_background_cache_hint_selector_material_dark))
        // Qatlar orasidagi farqni kattalashtirish
        listView.dividerHeight = 10
        // ListView ni ichki joylarini o'zgartirish
        listView.setPadding(20, 20, 20, 20)
        return view
    }
}
