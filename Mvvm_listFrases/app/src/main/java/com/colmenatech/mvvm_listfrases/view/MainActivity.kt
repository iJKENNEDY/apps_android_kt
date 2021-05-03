package com.colmenatech.mvvm_listfrases.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.colmenatech.mvvm_listfrases.databinding.ActivityMainBinding
import com.colmenatech.mvvm_listfrases.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain: ActivityMainBinding

    private val quoteViewModel:QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        quoteViewModel.quoteModel.observe(this, Observer {
            bindingMain.tvQuote.text = it.quote
            bindingMain.tvAuthor.text = it.author
        })
        bindingMain.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }
}