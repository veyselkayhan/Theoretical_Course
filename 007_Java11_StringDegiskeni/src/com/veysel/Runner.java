package com.veysel;

public class Runner {

	public static void main(String[] args) {
		/*
		 * bilgisayar sistemlerinin bilgilerini tutmak için bitleri ve bu bitlerin bir
		 * araya getirdikleri değişkenleri kullanırız.
		 * 
		 * String değişkeni aslında birden çok char dediğimiz karakter değişkenin bir
		 * araya getirilmesi ile oluşan bir değişken türüdür. String = char[] şeklinde
		 * ifade edilir. Ancak birebir eşitlik olarak anlaşılmamalıdır.
		 * 
		 */
//		String ifade = "Bugun Hava Cok Sicak";
		/*
		 * 1 bit ->0-1 char->8 kutucuk -> 8 bit ->2^8
		 * 
		 * 
		 * String değişkenin referans data type olarak geçtiği için içinde kendi
		 * özelliklerini alabileceğimiz methodlar barındırır. Bunlardan birisi uzunluk
		 * methodudur. length()
		 * 
		 * char[]={' ',' ', uzunluğu böyle bulduk.length ile
		 */
//
//		int ifade_değişkenin_uzunluğu = ifade.length();
//		System.out.println("uzunluk " + ifade_değişkenin_uzunluğu);

		/*
		 * getting a single char
		 * 
		 * 
		 */

//		System.out.println(ifade.charAt(4));// burada sayarak n ifadesine ulaştık.

		/*
		 * (string adı).charArt(hangi rakamsa onun sayısı) olarak çağırdık
		 */

		/*
		 * NOT!! Diziler karakter index i olarak 0(sıfır)dan başlar
		 * 
		 */

//		System.out.println("4.karakter....:" + ifade.charAt(4));
//		String ad = "Veysel";// adımızı tersten yazalım char.int komutu ile
//
//		for (int i = ad.length() - 1; i > -1; i--) {
//			System.out.print(ad.charAt(i) + " ");
//		}

		/*
		 * 
		 * finding index bir ifade içinde aranılan bir harf yada ifadenin rastlanıldığı
		 * index numarasını dönen kod. içerisinde harfi bulan kod..
		 */
//		System.out.println("a harfi nerede?..." + ifade.indexOf('a'));// bugün hava çok sıcak
//		System.out.println("Çok ifadesi nerede geçiyor" + ifade.indexOf("Çok"));// bugün hava çok sıcak// olmayan
//																				// bulamadığı durumda -1 sonucu
//																				// alırız....
//		System.out.println("Hava  ifadesi nerede geçiyor " + ifade.indexOf("Hava"));
		/*
		 * 
		 * 
		 * 
		 * Getting a substring
		 * 
		 */
//		String kesilecek_ifade = "Bu ifadenin içinde,bir iç ifade,var";
//		System.out.println(kesilecek_ifade);
//		System.out.println(kesilecek_ifade.substring(10));// başlangıç ve bitiş
//		System.out.println(kesilecek_ifade.substring(5, 15));

		/*
		 * 
		 * aşagıda verilen ifadenin içindeki kelimeleri ekrana yazdıran kodu yazalım.
		 * 
		 * ögrenci isimleri:Ahmet,Canan,Tuba,Bahar,Gül
		 * 
		 */

		String ogrenciler = "Ahmet,Canan,Tuba,Bahar,Gül,";
		do {

			int virgül = ogrenciler.indexOf(',');
			if (virgül < 0)
				break;
			String isim = ogrenciler.substring(0, virgül);
			System.out.println(isim);
			ogrenciler = ogrenciler.substring(virgül + 1);

		} while (true);

		/*
		 * bu kodlama sayesinde , olarak ayrılan isimleri alt alta yazdık döngüde
		 * listeye yeni yeni liste gibi atadık.
		 */

	}

}
