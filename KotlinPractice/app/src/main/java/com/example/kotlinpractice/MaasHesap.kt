package com.example.kotlinpractice

class MaasHesap {


    fun maasHesapla(gunSayisi :Int):Int{

        val mesaiSaati  = gunSayisi * 8
        println("Çalışma saatiniz : $mesaiSaati")

        var maas = 0

        if (mesaiSaati > 160)
        {
          val fazlamesaimaas = mesaiSaati - 160
            maas = 160*10 + fazlamesaimaas*20
        }
        else
        {
            maas = mesaiSaati * 10
        }
        return maas

    }
}