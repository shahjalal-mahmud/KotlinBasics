package com.appriyo.kotlinbasics.basics

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BasicTypes(){
    var customers = 10
    customers = 8
    customers += 10
    customers -= 5
    customers *= 2
    customers /= 3

    Text("The customers: $customers")

    // Variable Declare without initialization
    val d: Int
    d = 3

    // Variable explicitly typed and initialized
    val e: String = "Hello"

    Text("$d and $e")
}