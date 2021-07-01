package com.example.wisatamakassar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_wisata)

        val rvWisata = findViewById<RecyclerView>(R.id.rv_wisata)

        val listWisata = listOf(
            Wisata(
                "Trans Tudio makassar",
                "Rp.150.000",
                "Wisata ini cocok untuk Anda kunjungi bersama keluarga Anda terutama dengan anak Anda. Mengingat selain merupakan tempat bermain tempat ini juga menjadi sarana belajar bagi anak Anda. Bermain dan belajar tentunya sangat baik untuk perkembangan anak Anda.",
                "Jl. Metro Tj. Bunga, Maccini Sombala, Tamalate, Kota Makassar, Sulawesi Selatan.",
                ""),
            Wisata(
                "Trans Tudio makassar",
                "Rp.150.000",
                "Wisata ini cocok untuk Anda kunjungi bersama keluarga Anda terutama dengan anak Anda. Mengingat selain merupakan tempat bermain tempat ini juga menjadi sarana belajar bagi anak Anda. Bermain dan belajar tentunya sangat baik untuk perkembangan anak Anda.",
                "Jl. Metro Tj. Bunga, Maccini Sombala, Tamalate, Kota Makassar, Sulawesi Selatan.",
                ""),
            Wisata(
                "Trans Tudio makassar",
                "Rp.150.000",
                "Wisata ini cocok untuk Anda kunjungi bersama keluarga Anda terutama dengan anak Anda. Mengingat selain merupakan tempat bermain tempat ini juga menjadi sarana belajar bagi anak Anda. Bermain dan belajar tentunya sangat baik untuk perkembangan anak Anda.",
                "Jl. Metro Tj. Bunga, Maccini Sombala, Tamalate, Kota Makassar, Sulawesi Selatan.",
                "")
        )

        Log.println(Log.ASSERT, "wisata", "${listWisata.size}")

        val wisataAdapter = WisataAdapter(listWisata, this)

        rvWisata.apply {
            layoutManager = LinearLayoutManager(this@ListWisataActivity)
            adapter = wisataAdapter
        }
    }
}