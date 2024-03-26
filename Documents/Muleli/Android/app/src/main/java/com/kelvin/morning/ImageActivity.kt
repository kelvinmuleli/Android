package com.kelvin.muleli

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvin.morning.MainActivity
import com.kelvin.morning.R

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Image()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Image() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(8.dp)

    ) {
        Image(painter = painterResource(
            id = R.drawable.myhouse
        ),
            contentDescription = "win",
            modifier = Modifier
                .background(Color.Green)
                .clip(CircleShape)
                .size(150.dp),

            //colorFilter = ColorFilter.tint(Color.Green),
            contentScale = ContentScale.Inside

        )




    }



}

