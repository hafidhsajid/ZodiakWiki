package com.wiki.zodiac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    private val zodiacName = arrayOf(
        "Capricon",
        "Aquarius",
        "Pisces",
        "Aries",
        "Taurus",
        "Gemini",
        "Cancer",
        "Leo",
        "Virgo",
        "Libra",
        "Scorpio",
        "Sagitarius"
    )

    private val zodiacDate = arrayOf(
        "22 December - 19 January",
        "20 January - 18 February",
        "19 February - 20 March",
        "21 March - 19 April",
        "20 April - 20 May",
        "21 May - 20 June",
        "21 June - 22 July",
        "23 July - 22 August",
        "23 August - 22 September",
        "23 September - 22 October",
        "23 October - 21 November",
        "22 November - 21 December"
    )
    private val zodiacSebutan = arrayOf(
        "The Goat ",
        "The Water Bearer",
        "The Fishes",
        "The Ram",
        "The bull",
        "The Twins",
        "The Crab",
        "The Lion",
        "The Virgin",
        "The Scales",
        "The Scorpion",
        "The Archer"
    )
    private val zodiacDetail = arrayOf(
        "22 December - 19 January",
        "20 January - 18 February",
        "19 February - 20 March",
        "21 March - 19 April",
        "20 April - 20 May",
        "21 May - 20 June",
        "21 June - 22 July",
        "23 July - 22 August",
        "23 August - 22 September",
        "23 September - 22 October",
        "23 October - 21 November",
        "22 November - 21 December"
    )
    private val zodiacImage = intArrayOf(
        R.drawable.satu,
        R.drawable.dua,
        R.drawable.tiga,
        R.drawable.empat,
        R.drawable.lima,
        R.drawable.enam,
        R.drawable.tujuh,
        R.drawable.delapan,
        R.drawable.sembilan,
        R.drawable.sepuluh,
        R.drawable.sebelas,
        R.drawable.duabelas
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.layout.main_activity, MainFragment.newInstance())
//                .commitNow()
//        }
        listView.adapter =
            myAdapter(zodiacName, zodiacDate, zodiacSebutan, zodiacDetail, zodiacImage)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == R.id.btnSaya) {
            val new = Intent(this@MainActivity, About::class.java)
            startActivity(new)
        }
        return super.onOptionsItemSelected(item)
    }


}

