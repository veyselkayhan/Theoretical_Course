package com.veysel;

public class Runner {

	public static void main(String[] args) {
		/*
		 * Karar Yapıları 1-> if kullanımı
		 * 
		 * 
		 */

//		System.out.println("Hello,Program start...");
//
//		int sicaklik = 130;// 100-120 normal,121+ tehlikeli
//
//		if (sicaklik < 121) {// eğer sıcaklık 121 altında ise bunu yap..
//			synchronized ("Her şey yolunda") {
//
//			}
//		}
//		if (sicaklik > 120) {
//			System.err.println("Bir şeyler ters gidiyor DİKKAT!!!");
//		}

		/*
		 * 1 den 140 a gidicek bi for döngüsü yazınız döngünün değerini kontrol ederek
		 * 120 yi aştıktan sonra tehlike diye ekrana yazsın
		 */

		int sayı = 0;

		for (sayı = 0; sayı <= 140; sayı++) {
			if (sayı < 120) {
				System.out.println("Her şey yolunda " + sayı);
			}
			if (sayı >= 120) {

				System.err.println("TEHLİKE " + sayı);

			}
		}

	}// main sonu

}// class sonu
