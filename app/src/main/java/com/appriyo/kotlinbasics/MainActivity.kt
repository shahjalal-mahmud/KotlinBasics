package com.appriyo.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.appriyo.kotlinbasics.basics.HelloWorld
import com.appriyo.kotlinbasics.basics.StringTemplates
import com.appriyo.kotlinbasics.basics.Variables

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowBasic()
        }
    }
}

@Composable
fun ShowBasic(){
    Column {
        HelloWorld()
        Variables()
        StringTemplates()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowBasicPreview(){
    ShowBasic()
}