package com.wiki.zodiac

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import kotlinx.android.synthetic.main.row_listview.view.*

class myAdapter(
    val title: Array<String>,
    val date: Array<String>,
    val sebutan: Array<String>,
    val detail: Array<String>,
    val image: IntArray
) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = LayoutInflater.from(parent?.context)
            .inflate(R.layout.row_listview, parent, false)

        view.Title.text = title.get(position)
        view.Date.text = date.get(position)
        view.image.setImageResource(image.get(position))
//        val imageView:ImageView = view.findViewById(image.get(position))
//        view.Sebutan.text = sebutan.get(position)
//        view.Detail.text = detail.get(position)


        return view
    }

    override fun getItem(position: Int): Any = 0

    override fun getItemId(position: Int): Long = 0

    override fun getCount(): Int = title.size
}