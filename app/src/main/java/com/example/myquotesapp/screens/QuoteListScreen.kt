package com.example.myquotesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myquotesapp.models.Quote


@Composable
fun QuoteListScreen(data : Array<Quote> , onClick:()->Unit) {
    Column(){
        Text(text = "My Quotes App" ,
            textAlign = TextAlign.Center ,
            modifier = Modifier.padding(8.dp , 24.dp)
                .fillMaxSize(1f) ,
            style = MaterialTheme.typography.headlineLarge)
        QuoteList(data = data) {
            onClick()
        }
    }
}