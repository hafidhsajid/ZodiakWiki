package com.wiki.zodiac

object ZodiacData {
    private val zodiacName = arrayListOf(
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
    private val zodiacDate = arrayListOf(
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
    private val zodiacSebutan = arrayListOf(
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
    private val zodiacDetail = arrayListOf(
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

    val listData: ArrayList<Zodiac>
        get() {
            val list = arrayListOf<Zodiac>()
            for (position in zodiacName.indices) {
                val zodiac = Zodiac()
                zodiac.name = zodiacName[position]
                zodiac.detail = zodiacDetail[position]
                zodiac.date = zodiacDate[position]
                zodiac.sebutan = zodiacSebutan[position]
                zodiac.photo = zodiacImage[position]
                list.add(zodiac)
            }
            return list
        }
}