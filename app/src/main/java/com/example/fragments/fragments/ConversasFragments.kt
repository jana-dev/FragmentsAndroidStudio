package com.example.fragments.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragments.R

class ConversasFragments: Fragment() {

    //Chamado para anexar o fragment a activity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida", "Fragment: onAttach")
    }

    //Chamado ao criar o objeto do fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "Fragment: onCreate")
    }

    //Chamado para criar a visualização do fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("ciclo_vida", "Fragment: onCreateView")
        return inflater.inflate(
            R.layout.fragment_conversas, //qual layout de fragment vou utilizar
            container, //onde ele vai ser colocado (dentro de activiy main colocamos o fragmentContainerView, dentro ele desejamos ter o fragment conversas
            false
        )
    }

    //Chamado quando a visualização do fragment já foi criada
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ciclo_vida", "Fragment: onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Fragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Fragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Fragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Fragment: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ciclo_vida", "Fragment: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_vida", "Fragment: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("ciclo_vida", "Fragment: onDetach")
    }

}