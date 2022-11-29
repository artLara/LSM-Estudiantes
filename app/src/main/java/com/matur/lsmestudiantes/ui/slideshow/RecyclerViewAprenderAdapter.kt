package com.matur.lsmestudiantes.ui.slideshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.recyclerview.widget.RecyclerView
import com.matur.lsmestudiantes.*


class RecyclerViewAprenderAdapter(private val mList: List<Topic>) : RecyclerView.Adapter<RecyclerViewAprenderAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_topic_aprender, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            val ItemsViewModel = mList[position]
            holder.textView.text = ItemsViewModel.getName()


            holder.textView.setOnClickListener{
                val activity=it.context as AppCompatActivity
                val rec: RecyclerView = activity.findViewById(R.id.recyclerview_aprender)
                activity.supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.nav_host_fragment_content_main,AprenderFragment.newInstance(holder.textView.text.toString()))
                    .addToBackStack(null)
                    .commit()
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        //        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textViewTopicAprender)
    }
}