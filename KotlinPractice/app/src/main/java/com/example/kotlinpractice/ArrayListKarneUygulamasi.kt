package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val girdi = Scanner(System.`in`)

    val dersNotlarListesi = ArrayList<DersNotlar>()


    while (true){

        println("Girmek İstediğiniz Dersi Yazın")
        val ders=girdi.next()


        println("Dersin Notunu Yazın")
        val not = girdi.nextInt()


        val yeniDers = DersNotlar(ders,not)


        dersNotlarListesi.add(yeniDers)


        println("Çıkmak için(1)- Devam etmek için herhangi bir tuşa basın")
        val cikis = girdi.nextInt()


        if (cikis == 1){

            var toplam = 0

            println("*************")
            for (d in dersNotlarListesi)
            {
                println("${d.ders} : ${d.not}")
                toplam+=d.not
            }

            var ortalama = toplam / dersNotlarListesi.size
            println("Ortalamaniz : ${ortalama}")

            if (ortalama >= 50)
            {
                println("Geçtiniz")
            }
            else
            {
                println("Kaldın bro")
            }

            println("Çıkış Yapıldı")
            break
        }
    }
}