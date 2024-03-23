package com.example.myquotesapp.screens

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myquotesapp.models.Quote


@Composable
fun QuoteList(data : Array<Quote> , onClick : ()->Unit) {
    LazyColumn(content = {
        Log.d("data" , data[0].toString())
        items(data){
            QuoteListItem(quote = it) {
                onClick()
            }
        }
    })
}