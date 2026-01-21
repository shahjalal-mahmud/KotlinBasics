package com.appriyo.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.appriyo.kotlinbasics.basics.BasicTypes
import com.appriyo.kotlinbasics.basics.Collections
import com.appriyo.kotlinbasics.basics.ControlFlow
import com.appriyo.kotlinbasics.basics.HelloWorld

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
        BasicTypes()
        Collections()
        ControlFlow()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowBasicPreview(){
    ShowBasic()
}