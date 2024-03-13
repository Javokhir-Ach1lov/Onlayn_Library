package uz.javokhir_apps.onlaynlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView=findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem->
            when(menuItem.itemId){
                R.id.audio-> {
                    replaceFragment(Audio_book())
                    true
                }
                R.id.video->{
                    replaceFragment(video_book())
                    true
                }
                R.id.book->{
                    replaceFragment(Kitob())
                    true
                }
                R.id.profil->{
                    replaceFragment(Profil_book())
                    true
                }
                R.id.quotes->{
                    replaceFragment(QuotesFragment())
                    true
                }
                else->false
            }
        }
        replaceFragment(Audio_book())

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()
    }
}