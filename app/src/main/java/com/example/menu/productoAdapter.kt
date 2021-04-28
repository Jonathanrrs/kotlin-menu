package com.example.menu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class productoAdapter(private val mContext: Context,private val listaproductos: List<Producto>): ArrayAdapter<Producto>(mContext, 0,listaproductos) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout=LayoutInflater.from(mContext).inflate(R.layout.listaproducto, parent, false)
        val producto = listaproductos[position]
        val txtnombre = layout.findViewById<TextView>(R.id.txtnombre)
        val txtprecio = layout.findViewById<TextView>(R.id.txtprecio)
        val img = layout.findViewById<ImageView>(R.id.imageView)

        txtnombre.setText(producto.nombre)
        txtprecio.setText("Precio: " + producto.precio.toString())
        //img.setImageResource(producto.img)
        Picasso.get().load(producto.img).into(img)

        return layout

    }
}