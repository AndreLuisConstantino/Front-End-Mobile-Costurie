package br.senai.sp.jandira.costurie_app.components

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Line() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            //.height(100.dp),
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        Row(

            modifier = Modifier
                . fillMaxWidth()
                .height(50.dp),
            horizontalArrangement = Arrangement.spacedBy(18.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box (
                modifier = Modifier
                    .height(1.dp)
                    .width(100.dp)
                    .background(Color(65, 57,70)),
            ){}

            Text(
                text = "Ou",
                style = MaterialTheme.typography.bodySmall,
                fontSize = 13.sp,
                fontWeight = FontWeight(500),
                color = Color.Black,

                )

            Box (
                modifier = Modifier
                    .height(1.dp)
                    .width(100.dp)
                    .background(Color(65, 57,70)),
            ){}
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LinhaPreview() {
    Line()
}