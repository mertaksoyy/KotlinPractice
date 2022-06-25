package com.example.kotlinpractice

class KotaHesap {

    fun kotaHesapla(GB : Int) : Int{
        var fatura = 0

        if (GB> 50)
        {
            val ekstrakota = GB-50
            fatura = 100 + ekstrakota*4
        }
        else
        {
            fatura = 100
        }
        return  fatura
    }
}