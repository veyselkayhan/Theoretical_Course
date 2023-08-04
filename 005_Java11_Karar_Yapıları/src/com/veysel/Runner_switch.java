package com.veysel;

import java.util.Scanner;

public class Runner_switch {

	public static void main(String[] args) {
		/*
		 * if kullanımında performans koşulunun doğru olduğu andan sonrali durumları es
		 * geçmesini sağlar ve böylece performans artışı olur.
		 * 
		 * kesin sonuç aldığımız belli bir değeri olan bir aralığı değil net bir sonucu
		 * irdelediğimiz durumlarda kullanırız.
		 * 
		 */
//		System.out.println("****************************");
//		System.out.println("*********Işlemler***********");
//		System.out.println("****************************");
//
//		System.out.println();
//		System.out.println("1-Toplama");
//		System.out.println("2-Çıkartma");
//		System.out.println("3-Çarpma");
//		System.out.println("4-Bölme");
//		System.out.println("5-mod");
//		System.out.println("0- CIKIS");
//		System.out.println("Seciniz");

		int secim = 2;
		Scanner sc = new Scanner(System.in);

		System.out.println();

		if (secim == 1)
			System.out.println("Toplama");
		else if (secim == 2)
			System.out.println("Çıkartma");
		else if (secim == 3)
			System.out.println("Çarpma");
		else if (secim == 4)
			System.out.println("Bölme");

		else if (secim == 5)
			System.out.println("Mod");

		else if (secim == 0)
			System.out.println("CIKIS");

		switch (secim) {
		case 1:
			System.out.println("Toplama");
			break;
		case 2:
			System.out.println("Cıkarma");
			break;
		case 3:
			System.out.println("CARPMA");
			break;
		case 4:
			System.out.println("BÖLME");
			break;
		case 5:
			System.out.println("MOD");
			break;
		case 0:
			System.out.println("ÇIKIŞ");
			break;
		default:
			System.out.println("Lütfen Gecerli Bir Secim Yapiniz");
		}
		System.out.println("Uygulama Kapandı");
		sc.close();
	}// main

}// class
