package com.example.rickandmortyapi.View.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortyapi.Model.api.result.Character
import com.example.rickandmortyapi.R

class MyAdapter: RecyclerView.Adapter<MyAdapter.ListViewHolder>() {

    private var list = emptyList<Character>()

    fun setList(newList: List<Character>){
        list = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return  list.size
    }


    class ListViewHolder(view: View): RecyclerView.ViewHolder(view){

        private val imageView: ImageView = itemView.findViewById(R.id.id_rv_imageview)
        private val name: TextView = itemView.findViewById(R.id.id_rv_character_name)
        private val statusImage: ImageView = itemView.findViewById(R.id.id_rv_status_imageview)
        private val statusAndSpecies: TextView = itemView.findViewById(R.id.id_rv_status_species)
        private val lastKnownLocation: TextView = itemView.findViewById(R.id.id_rv_last_known_location)
        private val firstSeenIn: TextView = itemView.findViewById(R.id.id_rv_first_seen_in)

        fun bind(character: Character){
            name.text = character.name

            if(character.status == "Dead"){
                statusImage.setColorFilter(R.color.red)
            } else{
                statusImage.setColorFilter(R.color.green)
            }

            val statusAndSpeciesString = "${character.status} - ${character.species}"
            statusAndSpecies.text = statusAndSpeciesString

        }



    }
}