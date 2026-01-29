package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            show()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun show() {
    LazyColumn(
        Modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.blue))
    ) {

        item {
            Image(painter = painterResource(R.drawable.top), contentDescription = "")
        }
        item {
            Text(
                text = "Welcome\nBack Home",
                color = Color.White,
                fontSize = 87.sp,
                lineHeight = (87 - 8).sp,
                modifier = Modifier.padding(start = 24.dp),
                fontFamily = FontFamily(
                    Font(R.font.freescript, FontWeight.Normal)
                )
            )
        }
        item {
            var text by rememberSaveable { mutableStateOf("") }
            val outlinedTextFieldDefault = null
            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                label = { Text("Enter email", color = Color.Blue) },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,

                    ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 24.dp, end = 24.dp)
                    .background(
                        colorResource(R.color.bluewhite),
                        shape = RoundedCornerShape(100.dp)
                    )
            )
        }
        item {
            var password by rememberSaveable { mutableStateOf("") }
            val outlinedTextFieldDefault = null
            TextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = { Text("Type your password", color = Color.Blue) },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,

                    ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 24.dp, end = 24.dp)
                    .background(
                        colorResource(R.color.bluewhite),
                        shape = RoundedCornerShape(100.dp)
                    )
            )
        }

        item {
            Text(
                "Forget Password?",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White


            )
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.orange)
                    ),
                    modifier = Modifier
                        .width(165.dp)
                        .padding(top = 32.dp, bottom = 10.dp)
                        .height(55.dp),
                    shape = RoundedCornerShape(100.dp)
                ) {
                    Text(
                        text = "Login",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                }
            }
        }
    }
}






