package com.example.menu

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [hamburguesa.newInstance] factory method to
 * create an instance of this fragment.
 */
class hamburguesa : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_hamburguesa, container, false)

        val url1 = "https://i.pinimg.com/736x/1a/e6/bd/1ae6bdd3616eb2c6fd7e181a8615fc06.jpg"
        val url2 = "https://d1uz88p17r663j.cloudfront.net/original/8689e8d974203563ddcc9bbff91323c2_MG_CHORIZOBURGER_Main-880x660.png"
        val url3 = "https://cdn.cookmonkeys.es/recetas/medium/hamburguesa-de-pollo-1-13554.jpg"
        val url4 = "https://cocina-casera.com/wp-content/uploads/2016/11/hamburguesa-queso-receta.jpg"

        val hamburguesa1 = Producto( "Hamburguesa suprema", "Muy buena", 150.00, url1  )
        val hamburguesa2 = Producto( "Hamburguesa clásica", "Muy buena", 120.00, url2  )
        val hamburguesa3 = Producto( "Hamburguesa de pollo", "Muy buena", 100.00, url3  )
        val hamburguesa4 = Producto( "Hamburguesa doble", "Muy buena", 120.00, url4  )

        val miLista = view.findViewById<ListView>(R.id.milistview1)

        val listaproductos = listOf(hamburguesa1, hamburguesa2, hamburguesa3, hamburguesa4)

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
         * @return A new instance of fragment hamburguesa.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            hamburguesa().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}