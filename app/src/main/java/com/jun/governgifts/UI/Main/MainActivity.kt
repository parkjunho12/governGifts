package com.jun.governgifts.UI.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jun.governgifts.R
import com.jun.governgifts.UI.Age.AgeActivity
import com.jun.governgifts.UI.Base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentAge = Intent(this, AgeActivity::class.java)

        detail_search.setOnClickListener {
            intentAge.putExtra("search", true)
            startActivity(intentAge)
        }
        search_basic.setOnClickListener {
            intentAge.putExtra("search", true)
            startActivity(intentAge) 
        }
    }
}
