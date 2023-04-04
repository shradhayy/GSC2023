package com.vishal2376.rebooked.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.vishal2376.rebooked.R
import com.vishal2376.rebooked.models.Book

class BookAdapter(private val context: Context, private val books: List<Book>) :
    Adapter<BookAdapter.BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.title.text = books[position].title
        holder.img.setImageResource(books[position].imgID)

        //animation
        holder.itemView.animation = AnimationUtils.loadAnimation(context, R.anim.slide)

    }

    inner class BookViewHolder(itemView: View) : ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tvBookTitle)
        val img: ImageView = itemView.findViewById(R.id.imgBook)
    }
}