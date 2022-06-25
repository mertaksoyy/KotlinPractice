package com.example.kotlinpractice

class Factoriel {

    fun factorial(sayi :Int) : Int{
        var result=1

        for (i in sayi downTo 1) {
            result = result * i

        }
        return result
    }
}