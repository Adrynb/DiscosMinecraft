package com.example.discosminecraft

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.ListFragment
import androidx.fragment.app.commit
import es.instituto.dragonesadaptativo.R

class inicio : Fragment() {

    companion object {
        fun newInstance() = inicio()
    }

    private lateinit var viewModel: InicioViewModel
    private lateinit var view: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        view = inflater.inflate(R.layout.fragment_inicio, container, false)
        view.findViewById<ImageView>(R.id.sansView).setOnClickListener {
            val fm : FragmentManager = parentFragmentManager
            fm.commit {
            }

        }
        return null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InicioViewModel::class.java)
        // TODO: Use the ViewModel
    }

}