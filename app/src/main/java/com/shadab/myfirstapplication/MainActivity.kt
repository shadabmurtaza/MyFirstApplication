package com.shadab.myfirstapplication

import android.content.Intent
import android.media.MediaParser
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insta = findViewById<ImageView>(R.id.insta )
        insta.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/shadab_murtaza"))
            startActivity(intent)
        }


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.viewmore->{
                var intent = Intent(this@MainActivity,MoreDetails::class.java)
                startActivity(intent)
            }
            R.id.exit->{
                 finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }


    fun switch(view: View){
        val intent= Intent(this@MainActivity,MoreDetails::class.java)
        startActivity(intent)
    }

    fun github(view: View) {
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/shadabmurtaza"))
        startActivity(intent)
    }

    fun shareMyProfile(view: View) {
        Toast.makeText(this@MainActivity,"Feature is coming sooon",Toast.LENGTH_SHORT).show()
    }

    fun linkedin(view: View) {
        val intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/shadab-murtaza-6257a81a4"))
        startActivity(intent)
    }


}