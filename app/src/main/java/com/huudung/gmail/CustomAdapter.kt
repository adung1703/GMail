package com.huudung.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val items : ArrayList<ItemModel>) : BaseAdapter() {
    override fun getCount(): Int = items.size

    override fun getItem(p0: Int): Any = items[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val row: View = LayoutInflater.from(p2?.context).inflate(R.layout.custom_adapter, p2, false)

        val avatarView = row.findViewById<ImageView>(R.id.avatar)
        val titleView = row.findViewById<TextView>(R.id.title)
        val contentView = row.findViewById<TextView>(R.id.content)
        val timeView = row.findViewById<TextView>(R.id.time)

        avatarView.setImageResource(items[p0].avatar)
        titleView.text = items[p0].title
        contentView.text = items[p0].content
        timeView.text = items[p0].time

        return row
    }

}