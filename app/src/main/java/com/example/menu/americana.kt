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
 * Use the [americana.newInstance] factory method to
 * create an instance of this fragment.
 */
class americana : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_americana, container, false)

        val url1 = "https://dam.cocinafacil.com.mx/wp-content/uploads/2019/04/hotdog.png"
        val url2 = "https://laroussecocina.mx/wp-content/uploads/2018/12/sandwich-de-queso-mossarella.jpg"
        val url3 = "https://dam.cocinafacil.com.mx/wp-content/uploads/2018/02/071CF05_MXmay16.jpg"
        val url4 = "https://www.vvsupremo.com/wp-content/uploads/2018/01/Chorizo-and-Egg-Breakfast-Burritos.jpg"

        val americana1 = Producto( "Dogos", "Muy rica", 50.00, url1 )
        val americana2 = Producto( "Sándwiches", "Muy buena", 50.00, url2 )
        val americana3 = Producto( "Pollo frito","Muy buena", 100.00, url3 )
        val americana4 = Producto( "Burrito","Muy buena", 40.00, url4 )

        val miLista = view.findViewById<ListView>(R.id.milistview2)

        val listaproductos = listOf(americana1, americana2, americana3, americana4)

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
         * @return A new instance of fragment americana.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            americana().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}