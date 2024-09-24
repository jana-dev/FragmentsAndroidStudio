package com.example.fragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fragments.fragments.ChamadasFragments
import com.example.fragments.fragments.ConversasFragments

class MainActivity : AppCompatActivity() {

    private lateinit var btnMercado: Button
    private lateinit var btnChamadas: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val fragmentManager =  supportFragmentManager.beginTransaction()
//        fragmentManager.add(R.id.fragment_conteudo, ConversasFragments())
//        fragmentManager.commit()

        btnChamadas = findViewById(R.id.btn_chamadas)
        btnMercado = findViewById(R.id.btn_mercado)

        btnMercado.setOnClickListener {
            val conversasFragment = ConversasFragments()

            val bundle = bundleOf(
                "categoria" to "mercado",
                "usuario" to "Janaina"
            )
            conversasFragment.arguments = bundle
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, conversasFragment)
                .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragments())
                .commit()
        }

    }
}