package shrai.ee.expensemanager

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleViewAdaptor(private val context : Activity, private val data:ArrayList<Expenses>)
    : RecyclerView.Adapter<viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemInflate = LayoutInflater.from(context).inflate(R.layout.list_items,parent,false)
        return viewHolder(itemInflate)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.amount.text = data[position].getPrice().toString()
        holder.date.text = data[position].getDate()
        holder.item.text = data[position].getContext()
    }
}
class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val amount : TextView = itemView.findViewById(R.id.amount)
    val date : TextView = itemView.findViewById(R.id.date)
    val item : TextView = itemView.findViewById(R.id.item)
}