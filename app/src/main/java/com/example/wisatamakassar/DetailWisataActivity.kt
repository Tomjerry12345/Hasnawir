package com.example.wisatamakassar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textview.MaterialTextView

class DetailWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)
        val mtvNama = findViewById<MaterialTextView>(R.id.mtv_nama)
        val mtvAlamat = findViewById<MaterialTextView>(R.id.mtv_alamat)
        val mtvHarga = findViewById<MaterialTextView>(R.id.mtv_harga)
        val mtvDeskripsi = findViewById<MaterialTextView>(R.id.mtv_deskripsi)
        val imgImage = findViewById<MaterialTextView>(R.id.img_wisata)

        val nama = intent.getStringExtra(NAMA)
        val alamat = intent.getStringExtra(ALAMAT)
        val harga = intent.getStringExtra(HARGA)
        val deskripsi = intent.getStringExtra(DESKRIPSI)
        val img = intent.getStringExtra(IMG)

        mtvNama.text = nama
        mtvAlamat.text = alamat
        mtvHarga.text = harga
        mtvDeskripsi.text = deskripsi
    }

    companion object {
        val NAMA = "nama"
        val DESKRIPSI = "deskripsi"
        val ALAMAT = "alamat"
        val HARGA = "harga"
        val IMG = "img"
    }
}