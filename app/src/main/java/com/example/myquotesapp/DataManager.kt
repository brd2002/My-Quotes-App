package com.example.myquotesapp

import android.content.Context
import android.util.JsonReader
import androidx.compose.runtime.mutableStateOf

import com.example.myquotesapp.models.Quote
import com.google.gson.Gson
import java.io.StringReader

object DataManager {
    var data = emptyArray<Quote>()
    var isDataLoaded = mutableStateOf(false)
    var currentQuote : Quote ? = null
    var currentPage = mutableStateOf(Pages.DATALIST)
    // read json file
    fun loadAssetsFromFile(context: Context){
        var inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer , Charsets.UTF_8)
        val  gson = Gson()
        data = gson.fromJson(json , Array<Quote>::class.java)
        isDataLoaded.value = true
    }
    fun switchPages(quote: Quote?){
        if (currentPage.value == Pages.DATALIST){
            currentQuote = quote
            currentPage.value = Pages.DETAILSPAGE
        }else {
            currentPage.value = Pages.DATALIST
        }
    }
}
