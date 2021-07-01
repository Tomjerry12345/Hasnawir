package com.example.wisatamakassar

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.wisatamakassar.DetailWisataActivity.Companion.ALAMAT
import com.example.wisatamakassar.DetailWisataActivity.Companion.DESKRIPSI
import com.example.wisatamakassar.DetailWisataActivity.Companion.HARGA
import com.example.wisatamakassar.DetailWisataActivity.Companion.IMG
import com.example.wisatamakassar.DetailWisataActivity.Companion.NAMA
import com.google.android.material.textview.MaterialTextView

class WisataAdapter(
    private val wisata: List<Wisata>,
    private val activity: AppCompatActivity
) : RecyclerView.Adapter<WisataHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): WisataHolder {
        return WisataHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_wisata, viewGroup, false))
    }

    override fun getItemCount(): Int = wisata.size

    override fun onBindViewHolder(holder: WisataHolder, position: Int) {
        holder.bindWIsata(wisata[position])
        val wisata: Wisata = wisata[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(activity, DetailWisataActivity::class.java)
            intent.putExtra(NAMA, wisata.nama)
            intent.putExtra(ALAMAT, wisata.alamat)
            intent.putExtra(HARGA, wisata.harga)
            intent.putExtra(DESKRIPSI, wisata.deskripsi)
            intent.putExtra(IMG, wisata.img)
            activity.startActivity(intent)
        }
    }
}

class WisataHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val mtvNama = view.findViewById<MaterialTextView>(R.id.txt_nama)
    private val mtvHarga = view.findViewById<MaterialTextView>(R.id.txt_harga)
    private val mtvAlamat = view.findViewById<MaterialTextView>(R.id.txt_alamat)

    fun bindWIsata(wisata: Wisata) {
        mtvNama.text = wisata.nama
        mtvHarga.text = wisata.harga
        mtvAlamat.text = wisata.alamat
    }
}