package com.kelvin.morning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvin.morning.ui.theme.MorningTheme
import com.kelvin.muleli.ImageActivity

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {

    Box (modifier = Modifier
        .fillMaxSize(),
        ){
        Image(painter = painterResource(id =R.drawable.myhouse ),
            contentDescription ="win" ,

            contentScale = ContentScale.Crop


            )
        Column (
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxSize()
                .padding(12.dp),

            horizontalAlignment = Alignment.CenterHorizontally

        ){


            var name by remember {
                mutableStateOf(TextFieldValue("")) }
            TextField(
                value = name,
                onValueChange = {name = it},
                label = { Text(text = "Enter your name")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "hellos")}
                )

            Spacer(modifier = Modifier.height(30.dp))

            var email by remember {
                mutableStateOf(TextFieldValue("")) }
            TextField(
                value = email,
                onValueChange = {email = it},
                label = { Text(text = "Enter your email")},
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "hellos")}
                )

            Spacer(modifier = Modifier.height(30.dp))

            var phone by remember {
                mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = phone,
                onValueChange = {phone = it},
                label = { Text(text = "Enter your phone-number")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "hellos")}

            )

            Spacer(modifier = Modifier.height(30.dp))

            var password by remember {
                mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = password,
                onValueChange = {password = it},
                label = { Text(text = "Enter your strong password")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "hellos")},
                textStyle = TextStyle(Color.Red),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Blue,
                    unfocusedBorderColor = Color.Red,
                    focusedLabelColor = Color.Red,
                    unfocusedLabelColor = Color.Green,
                    cursorColor = Color.Blue,
                    unfocusedLeadingIconColor = Color.Blue,
                    focusedLeadingIconColor = Color.Green,
                    focusedTextColor = Color.Magenta,
                    unfocusedTextColor = Color.Red,
                    focusedTrailingIconColor = Color.Yellow,
                    unfocusedTrailingIconColor = Color.Black




                )

            )


            Spacer(modifier = Modifier.height(30.dp))

            var place by remember {
                mutableStateOf(TextFieldValue("")) }
            TextField(
                value = place,
                onValueChange = {place = it},
                label = { Text(text = "Enter your location")},
                leadingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "hellos")}
            )

            Spacer(modifier = Modifier.height(30.dp))


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












            val home = LocalContext.current
            Button(onClick = {
                home.startActivity(Intent(home, MainActivity::class.java))

            },
//           colors = ButtonDefaults.buttonColors( Color.Red),
//           shape = REctangleShape
//           shape = RoundedCornerShape(10.dp)
                shape = CutCornerShape(20),
                border = BorderStroke(1.dp, Color.Blue),

                colors = ButtonDefaults.outlinedButtonColors(Color.Red),



                ) {
                Text(
                    text = "Home Screen",
                    color = Color.Yellow
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
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
                    text = "Sign up",
                    color = Color.Yellow
                )
            }

            val login = LocalContext.current
            Button(onClick = {
                login.startActivity(Intent(login, MainActivity::class.java))

            },
//           colors = ButtonDefaults.buttonColors( Color.Red),
//           shape = REctangleShape
//           shape = RoundedCornerShape(10.dp)
                shape = CutCornerShape(20),
                border = BorderStroke(1.dp, Color.Blue),

                colors = ButtonDefaults.outlinedButtonColors(Color.Red),



                ) {
                Text(
                    text = "Verify and  log in",
                    color = Color.Yellow
                )
            }






        }

    }


}