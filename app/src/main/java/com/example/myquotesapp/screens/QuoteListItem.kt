package com.example.myquotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun QuoteListItem(){
    Card(elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier.padding(8.dp)) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(imageVector = Icons.Filled.FormatQuote,
                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
                modifier = Modifier
                    .background(Color.Black)
                    .rotate(180f)
                    .size(40.dp),

                contentDescription = "Quote" )
            Spacer(modifier = Modifier.padding(10.dp))
            Column(modifier = Modifier.fillMaxWidth(1f)) {
                Text(text = "Be the change that you wish to see in the world." ,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(0.dp , 0.dp , 0.dp , 8.dp)
                )
                Box(modifier = Modifier
                    .background(Color(0xFFEEEEEE))
                    .fillMaxWidth(.4f)
                    .height(1.dp))
                Text(text = "Mahatma Gandhi" ,
                    modifier = Modifier.padding(4.dp),
                    style = MaterialTheme.typography.bodySmall)
            }

        }
    }
}

@Preview
@Composable
 fun QuoteDetails() {
    Box (contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xffffffff),
                        Color(0xFFF3E8E8)
                    )
                )
            )
    ) {
        Card(elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier.padding(32.dp)) {
            Column(verticalArrangement = Arrangement.Center ,
                modifier = Modifier
                    .padding(16.dp , 24.dp)) {
                Image(imageVector = Icons.Filled.FormatQuote,
                    modifier = Modifier
                        .rotate(180f)
                        .size(80.dp)
                    , contentDescription = "Quote")
                Text(text = "Be the change that you wish to see in the world.",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Mahatma Gandhi" , style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}
