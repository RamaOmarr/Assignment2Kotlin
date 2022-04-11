package com.example.assignment2kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class DialogFragmentPage: DialogFragment(R.layout.fragment_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var btnn: Button= view.findViewById(R.id.btn)
        btnn.setOnClickListener {
            val m1: MainActivity=getActivity() as MainActivity;
            m1.recLogin("Logged in successfully")
            dismiss()
        }
    }


}