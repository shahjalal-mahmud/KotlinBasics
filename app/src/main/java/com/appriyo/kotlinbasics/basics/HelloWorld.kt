package com.appriyo.kotlinbasics.basics

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HelloWorld(){
    Text("Hello World.")
}

@Composable
fun Variables(){
    val cat = 5
    var dog = 10
    dog = 11
    Text("$cat cats and $dog dogs")
}

@Composable
fun StringTemplates(){
    val customer = 10
    Text("The customer number are $customer")
    Text("There are ${customer + 1} customers")
}
