package com.veysel;

import com.veysel.entity.Musteri;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Musteri musteri = new Musteri();
		musteri.ad = "Veysel";
		musteri.adres = "Bodrum";
		musteri.telefon = "0537 847 06 33";
		musteri.email = "veyselkayhan13@gmail.com";
		musteri.sayac = 5;
		System.out.println("Musteri..." + musteri.ad);
		System.out.println("Musteri..." + musteri.sayac);

		Musteri musteri2 = new Musteri();
		musteri2.ad = "canan";
		musteri2.adres = "Bodrum";
		musteri2.telefon = "0533 123 06 33";
		musteri2.email = "canan@gmail.com";
		musteri2.sayac = 15;
		System.out.println("Musteri..." + musteri2.ad);
		System.out.println("Musteri..." + musteri2.sayac);
		System.out.println("Musteri...." + musteri.sayac);// ilk başta 5 idi sonra 15 oldu sebep static

		/*
		 * Bir sınıf içindeki özelliklere erişim sağlayamazsınız. İstinası,içindeki
		 * adreslenebilen değişkenler ya da methodlar olmadıkça eger static method ya da
		 * değişkenler var ise onlar adreslendiği için direk erişim yapılabilir.
		 * 
		 */
		Musteri.sayac = 134;
		System.out.println("Musteri..:" + Musteri.sayac);

	}

}
