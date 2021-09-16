package com.example.tugas12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAccount: RecyclerView
    private var list: ArrayList<Account> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "My Profile"

        rvAccount = findViewById(R.id.rv_account)
        rvAccount.setHasFixedSize(true)

        list.addAll(AccountData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAccount.layoutManager = LinearLayoutManager(this)
        val listSocialAdapter = ListSocialAdapter(list)
        rvAccount.adapter = listSocialAdapter
    }
}