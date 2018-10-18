package com.marcobehler

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
fun main(args: Array<String>) {
    val user = User("Marco")
    println("Hello ${user.name} !")
}

class User(val name: String)