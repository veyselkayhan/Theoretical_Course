package com.veysel;

import com.veysel.entity.Araba;
import com.veysel.entity.Kitap;
import com.veysel.service.KiralamaIslemleri;

public class Runner {

	public static void main(String[] args) {

		/*
		 * Değişken tanımlamak; int sayi; Kitap kitap;
		 * 
		 * 
		 * Değer Kısmı sayi=65; kitap=new Kitap();//nesne oluşturma.....
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		Kitap kitap1 = new Kitap();
		Kitap kitap2 = new Kitap();

		kitap1.ad = "Java SE Giriş";
		kitap2.ad = "Spring Boot";
		kitap1.yazarAdi = "Vk";
		kitap2.yazarAdi = "Bk";

		System.out.println("1.kitap adı....." + kitap1.ad);
		System.out.println("1.kitap adı....." + kitap2.ad);

		System.out.println("1.kitap....." + kitap1.yazarAdi);// bellek adreslerini yazdı.
		System.out.println("1.kitap....." + kitap2.yazarAdi);// bellek adreslerini yazdı.

		Araba araba1 = new Araba();
		Araba araba2 = new Araba();

		araba1.marka = "Bmw";
		araba2.marka = "Merco";

		System.out.println(araba1.marka + " " + araba2.marka);
//Genel sınıfı Anlatırken kalıp kalıptır herhangi bir işlem yapamazsın ondan bir nesne yaratmalısın.

		KiralamaIslemleri kiralamaIslemleri = new KiralamaIslemleri();
		kiralamaIslemleri.KiralamaYap();
		kiralamaIslemleri.kiralamaYap("Veysel", "Honda");

	}

}
