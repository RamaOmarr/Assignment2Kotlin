package com.example.assignment2kotlin

import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var LoginPage=DialogFragmentPage()
        var SignupPage=signupDialog()
        when(item.itemId){
            R.id.item1-> SignupPage.show(supportFragmentManager, "Custom Dialog")
            R.id.item2 -> LoginPage.show(supportFragmentManager, "Custom Dialog")
        }
        return true
    }

    fun recSign (msg:String){
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
        var txtt: TextView= findViewById(R.id.txt)
        txtt.text= "Please Login"
    }

    fun recLogin(msgg: String){
        Toast.makeText(this,msgg, Toast.LENGTH_SHORT).show()
        var txtt: TextView= findViewById(R.id.txt)
        txtt.text="Welcome!"
    }
}