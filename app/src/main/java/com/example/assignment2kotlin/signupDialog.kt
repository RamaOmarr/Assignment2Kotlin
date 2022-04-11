package com.example.assignment2kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class signupDialog: DialogFragment(R.layout.dialog_signup) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var Sbtn: Button=view.findViewById(R.id.signupBtn)
        Sbtn.setOnClickListener {
            val m1: MainActivity=getActivity() as MainActivity;
            m1.recSign("Signed up successfully")
            dismiss()
        }

    }

}