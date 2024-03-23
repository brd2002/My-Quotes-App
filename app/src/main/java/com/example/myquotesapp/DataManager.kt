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
    // read json file
    fun loadAssetsFromFile(context: Context){
        var inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        val json = String(buffer , Charsets.UTF_8)
        val  gson = Gson()
        data = gson.fromJson(json , Array<Quote>::class.java)
        isDataLoaded.value = true
    }
}