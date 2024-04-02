package com.kelvin.morning

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import com.kelvin.muleli.AboutActivity
import com.kelvin.muleli.ImageActivity

//import com.kelvin.muleli.ImageActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Morning()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Morning() {
   Column(
       modifier = Modifier
           .background(Color.Green)
//           .fillMaxWidth()
//           .fillMaxHeight()
           .fillMaxSize(),


//       verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally






   ) {
       Row(
           horizontalArrangement = Arrangement.SpaceAround,
           modifier = Modifier
               .background(Color.Cyan)
               .fillMaxWidth()
               .height(20.dp)



       ) {

           Text(text = "Chats")
            Spacer(modifier = Modifier. width(7.dp))

           Text(text = "Status")
           Spacer(modifier = Modifier. width(7.dp))

           Text(text = "Calls")

       }


       Spacer(modifier = Modifier.height(15.dp))
       Row (
           horizontalArrangement = Arrangement.SpaceEvenly,
           modifier = Modifier
               .background(Color.Green)

       ){

           val about = LocalContext.current
           Button(onClick = {
               //about.startActivity(Intent(about, AboutActivity::class.java))

           },
//           colors = ButtonDefaults.buttonColors( Color.Red),
//           shape = REctangleShape
//           shape = RoundedCornerShape(10.dp)
               shape = CutCornerShape(20),
               border = BorderStroke(1.dp, Color.Blue),

               colors = ButtonDefaults.outlinedButtonColors(Color.Red),



               ) {
               Text(text = "About Screen",
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
               Text(
                   text = "Input Screen",
                   color = Color.Yellow
               )
           }
           val scroll = LocalContext.current
           Button(onClick = {
               scroll.startActivity(Intent(scroll, ScrollActivity::class.java))

           },
//           colors = ButtonDefaults.buttonColors( Color.Red),
//           shape = REctangleShape
//           shape = RoundedCornerShape(10.dp)
               shape = CutCornerShape(20),
               border = BorderStroke(1.dp, Color.Blue),

               colors = ButtonDefaults.outlinedButtonColors(Color.Red),



               ) {
               Text(
                   text = "scroll Screen",
                   color = Color.Yellow
               )
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
               Text(
                   text = "image Screen",
                   color = Color.Yellow
               )
           }




           val just = LocalContext.current
           Button(onClick = {

              just.startActivity(Intent(just, JustActivity::class.java))

           },
//
               shape = CutCornerShape(20),
               border = BorderStroke(1.dp, Color.Blue),

               colors = ButtonDefaults.outlinedButtonColors(Color.Red),



               ) {
               Text(text = "image Screen",
                   color = Color.Yellow
               )
           }


       }


       Text(text = "It is my first ever android project",
           color = Color.Blue, fontSize = 10.sp,
           fontFamily = FontFamily.Cursive)


       Spacer(modifier = Modifier.height(15.dp))


       val text = AnnotatedString("Do you need to go to image? Bonyeza hapa!!!",
           spanStyle = SpanStyle(Color.Magenta))

      val ww = LocalContext.current

       ClickableText(text = text, onClick = {
           ww.startActivity(Intent(ww, ImageActivity::class.java))
            })

       Spacer(modifier = Modifier.height(15.dp))
        val kk = LocalContext.current
        Text(text = "Click me to log in ?If already you have an account!",
            modifier = Modifier
                .clickable {
                    kk.startActivity(Intent(kk, InputActivity::class.java))
                }

            )

       Spacer(modifier = Modifier.height(15.dp))

           val nn = LocalContext.current
           Text(text = "Click me to view images",
           modifier = Modifier
           .clickable {
               nn.startActivity(Intent(nn, ImageActivity::class.java))

           }
)
   }
    Spacer(modifier = Modifier.height(15.dp))

        val hh = LocalContext.current
        Text(text = "Click to Cards",
            modifier = Modifier
                .clickable {
                    hh.startActivity(Intent(hh, CardActivity::class.java))
                }
        )


   }



//       Text(text = "I guess am ready to start",
//           color = Color.Green,
//           modifier = Modifier.background(color = Color.Blue))
//
//
//       Text(text = "Happy coding",
//           color = Color.Black)
//   }



