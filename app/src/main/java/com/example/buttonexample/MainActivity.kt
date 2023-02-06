package com.example.buttonexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttonexample.ui.theme.ButtonExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ButtonRootView()
                }
            }
        }
    }
}

@Composable
fun ButtonRootView() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        SimpleButton()
        ButtonWithColor()
        ButtonWithTwoTextView()
        ButtonWithIcon()
        ButtonWithRectangleShape()
        ButtonWithRoundCornerShape()
        ButtonWithyCutCornerShape()
        ButtonWithBorder()
    }
}

@Composable
fun ButtonWithBorder() {
    Button(onClick = { /*TODO*/ },
         border = BorderStroke(1.dp, Color.Red),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
    ) {
       Text(text = "Button with border", color = Color.DarkGray)
    }
}

@Composable
fun ButtonWithyCutCornerShape() {
    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(20)) {
        Text(text = "Cut corner shape")
    }
}

@Composable
fun ButtonWithRoundCornerShape() {
    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(20.dp)) {
        Text(text = "round corner shape")
    }
}

@Composable
fun ButtonWithRectangleShape() {
    Button(onClick = { /*TODO*/ }, shape = RectangleShape) {
        Text(text = "Rectangle Shape")
    }
}

@Composable
fun ButtonWithIcon() {
    Button(onClick = { /*TODO*/ }) {
        Image(painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Button Icon",
             modifier = Modifier.size(20.dp)
            )
    }
}

@Composable
fun ButtonWithTwoTextView() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Click ", color = Color.Magenta)
        Text(text = "here", color = Color.Green)
    }
}

@Composable fun SimpleButton() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Simple Button")
    }
}

@Composable
fun ButtonWithColor() {
    Button(onClick = { /*TODO*/ },
       colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)) {
        Box {
            Text(text = "Button with gray background", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ButtonExampleTheme {
        ButtonRootView()
    }
}