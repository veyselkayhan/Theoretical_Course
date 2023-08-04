package com.veysel;

public class Runner_Degisken_Turleri {

	public static void main(String[] args) {

		/**
		 * Java da değişkenler 2 şekilde ifade ediliriler
		 * 
		 * 1- primitive data type - İlkel veri türleri
		 * 
		 * 1.1-Sayısal Veri Türleri
		 * 
		 * 1.1.1-Tam Sayılar
		 * 
		 * 1.1.1.1-byte->2^8 - içinde sakalayabileceği adet 256 adettir.->Sınırları
		 * -128...0....127 şeklinde oluşur. mantık kısmını söyle ifade edelim.
		 * 
		 * 1.1.1.2->short -> 2^16 adettir.
		 * 
		 * 1.1.1.3->integer->2^32 adettir. !!!!!DİKKAT!!!! her dilde default değeri
		 * vardır.Java dilinde de sayısal tam sayıların default data tiği int dir.
		 *
		 * 1.1.1.4 -> long 2^64 uzun tamsayılarda int sınırlarına aştığından dolayı
		 * sonuna l konulur.
		 *
		 *
		 * 1.1.2-> Ondalıklı Sayılar 1.1.2.1->double -> 2^32 kutucuk
		 * 1.1.2.2->float->2^64 kutucuk var
		 *
		 *
		 * 1.2->Karekter Veri Türleri 1.2.1->char 1.2.2->string
		 * 
		 * 2-references data type-Referans tipi veri türleri
		 * 
		 * 
		 * 
		 * 
		 */
		byte byte_degiskeni;
		byte byte1;
		// byte 1.degisken;YANLIŞ tanımlamadır.
		// byte 1degisken; YANLIŞ değişken adları rakamla baslamaz.
		// byte degisken-1;YANLIŞ
		// byte degisken*1;YANLIŞ
		// Sadece _ kullanılır !!!!

		byte_degiskeni = -128;
		System.out.println("Byte Değeri...:" + byte_degiskeni);
		byte_degiskeni = 56;
		// byte_degiskeni=128; byte için sınır -128 ile 127 arasındadır.Sınır Dışına
		// çıktığımız için uyarı verir.

		System.out.println("Byte Değeri...:" + byte_degiskeni);

		short short_degiskeni = 128;
		short_degiskeni = 56;
		short_degiskeni = 32767;
		short_degiskeni = -32768;
		/**
		 * Bir değişkene başka bir değişkene atanabilir mi?
		 * 
		 */

		short short1 = 5;
		System.out.println("Short1....:" + short1);
		short short2 = 12;
		System.out.println("Short2....:" + short2);
		short1 = short2;
		System.out.println("Short1...:" + short1);

		byte byte2 = 32;
		System.out.println("byte2....." + byte2);
		short2 = byte2;
		System.out.println("Short2.....:" + short2);

		byte2 = 67;
		short2 = 1;
		// cast işlemi yapmalısınız.Aynı yapıda olan ancak aynı değişken türünde olmayan
		// değerler
		// birnirine cast edilme yöntemi ile atanabilirler.Ancak Gösterim şekli
		// değişkenin kapsamı ile kısıtlanabilir.
		// (değişken türü)değişkenin adı
		byte2 = (byte) short2;
		System.out.println("byte2....." + byte2);

		short2 = 150;
		byte2 = (byte) short2;
		System.out.println("byte2....." + byte2);
		// -106 çıkar çünkü -128 ile başlar 127 e kadar gider byte bundan dolayı 128.
		// sayı olmadığı için başa döndü.

		int int_sayisi = 2000000000;
		int_sayisi = -2000000000;

		System.out.println(3);// 3 ün değişken türü nedir?? -> direk integer olarak alır 32 kutucukla ifade
								// edilir.

		// sayısal değerleri tanımlarken integer olarak tanımlar.Bunu bilgisayar cast
		// etmemizi ister.Default tam sayı değeri integer tipindedir.

		long uzun_tamsayi = 3215465;
		uzun_tamsayi = 300000000;
		uzun_tamsayi = 300000000000000l;// sonuna l yazarak long olduğunu söyleriz.
		// tam sayı default değeri integer olduğu için daha fazla alıcakken
		// alamıyor.Long olduğunu söylemek zorundayız.

		uzun_tamsayi = 1000L * 60 * 60 * 24 * 365 * 100;
		System.out.println("Zaman......" + uzun_tamsayi);// 1,094,004,736 integer out of range oldu ondan dolayı başa
															// döndü.32 kutucuklu bi işlemin 64 kutucuklu işleme cevao
															// vermez

		long uzun_sayı = 21_341_242_930_912_093L;// Okumayı kolaştırmak içim _ kullanılabilir
		System.out.println(uzun_sayı);// ekrana yazdırımca normal şekilde görünür.

		float ondalıklı_sayı = 2_342_123.53435f;// javanın default ondalıklı sayı değeri double olduğu için float
												// olduğunu belirtmeliyiz.

		double ondalıklı_uzun_sayı = 2_234_213_123.2321;

		/**
		 * 
		 * bir int değerini float a ya da float değerine int e atarsam ne olur??
		 */

		float ssf1 = 34.98f;
		int ssi1 = 453;
		ssi1 = (int) ssf1;// float to int cast etmemiz gerekir.
		System.out.println("İnteger değişkeni.....:" + ssi1);

		ssf1 = 34.98f;
		ssi1 = 453;
		ssf1 = ssi1;
		System.out.println("Float Değer....." + ssf1);// 453.0

		/*
		 * 
		 * ?=)/ 123 456 - * [] bunların hepsi karakterdir.Rakam değildir!!! Bilgisayar
		 * her bir karakter için önceden belirlenmiş ve standart haline getirilmiş
		 * sayıları kullanır. Bu sayıları içeren tabloya ASCII karakter tablosu adı
		 * veriilir.
		 */
		System.out.println("**************************");
		System.out.println("****KARAKTER İŞLEMLERİ****");
		System.out.println("**************************");
		System.out.println(6);// değişken türü integer
		System.out.println();
		System.out.println("6");// char karakterdir.
		System.out.println((int) '6');// karakterler sayılarla ifade edilir.cast işlemi ile onların değerlerini
										// alabilirsiniz.
		char karakter = 64;
		System.out.println(karakter);

		char a1 = 'V';
		char a2 = 'E';
		char a3 = 'Y';
		char a4 = 'S';
		char a5 = 'E';
		char a6 = 'L';
		System.out.println(a1);
		System.out.println(a2);
		System.out.print(a3);// println demedik print dediğimiz için devam etti bu yüzden yan yana yazdı.
		System.out.print(a4);
		System.out.print(a5);
		System.out.print(a6);

		// her bir harf için atama yaptık!!!

		System.out.println("**************************");
		System.out.println("****String İşlemleri******");
		System.out.println("**************************");

		String ifade = "Kayhan";// stringde ifade çift tırnakla yazılır.{K,a.y.h.a.n};
		/*
		 * String değişkeni char dan türetilmiş , char array olarak tanımlanır.Bir çok
		 * özelliği bünyesinde barındırır.
		 * 
		 */

	}// main sonu
}// class sonu