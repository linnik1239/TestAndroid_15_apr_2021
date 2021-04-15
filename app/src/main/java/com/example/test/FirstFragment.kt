package com.example.test

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {
    var onFragmentInteraction: OnFragmentInteraction? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


//        button_send.setOnClickListener{
//            var id = Emp_id.text.toString()
//            var name = Emp_name.text.toString()
//
//            var email = Emp_email.text.toString()
//
//            var gender = Emp_gender.text.toString()
//
//
//
//        }

        var view  = inflater.inflate(R.layout.fragment_first, container, false)

        init(view)

        return  view
    }

    private fun init(view: View){
        view.button_send.setOnClickListener {

            var id = Emp_id.text.toString()
            var name = Emp_name.text.toString()

            var email = Emp_email.text.toString()

            var gender = Emp_gender.text.toString()



            onFragmentInteraction?.onButtonClick(id,name,email,gender)
        }
    }

    interface OnFragmentInteraction{
        fun onButtonClick(
            id: String,
            name: String,
            email: String,
            gender: String
        )
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context!=null){
            onFragmentInteraction = context as MainActivity
        }
    }



}