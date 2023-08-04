package com.veysel;

public class Runner_Islemler {

	public static void main(String[] args) {
		
		
		int sayı=25;
		/*
		 * Bir sınıfı kullanmak için onu başlatmanı ve nesnesini
		 * oluşturmanız gereklidir.Yani bellekte bir yer edindirmeniz gerekir.Böylece
		 * bu nesneyi tekrar tekrar kullanabiliriz.
		 */
		
		Islemler islem=new Islemler();
		System.out.println("Sayının karesi...."+islem.kare(sayı));

	}

}
