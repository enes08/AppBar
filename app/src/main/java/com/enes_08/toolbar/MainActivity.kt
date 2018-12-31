package com.enes_08.toolbar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity(), View.OnClickListener {


    var mtoolBar: Toolbar? = null
    var ivAdd: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mtoolBar = findViewById(R.id.toolBar)
        ivAdd = mtoolBar?.findViewById(R.id.ivAdd)


        ivAdd?.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        when (v) {
            ivAdd -> {

                Toast.makeText(this@MainActivity, "Add tıklandı", Toast.LENGTH_SHORT).show()

                var i = Intent(this@MainActivity, AddActivity::class.java)
                startActivity(i)

            }
        }
    }
}
