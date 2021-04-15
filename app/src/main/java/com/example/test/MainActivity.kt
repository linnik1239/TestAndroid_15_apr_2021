package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FirstFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var blankFragment = FirstFragment()
        init()
    }

    private fun init() {
            var fragmentManager = supportFragmentManager
            var fragmentTransaction = fragmentManager.beginTransaction()
            var firstFragment = FirstFragment()
            fragmentTransaction.add(R.id.fragment_1, firstFragment).commit()





    }

    override fun onButtonClick(id: String,name: String,mail: String,gender: String) {

        //main_text.text =id

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_2, SecondFragment.newInstance(id,name,mail,gender))
            .commit()


    }
}