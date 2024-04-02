package com.kelvin.morning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvin.morning.ui.theme.MorningTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Lazy()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Lazy() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ){item {

        Column {
            Text(text = "Almost Easter")

            Spacer(modifier = Modifier.height(900.dp))


            Text(text = "Winners never quit")
        }





        val home = LocalContext.current
        Button(onClick = {
            home.startActivity(Intent(home, MainActivity::class.java))

        }) {
            Text(text = "Home Screen")

        }
    }

    }



}


