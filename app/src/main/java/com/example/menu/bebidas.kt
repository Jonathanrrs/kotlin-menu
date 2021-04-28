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
 * Use the [bebidas.newInstance] factory method to
 * create an instance of this fragment.
 */
class bebidas : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_bebidas, container, false)

        val url1 = "https://d29nyx213so7hn.cloudfront.net/media/catalog/product/cache/9376f1eb816eda0af02b0c0436fe42c0/f/a/fanta-naranja-pnr-2l.png"
        val url2 = "https://d29nyx213so7hn.cloudfront.net/media/catalog/product/cache/9376f1eb816eda0af02b0c0436fe42c0/1/1/113_coca-cola-300-ml-pet_4.jpg"
        val url3 = "https://cdn.kiwilimon.com/recetaimagen/3609/th5-640x640-12819.jpg"
        val url4 = "https://www.superama.com.mx/Content/images/products/img_large/0750105531182L.jpg"

        val bebida1 = Producto( "Fanta", "Muy rica", 20.00, url1 )
        val bebida2 = Producto( "Coca Cola", "Muy buena", 20.00, url2 )
        val bebida3 = Producto( "Té helado", "Muy buena", 15.00, url3 )
        val bebida4 = Producto( "Sprite", "Muy buena", 20.00, url4 )

        val miLista = view.findViewById<ListView>(R.id.milistview4)

        val listaproductos = listOf(bebida1, bebida2, bebida3, bebida4)

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
         * @return A new instance of fragment bebidas.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            bebidas().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}