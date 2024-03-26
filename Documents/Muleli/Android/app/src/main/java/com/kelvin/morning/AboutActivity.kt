package com.kelvin.morning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvin.morning.InputActivity
import com.kelvin.morning.MainActivity
import com.kelvin.muleli.ImageActivity


class aboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Abou()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Abou() {
    Column {



        val home = LocalContext.current
        Button(onClick = {
            home.startActivity(Intent(home, MainActivity::class.java))

        }) {
            Text(text = "Home Screen")

        }
        val image = LocalContext.current
        Button(onClick = {
            image.startActivity(Intent(image, ImageActivity::class.java))

        },
//           colors = ButtonDefaults.buttonColors( Color.Red),
//           shape = REctangleShape
//           shape = RoundedCornerShape(10.dp)
            shape = CutCornerShape(20),
            border = BorderStroke(1.dp, Color.Blue),

            colors = ButtonDefaults.outlinedButtonColors(Color.Red),



            ) {
            Text(text = "Image Screen",
                color = Color.Yellow
            )
        }
        val input = LocalContext.current
        Button(onClick = {
            input.startActivity(Intent(input, InputActivity::class.java))

        },
//           colors = ButtonDefaults.buttonColors( Color.Red),
//           shape = REctangleShape
//           shape = RoundedCornerShape(10.dp)
            shape = CutCornerShape(20),
            border = BorderStroke(1.dp, Color.Blue),

            colors = ButtonDefaults.outlinedButtonColors(Color.Red),



            ) {
            Text(text = "Input Screen",
                color = Color.Yellow
            )
        }
        Text(text = "ITs now new mobile application ")

        Text(text = "About android")
    }
}
