package com.thanhduc91tpk.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thanhduc91tpk.recyclerview2.model.AlphaChar
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        val key = "passed"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val alphachar = intent.getSerializableExtra(key) as AlphaChar

        icon_image_view_deltail.setImageResource(alphachar.icons!!)
        title_text_view_deltail.text = alphachar.alpha.toString()
    }
}
