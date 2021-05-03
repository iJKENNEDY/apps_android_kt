package com.colmenatech.mvvm_listfrases.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.colmenatech.mvvm_listfrases.model.QuoteModel
import com.colmenatech.mvvm_listfrases.model.QuoteProvide

class QuoteViewModel: ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun  randomQuote(){
        val currentQuote = QuoteProvide.random()
        quoteModel.postValue(currentQuote)
    }
}