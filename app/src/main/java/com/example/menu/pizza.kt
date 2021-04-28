package com.example.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [pizza.newInstance] factory method to
 * create an instance of this fragment.
 */
class pizza : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val appContext= requireContext().applicationContext
        val view = inflater.inflate(R.layout.fragment_pizza, container, false)

        val url1 = "https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2017/04/pizzapepperoni0.jpg"
        val url2 = "https://t1.rg.ltmcdn.com/es/images/1/9/3/pizza_casera_31391_600_square.jpg"
        val url3 = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/close-up-of-pizza-on-table-royalty-free-image-995467932-1559051477.jpg"
        val url4 = "https://www.saborusa.com/wp-content/uploads/2019/10/Animate-a-disfrutar-una-deliciosa-pizza-de-salchicha-Foto-destacada.png"

        val pizza1 = Producto( "Pizza vegetal", "Muy buena", 100.00, url1 )
        val pizza2 = Producto( "Pizza de carnes", "Muy rica", 150.00, url2 )
        val pizza3 = Producto( "Pizza de queso", "Muy buena", 130.00, url3 )
        val pizza4 = Producto( "Pizza de peperoni", "Muy buena", 120.00, url4 )

        val miLista = view.findViewById<ListView>(R.id.milistview3)

        val listaproductos = listOf(pizza1, pizza2, pizza3, pizza4)

        val miAdapter= productoAdapter(appContext,listaproductos)
        miLista.adapter = miAdapter
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment pizza.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            pizza().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}