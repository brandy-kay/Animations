package com.adhanjas.animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.adhanjas.animations.databinding.FragmentConfirmationDialogBinding

class ConfirmationDialogFragment :DialogFragment(){
    private lateinit var binding: FragmentConfirmationDialogBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding= FragmentConfirmationDialogBinding.inflate(layoutInflater,container,false)
        val view=binding.root
        binding.cancel.setOnClickListener {
            dialog!!.dismiss()
        }
        binding.agree.setOnClickListener {
            Toast.makeText(requireActivity(), "yes", Toast.LENGTH_SHORT).show()
        }

        return view

    }
    private fun sendData(){

    }


}