package com.example.tugas12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val tvName = findViewById<TextView>(R.id.tv_item_name)
        val nama = intent.getStringExtra(EXTRA_NAME)
        tvName.text = nama

        val tvDetail = findViewById<TextView>(R.id.tv_item_detail)
        val deksripsi = intent.getStringExtra(EXTRA_DESKRIPSI)
        tvDetail.text = deksripsi

        val imgPhoto = findViewById<ImageView>(R.id.img_item_photo)
        val logo = intent.getIntExtra(EXTRA_PHOTO, 1)
        imgPhoto.setImageResource(logo)

        supportActionBar!!.title = nama
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESKRIPSI = "extra_deskripsi"
        const val EXTRA_PHOTO = "extra_photo"
    }
}