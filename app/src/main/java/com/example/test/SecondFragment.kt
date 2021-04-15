package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_second.view.*

private const val ARG_PARAM1 = "ID"
private const val ARG_PARAM2 = "NAME"

private const val ARG_PARAM3 = "EMAIL"

private const val ARG_PARAM4 = "GENDER"

class SecondFragment : Fragment() {
    private var id: String? = null
    private var name: String? = null

    private var email: String? = null
    private var gender: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            id = it.getString(ARG_PARAM1)
            name = it.getString(ARG_PARAM2)
            email = it.getString(ARG_PARAM3)
            gender = it.getString(ARG_PARAM4)

        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        // Inflate the layout for this fragment

//        Emp_id_view.text = id
//        Emp_name_view.text = name
//
//        Emp_email_view.text = email
//
//        Emp_gender_view.text = gender
        var view =  inflater.inflate(R.layout.fragment_second, container, false)
        view.Emp_id_view.text = id

        view.Emp_email_view.text =  email

        view.Emp_name_view.text = name

        view.Emp_gender_view.text = gender
        return view


    }



    companion object {

        @JvmStatic
        fun newInstance(id: String,name: String,mail: String,gender: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, id)
                    putString(ARG_PARAM2, name)
                    putString(ARG_PARAM3, mail)
                    putString(ARG_PARAM4, gender)

                }
            }
    }

}