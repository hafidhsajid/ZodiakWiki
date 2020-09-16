package com.wiki.zodiac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionbar = supportActionBar

        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val nama: String? = intent.getStringExtra("nama")
        Title.text = nama
        val date: String? = intent.getStringExtra("date")
        Date.text = date
        val detail: String? = intent.getStringExtra("detail")
        Detail.text = detail
        val sebutan: String? = intent.getStringExtra("sebutan")
        Sebutan.text = sebutan
        val image: Int = intent.getIntExtra("image", -1)
        gambar.setImageResource(image)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

