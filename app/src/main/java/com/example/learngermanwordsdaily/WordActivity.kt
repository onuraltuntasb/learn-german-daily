package com.example.learngermanwordsdaily

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_word.*

class WordActivity : AppCompatActivity() {
    var word="wie"
    var randomValue=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word)

        randomValue= intent.getStringExtra("deger").toInt()

        var veri2=Veri()

        word= veri2.words[randomValue].toString()
        val url="https://dictionary.cambridge.org/dictionary/german-english/"+word+"?q="+word
        println(word)
        webview.loadUrl(url)
    }
}
