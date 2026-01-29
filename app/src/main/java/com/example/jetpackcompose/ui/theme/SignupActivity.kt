package com.example.jetpackcompose.ui.theme

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.jetpackcompose.R


class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}
@Composable
@Preview
fun signup (){
    LazyColumn(
        Modifier.fillMaxSize()
            .background(color = colorResource(R.color.blue))
    )
    {
        item {
            Text(
                text = "Hello...",
                color = Color.White,
                fontSize = 87.sp,

                modifier = Modifier.padding(top=48.dp,start = 24.dp),
                fontFamily = FontFamily(
                    Font(R.font.freescript, FontWeight.Normal)
                )
            )
        }
        item {
            var name by rememberSaveable { mutableStateOf("") }
            val outlinedTextFieldDefault = null
            TextField(
                value = name,
                onValueChange = {
                    name = it
                },
                label = { Text("Name...", color = Color.Blue) },
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
            var email by rememberSaveable { mutableStateOf("") }
            val outlinedTextFieldDefault = null
            TextField(
                value = email,
                onValueChange = {
                    email = it
                },
                label = { Text("Email", color = Color.Blue) },
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
            var Mobile by rememberSaveable { mutableStateOf("") }
            val outlinedTextFieldDefault = null
            TextField(
                value = Mobile,
                onValueChange = {
                    Mobile = it
                },
                label = { Text("Mobile", color = Color.Blue) },
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
            var Password by rememberSaveable { mutableStateOf("") }
            val outlinedTextFieldDefault = null
            TextField(
                value = Password,
                onValueChange = {
                    Password = it
                },
                label = { Text("Password", color = Color.Blue) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
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
            var rePassword by rememberSaveable { mutableStateOf("") }
            val outlinedTextFieldDefault = null
            TextField(
                value = rePassword,
                onValueChange = {
                    rePassword = it
                },
                label = { Text("Re-Password", color = Color.Blue) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
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
        item{
            ConstraintLayout(modifier = Modifier.padding(top= 48.dp)){
                val (circleRight, circleLeft, centerTxt)= createRefs()
                Text(modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(centerTxt){
                        centerTo(parent)},
                    textAlign = TextAlign.Center,
                    color = Color.White,
                     fontSize = 14.sp,
                    text = "Already have account?Login"

                )

                Image(painter = painterResource(R.drawable.bottom),
                    contentDescription =null,
                    modifier= Modifier
                        .constrainAs(circleLeft){
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                        }
                )

            }
        }
    }
}