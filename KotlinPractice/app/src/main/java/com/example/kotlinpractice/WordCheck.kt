package com.example.kotlinpractice

class WordCheck {


    fun wordCheck(word : String,character : Char){ //Ankara , a

        var result = 0

        for(i in word){// A n k a r a

            if (i == character){
                result += 1
            }

        }

        println("Number Of Characters : $result  ")

    }

}