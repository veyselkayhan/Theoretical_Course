package com.veysel;

import java.util.Scanner;

public class Runner_Ornek1 {

	public static void main(String[] args) {
		/*
		 * Döngü bloğu sürekli çalışacak olan kod parçalarını içerir. Koşul, bir boolean
		 * ifade olmalıdır. Eğer koşul doğru (true) ise döngü bloğu tekrar çalıştırılır,
		 * aksi takdirde döngüden çıkılır.
		 */
		// 0 değeri girilinceye kadar çalışan programa çevir...

		Scanner sc = new Scanner(System.in);
		System.out.println("*************");
		System.out.println("**İŞLEMLER***");
		System.out.println("*************");
		System.out.println();
		System.out.println("1- Toplama");
		System.out.println("2- Çıkarma");
		System.out.println("3- Çarpma");
		System.out.println("4- Bölme");
		System.out.println("5- MOD");
		System.out.println("0- Ç I K I Ş");

		int secim;
		do {

			System.out.print("Yapmak İstenilen ");
			secim = sc.nextInt();
			if (secim != 0) {
				System.out.print("Sayı 1 :");
				int sayı1 = sc.nextInt();

				System.out.print("Sayı 2 :");
				int sayı2 = sc.nextInt();

				switch (secim) {
				case 1:
					System.out.println("Toplama: " + (sayı1 + sayı2));
					break;
				case 2:
					System.out.println("Çıkarma: " + (sayı1 - sayı2));
					break;
				case 3:
					System.out.println("Çarpma: " + (sayı1 * sayı2));
					break;
				case 4:
					System.out.println("Bölme: " + (sayı1 / sayı2));
					break;
				case 5:
					System.out.println("Mod: " + (sayı1 % sayı2));
					break;
				case 0:
					System.out.println("Çıkış Yapılıyor");
					break;
				default:
					System.out.println("Geçersiz bir işlem seçildi.");
				}
			} else {
				System.out.println("Çıkış Yapıldı");
			}
		} while (secim != 0);

		System.out.println("Uygulama Kapatıldı...");

		sc.close();

	} // do

}// main

// class
