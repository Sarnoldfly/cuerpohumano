package com.banana.appclase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageView.setImageResource(imageResId)

        val imageView = intent.getIntExtra("imagerResId", 0)
        if (imageResId != 0 ) {
            imageView.setImageResource(imageResId)


        }
    }
}