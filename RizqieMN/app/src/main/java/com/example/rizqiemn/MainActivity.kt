package com.example.rizqiemn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.textSize = 64F
        textView.text = "\uD83D\uDE28\uD83D\uDE28\uD83D\uDE28\uD83D\uDE28\uD83D\uDE28\uD83D\uDE28\uD83D\uDE28\uD83D\uDE28"
    }
}
