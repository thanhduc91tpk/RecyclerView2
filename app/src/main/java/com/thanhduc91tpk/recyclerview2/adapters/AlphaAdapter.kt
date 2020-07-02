package com.thanhduc91tpk.recyclerview2.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.thanhduc91tpk.recyclerview2.DetailActivity
import com.thanhduc91tpk.recyclerview2.R
import com.thanhduc91tpk.recyclerview2.model.AlphaChar
import kotlinx.android.synthetic.main.grid_layout_item.view.*

class AlphaAdapter(var context : Context ,var arraylist: ArrayList<AlphaChar>) : RecyclerView.Adapter<AlphaAdapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_layout_item,parent,false)
        return ItemHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return  arraylist.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val charItem : AlphaChar = arraylist.get(position)

        holder.icons.setImageResource(charItem.icons!!)
        holder.titles.text = charItem.alpha

        holder.itemView.setOnClickListener {
            val itent = Intent(context,DetailActivity::class.java)
            itent.putExtra(DetailActivity.key,charItem)
            context.startActivity(itent)
        }

    }

    class ItemHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var icons = itemView.findViewById<ImageView>(R.id.icon_image_view)
        var titles = itemView.findViewById<TextView>(R.id.title_text_view)
    }
}