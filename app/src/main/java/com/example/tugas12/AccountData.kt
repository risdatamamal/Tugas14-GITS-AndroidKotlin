package com.example.tugas12

object AccountData {
    private val socialNames = arrayOf(
        "Github",
        "Address",
        "Email",
        "LinkedIn",
        "Instagram",
        "Steam")

    private val socialIcons = intArrayOf(
        R.drawable.github,
        R.drawable.geo,
        R.drawable.mail,
        R.drawable.linkedin,
        R.drawable.instagram,
        R.drawable.steam,
    )

    val listData: ArrayList<Account>
        get() {
            val list = arrayListOf<Account>()
            for (position in socialNames.indices) {
               val account = Account()
               account.name = socialNames[position]
               account.icon = socialIcons[position]
                list.add(account)
            }
            return list
        }
}