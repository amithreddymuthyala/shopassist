package com.application.shopassist.ui.shoppinglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.application.shopassist.R
import com.application.shopassist.firebase.models.Product
import kotlinx.android.synthetic.main.shopping_list_firebase_products.view.*


class ShoppingListFirebaseProductsAdapter(private val products: List<Product>,
                                          private  val itemClickListener: OnItemClickListener) : RecyclerView.Adapter<ShoppingListFirebaseProductsAdapter.ViewHolder>(){
    override fun getItemCount() = products.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]

        holder.productName.text = product.productName
        holder.bind(products[position],itemClickListener)
        // holder.productSubCategory.text=product.productSubCategory
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ShoppingListFirebaseProductsAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.shopping_list_firebase_products, parent, false)
        return ShoppingListFirebaseProductsAdapter.ViewHolder(
            itemView
        )
    }



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productName: TextView
            get() = itemView.productName
        val addButton: ImageView
            get()=itemView.add_btn

        val deleteButton:ImageView
            get()=itemView.delete_btn



        fun bind(product: Product, clickListener: OnItemClickListener)
        {

            itemView.add_btn.setOnClickListener {
                clickListener.onAddItemClickedInFirebaseList(product)
                itemView.add_btn.setImageResource(R.drawable.ic_add_circle_green_24dp)
                //it.background= ContextCompat.getDrawable(context.requireContext(), R.drawable.ic_add_circle_green_24dp);

            }
            itemView.delete_btn.setOnClickListener {
                clickListener.onDeleteItemClickedInFirebaseList(product)
                itemView.add_btn.setImageResource(R.drawable.ic_add_circle_black_24dp)
            }
        }

//        val productSubCategory:TextView
//             get()=itemView.productSubCat

    }

    interface OnItemClickListener{
        fun onAddItemClickedInFirebaseList(product: Product)
        fun onDeleteItemClickedInFirebaseList(product: Product)

    }
}