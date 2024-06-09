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
        val originalItems = ArrayList<String>()
        originalItems.add("Hayotning har bir lahzasi – bu o‘limga yaqinlashish.\n- Isajon Sulton, \"Uchrashuvlar\"")
        originalItems.add("Har bir insonning o‘z yulduzi bor va u yulduz unga yo‘l ko‘rsatib turadi.\n- Pirimqul Qodirov, \"Yulduzli tunlar\"")
        originalItems.add("Inson umrining har bir lahzasi qadrli, har bir dami bebaho.\n- O’tkir Hoshimov, \"Hazon rezgi\"")
        originalItems.add("Dunyo bir chelak suvga o‘xshaydi, bir kuni uni to‘kib tashlash kerak bo‘ladi.\n- Abdulla Qahhor, \"Qaytar dunyo\"")
        originalItems.add("Inson qalbi oyna kabidir, uni har qanday so‘z yorib yuborishi mumkin.\n- Abdulla Qodiriy, \"O‘tkan kunlar\"")
        originalItems.add("Qalbning eng chuqur burchaklarida yashiringan tuyg‘ular hech qachon yo‘qolmaydi.\n- Cho‘lpon, \"Kecha va kunduz\"")
        originalItems.add("Tafakkur – insonni yuksaltiruvchi va kamolotga yetaklovchi kuchdir.\n- Erkin Vohidov, \"Tafakkur\"")
        originalItems.add("Har bir kishi o‘z dunyosini o‘zi yaratadi va unda yashaydi.\n- Erkin A’zam, \"Ko‘hna dunyo\"")
        originalItems.add("Ko‘zlar yomon niyatni yashira olmaydi, ular qalbning oynasi.\n- Tohir Malik, \"Qora ko‘zlar\"")
        originalItems.add("Insonni mag‘lub qilish mumkin, lekin uni yengib bo‘lmaydi.\n- Ernest Xeminguey, \"Chol va dengiz\"")
        originalItems.add("Agar biror narsani chin dildan xohlasangiz, butun koinot sizga yordam beradi.\n- Paulo Koelo, \"Alkimyochi\"")
        originalItems.add("Har bir inson o‘z yo‘lini tanlaydi, va bu yo‘l uning taqdiridir.\n- Muzaffar Akhmedov, \"G‘arbiy yo‘ldosh\"")
        originalItems.add("Azob-uqubatlar katta aql va chuqur yurak uchun doim muqarrar.\n- Fyodor Dostoevskiy, \"Jinoyat va jazo\"")
        originalItems.add("Suv yoqalab yurgan odam doimo hayotni anglab turadi.\n- Said Ahmad, \"Suv yoqalab\"")
        originalItems.add("Insoniylik va vatanparvarlik – bu bizning eng katta boyligimiz.\n- Islom Karimov, \"Mahalliy qahramon\"")
        originalItems.add("Har bir avlod o‘zidan keyingi avlod uchun mas’ul.\n- Ivan Turgenev, \"Otalar va bolalar\"")
        originalItems.add("Sharqning yulduzlari doimo yorqin va yo‘l ko‘rsatib turadi.\n- Mirtemir, \"Sharqiy yulduzlar\"")
        originalItems.add("Haqiqiy aqlli inson har doim oddiy narsalarda ajoyiblikni topadi.\n- Arthur Conan Doyle, \"Aqlli inson\"")
        originalItems.add("Har bir avlod o‘z ajdodlarining donoligini davom ettirishi kerak.\n- Oybek, \"Ajdodlar so‘zi\"")
        originalItems.add("Ona – bu hayotning boshlanishi va oxiri, uning muhabbati abadiy.\n- Maksim Gorkiy, \"Ona\"")
        originalItems.add("Baxmal yashayotgan joyni ham, yashamagan joyni ham go‘zal qiladi.\n- Abdulla Oripov, \"Hayot guliston bo‘lsa\"")
        originalItems.add("Insonni ko‘taradigan, yuragini keng qiladigan faqat bir narsa bor, u ham bo‘lsa, muhabbat.\n- Mirzo Kenjabek, \"Muhabbat shajarasi\"")
        originalItems.add("Chin do‘st – sening kamchiliklaringni ko‘ra oladigan va ulardan oshib tusha oladigan insondir.\n- Abdulla Oripov, \"Sog‘inch\"")
        originalItems.add("Odamning baxti – o‘zining kimligini bilishidadir.\n- Tog‘ay Murod, \"Ot kishnagan oqshom\"")
        originalItems.add("Haqiqiy shodlik, haqiqiy g‘urur – qalbingni pok saqlashdadir.\n- Muhammad Yusuf, \"Suyunchi\"")
        originalItems.add("Sadoqatli do‘stlik – inson hayotidagi eng katta boyliklardan biridir.\n- Asqad Muxtor, \"Chin do‘stlar\"")
        originalItems.add("Oqibatli ish har doim o‘ziga oqibat keltiradi.\n- Erkin Vohidov, \"Yaxshi niyat\"")
        originalItems.add("Insonning qiymati – uning intilishida va o‘z orzulariga sodiq qolishidadir.\n- Shukur Xolmirzayev, \"Intilish\"")
        originalItems.add("Har bir inson o‘z baxtining yaratuvchisi.\n- Odil Yoqubov, \"Baxt\"")
        originalItems.add("Hayotning eng katta sinovi – o‘zligingni yo‘qotmaslikdir.\n- Said Ahmad, \"Sinov\"")
        originalItems.add("Muhabbat – insonni yuqori cho‘qqilarga olib chiqadigan kuch.\n- Mirtemir, \"Muhabbat haqida qo‘shiq\"")
        originalItems.add("Har qanday qiyinchiliklarni yengish uchun kuchni o‘z ichingizdan toping.\n- Hamid Olimjon, \"Qiyinchilik\"")
        originalItems.add("Insonning yuksakligi – uning maqsadlarida va shu maqsadlar uchun kurashishidadir.\n- Usmon Nosir, \"Maqsad\"")
        originalItems.add("Yaxshi niyat – har qanday ishning boshlanishi va muvaffaqiyat kalitidir.\n- Abdulla Qodiriy, \"Yaxshi niyat\"")
        originalItems.add("Orzu – insonni oldinga yetaklaydigan kuch.\n- Cho‘lpon, \"Orzu\"")
        originalItems.add("Mehnat – insonni ulug‘laydigan eng muhim fazilatdir.\n- Oybek, \"Mehnat\"")
        originalItems.add("Har bir kishi o‘z hayotining me’mori.\n- Erkin Vohidov, \"Hayot\"")
        originalItems.add("Do‘stlik – insonning eng yuksak boyligidir.\n- Shukur Xolmirzayev, \"Do‘stlik\"")
        originalItems.add("Ishonch – har qanday muvaffaqiyatning asosi.\n- Muhammad Yusuf, \"Ishonch\"")
        originalItems.add("Yoshlik – insonning eng chiroyli davri.\n- Hamid Olimjon, \"Yoshlik\"")
        originalItems.add("Buyuk ishlarni amalga oshirishning yagona yo‘li – bu qilayotgan ishingizni sevishdir.\n- Stiv Jobs")
        originalItems.add("Oxir-oqibat, biz faqat qilinmagan imkoniyatlardan afsuslanamiz.\n- Lyuis Kerroll")
        originalItems.add("Ishonch bilan harakat qilsangiz, yarim yo‘lda yurgansiz.\n- Teodor Ruzvelt")
        originalItems.add("Kelajakni bashorat qilishning eng yaxshi usuli – uni yaratishdir.\n- Avraam Linkoln")
        originalItems.add("Muvaffaqiyat yakuniy emas, muvaffaqiyatsizlik halokatli emas: Muhim narsa davom ettirishga jur’at qilishdir.\n- Uinston Cherchill")
        originalItems.add("Ertangi kunimizning amalga oshishiga yagona to‘siq – bugungi shubhalarimizdir.\n- Franklin D. Ruzvelt")
        originalItems.add("Qilmagan urinishlaringizning 100 foizini o‘tkazib yuborasiz.\n- Ueyn Gretzki")
        originalItems.add("Kelajak ularning go‘zalligiga ishonadiganlarga tegishlidir.\n- Eleonora Ruzvelt")
        originalItems.add("Sevgi qanchalik asta-sekin yurishingiz muhim emas, faqat to‘xtamaslik muhim.\n- Konfutsiy")
        originalItems.add("Hayot bizga sodir bo‘lgan voqealarning 10 foizi va bizning bunga qanday munosabatimizdan 90 foiz iborat.\n- Charlz R. Svindoll")
        originalItems.add("Buyuk ishlarni amalga oshirishning yagona yo‘li – bu qilayotgan ishingizni sevishdir.\n- Stiv Jobs")
        originalItems.add("Kelajak ularning go‘zalligiga ishonadiganlarga tegishlidir.\n- Eleonora Ruzvelt")
        originalItems.add("Kelajakni bashorat qilishning eng yaxshi usuli – uni ixtiro qilishdir.\n- Alan Key")
        originalItems.add("Muvaffaqiyat yo‘li va muvaffaqiyatsizlik yo‘li deyarli bir xil.\n- Kolin R. Devis")
        originalItems.add("Ertangi kunimizning amalga oshishiga yagona to‘siq – bugungi shubhalarimizdir.\n- Franklin D. Ruzvelt")
        originalItems.add("Qilmagan urinishlaringizning 100 foizini o‘tkazib yuborasiz.\n- Ueyn Gretzki")
        originalItems.add("Ishonch bilan harakat qilsangiz, yarim yo‘lda yurgansiz.\n- Teodor Ruzvelt")
        originalItems.add("Daraxt ekishning eng yaxshi vaqti 20 yil oldin edi. Ikkinchi eng yaxshi vaqt – hozir.\n- Xitoy maqoli")
        originalItems.add("Soatni kuzatib o‘tirmang; u nima qilsa, siz ham shuni qiling. Davom eting.\n- Sem Levenson")
        originalItems.add("Hayotingizdagi eng muhim ikki kun – tug‘ilgan kuningiz va nima uchun tug‘ilganingizni bilgan kuningiz.\n- Mark Tven")
        originalItems.add("Muvaffaqiyat baxtning kaliti emas. Baxt muvaffaqiyatning kaliti. Agar qilayotgan ishingizni sevsangiz, muvaffaqiyatli bo‘lasiz.\n- Albert Shveytsar")
        originalItems.add("Hech narsa imkonsiz emas, so‘zning o‘zi 'Men imkoniyatliman' deydi!\n- Odri Xepbern")
        originalItems.add("Vaqtingiz cheklangan, shuning uchun boshqa birovning hayotini yashab vaqtni bekor qilmang.\n- Stiv Jobs")
        originalItems.add("Muhimi, yiqilish yoki yiqilmaslik emas, balki qayta turishingizdir.\n- Vins Lombardi")
        originalItems.add("O‘zingizni ko‘tarishni istasangiz, boshqalarni ko‘taring.\n- Buker T. Vashington")
        originalItems.add("Agar orzu qilsangiz, uni amalga oshira olasiz.\n- Uolt Disney")
        originalItems.add("Eng yaxshi qasos bu ulkan muvaffaqiyatdir.\n- Frenk Sinatra")
        originalItems.add("O‘zingiz ko‘rishni xohlagan o‘zgarish bo‘ling.\n- Mahatma Gandi")
        originalItems.add("Izidan yuring, yo‘l qidirib, iz qoldiring.\n- Ralf Uoldo Emerson")
        originalItems.add("Maqsadingizga erishish orqali nima olishingiz muhim emas, nima bo‘lishingiz muhim.\n- Zig Ziglar")
        originalItems.add("Imkonsizga erishishning yagona yo‘li uning mumkinligiga ishonishdir.\n- Charlz Kingsley")
        originalItems.add("Yuzingizni doimo quyoshga qarating – va soyalar orqangizda qoladi.\n- Uolt Uitman")
        originalItems.add("Hech qachon yangi maqsad qo‘yish yoki yangi orzu qilish uchun qari emassiz.\n- K.S. Lyuis")
        originalItems.add("Qiyinchiliklar o‘rtasida imkoniyatlar yashaydi.\n- Albert Eynshteyn")
        originalItems.add("Kelajak ularning go‘zalligiga ishonadiganlarga tegishlidir.\n- Eleonora Ruzvelt")
        originalItems.add("Sevgi qanchalik asta-sekin yurishingiz muhim emas, faqat to‘xtamaslik muhim.\n- Konfutsiy")
        originalItems.add("Hech narsa imkonsizdek ko‘rinadi, bu amalga oshguncha.\n- Nelson Mandela")
        originalItems.add("Ishonch bilan harakat qilsangiz, yarim yo‘lda yurgansiz.\n- Teodor Ruzvelt")
        originalItems.add("Buyuk ishlarni amalga oshirishning yagona yo‘li – bu qilayotgan ishingizni sevishdir.\n- Stiv Jobs")
        originalItems.add("Muvaffaqiyat yakuniy emas, muvaffaqiyatsizlik halokatli emas: Muhim narsa davom ettirishga jur’at qilishdir.\n- Uinston Cherchill")
        originalItems.add("Kelajakni bashorat qilishning eng yaxshi usuli – uni yaratishdir.\n- Avraam Linkoln")
        originalItems.add("Qilmagan urinishlaringizning 100 foizini o‘tkazib yuborasiz.\n- Ueyn Gretzki")
        originalItems.add("Kelajak ularning go‘zalligiga ishonadiganlarga tegishlidir.\n- Eleonora Ruzvelt")
        originalItems.add("Sevgi qanchalik asta-sekin yurishingiz muhim emas, faqat to‘xtamaslik muhim.\n- Konfutsiy")
        originalItems.add("Hayot bizga sodir bo‘lgan voqealarning 10 foizi va bizning bunga qanday munosabatimizdan 90 foiz iborat.\n- Charlz R. Svindoll")
        originalItems.add("Buyuk ishlarni amalga oshirishning yagona yo‘li – bu qilayotgan ishingizni sevishdir.\n- Stiv Jobs")
        originalItems.add("Kelajak ularning go‘zalligiga ishonadiganlarga tegishlidir.\n- Eleonora Ruzvelt")

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
                (uz.javokhir_apps.onlaynlibrary.R.color.white))
        // Qatlar orasidagi farqni kattalashtirish
        listView.dividerHeight = 10
        // ListView ni ichki joylarini o'zgartirish
        listView.setPadding(20, 20, 20, 20)
        return view
    }
}
