package com.appriyo.kotlinbasics.basics

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Collections(){
    List()
    Set()
    Map()
}

@Composable
fun List(){
    // Read only list
    val readOnlyShapes = listOf("Tringle", "Circle", "Rentangle")
    Text("$readOnlyShapes")

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("Tringle", "Circle", "Rentangle")
    Text("$shapes")

    // To prevent unwanted modifications
    val shapesLocked: List<String> = shapes

    // use the indexed access operator []
    Text("The first shape is ${shapes[0]}")

    Text("The first item in the list ${shapes.first()}")
    Text("The last item in the list ${shapes.last()}")
    Text("The list has ${shapes.count()} items")
    println("circle" in shapesLocked)
    shapes.add("pentagon")
    shapes.remove("Circle")
    Text("The current list: $shapes")
}

@Composable
fun Set(){
    val readOnlyFruit = setOf("Apple", "Banana", "Mango")
    Text("$readOnlyFruit")

    val fruits: MutableSet<String> = mutableSetOf("Apple", "Banana", "Mango")
    Text("$fruits")

    val fruitLocked: Set<String> = fruits
    Text("It hase ${fruitLocked.count()} fruits")
    println("Apple" in fruits)
    fruits.add("Grapes")
    fruits.remove("Banana")
    Text("The current list: $fruits")
}

@Composable
fun Map(){
    val readOnlyAccountBalances = mapOf("a" to 1000, "b" to 200, "c" to 3000)
    Text("$readOnlyAccountBalances")

    val accountBalances: MutableMap<String, Int> = mutableMapOf("a" to 1000, "b" to 2000, "c" to 3000)
    Text("$accountBalances")

    val accountBalancesLocked: Map<String, Int> = accountBalances
    Text("The account c has ${accountBalancesLocked["c"]} balance")
    accountBalances["d"] = 4000
    Text("The current list: $accountBalances")
    Text("The map has ${accountBalances.count() }")
    accountBalances.remove("b")
    Text("The current list: $accountBalances")
}