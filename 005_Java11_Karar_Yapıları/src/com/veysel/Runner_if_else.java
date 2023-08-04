package com.veysel;

public class Runner_if_else {

	public static void main(String[] args) {
		/*
		 * uygulamalar için de bir çok durumun irdelemesi ve duruma göre
		 * yönlendirilmelerin yapılması gerekir. if....else
		 * 
		 */

//		String kullanici_Adi = "Veysel";
//		String sifre = "123456";
//		if (kullanici_Adi == "Veysel" && sifre == "123456") {
//			System.out.println("Unlocked");
//		} else {
//			System.out.println("Try Again");
//		}

		/*
		 * bir not sisteminde vize notu ve final notunun ortalaması alınıp 50+ olanları
		 * geçtiği
		 * 
		 * 
		 */

//		int not1 = 50;
//		int not2 = 45;
//		if ((not1 + not2) / 2 < 50) {
//			System.out.println("Kaldınız");
//		} else
//			System.out.println("Geçtiniz");

		/*
		 * Bazen işler daha da karışır.Bir değişkenin 3 ve daha fazla durumu olabilir.
		 * if....else if...else if...else Çok fazla farklı durum için değişkeni
		 * irdelemek zorunda kalırız.Bu gibi durumlarda tek tek kontrol etmek zorunda
		 * kalırız.Bu tarz durumlarda bu method kullanılır.
		 *
		 *
		 * Example->Ikı Sayının bir birine göre durumunu kontrol edelim..
		 * 
		 */

// sayı 1 in sayi 2 e göre kaç farklı durumu olabilir.
		/*
		 * 1. sayi büyük olabilir. 2. sayi küçük olabilir. 3. sayi büyük olabilir.
		 */

//		if (sayi1 < sayi2) {
//			System.out.println(sayi1 + "-" + sayi2 + " İki sayidan kücük olan " + sayi1);
//		} else {
//			System.out.println(sayi1 + "-" + sayi2 + " İki sayidan kücük olan " + sayi2);
//		}

		int sayi1 = 4;
		int sayi2 = 5;

		if (sayi1 > sayi2) {
			System.out.println("sayi1 sayi2 den büyük");
		} else if (sayi1 < sayi2) {
			System.out.println("sayi2 sayi1 den büyük");
		} else {
			System.out.println("sayi1 sayi2 ile eşit");
		}

		// yazmadığı linelar koşul sağlamadığı için yazmadı..

	}// main sonu
}// class sonu
