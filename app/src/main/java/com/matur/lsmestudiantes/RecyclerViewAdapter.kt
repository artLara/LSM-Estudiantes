package com.matur.lsmestudiantes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val mList: List<Topic>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_recycler_view_topic, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
//        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.getName()
        holder.topicCheckBox!!.isChecked = DictSigns.dict[ItemsViewModel.getName()]!!.use
        holder.topicCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            DictSigns.dict[ItemsViewModel.getName()]!!.use=isChecked

//            if (isChecked) {
//                DictSigns.dict[ItemsViewModel.getName()]!!.use=true
//            }else{
//                DictSigns.dict[ItemsViewModel.getName()]!!.use=false
//            }
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
//        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textViewTopic)
        val topicCheckBox: CheckBox = itemView.findViewById(R.id.topicCheckBox)

    }
}