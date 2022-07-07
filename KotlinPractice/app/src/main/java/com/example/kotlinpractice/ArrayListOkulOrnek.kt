package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main(){


    val girdi = Scanner(System.`in`)

    var sayac =1

    val ogrenciler = ArrayList<Ogrenci>()

    while (true){
        println("Öğrenci İsimi Girin : ")
        val isim = girdi.next()


        println("Öğrenci Sınıfı Giriniz : ")
        val sinif = girdi.next()

        val yeniOgrenci=Ogrenci(sayac,isim,sinif) // main içerisinde oluşturduğun variable ları sınıf özellikleri içersine yazabiliyorsun
        sayac += 1

        ogrenciler.add(yeniOgrenci)

        println("Çıkmak için (1)-Devam etmek için herhangi bir tuşa basın")
        val cikis = girdi.nextInt()

        if (cikis == 1)
        {
            for (ogrenci in ogrenciler){
                println("*****************")
                println("Öğrenci No : ${ogrenci.ogrNo}")
                println("Öğrenci Ad : ${ogrenci.ogrAd}")
                println("Öğrenci No : ${ogrenci.ogrSinif}")
            }

          println("Sistemden Çıkıldı")
          break
        }

    }



}