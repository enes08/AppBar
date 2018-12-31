package com.enes_08.toolbar

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class AddActivity : AppCompatActivity(), View.OnClickListener {


    var ivBack: ImageView? = null
    var mtoolBar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        mtoolBar = findViewById(R.id.toolBar);


        ivBack = mtoolBar?.findViewById(R.id.ivBack)

        ivBack?.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v) {
            ivBack -> {

                Toast.makeText(this@AddActivity, "back tıklandi", Toast.LENGTH_SHORT).show()

                var i = Intent(this@AddActivity, MainActivity::class.java)
                startActivity(i)
                finish()
            }
            else -> {
                Toast.makeText(this@AddActivity, "elseye  girdi", Toast.LENGTH_SHORT).show()

            }
        }

    }
}