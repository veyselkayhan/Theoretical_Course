package com.veysel.List;

import java.util.ArrayList;
import java.util.List;

import com.veysel.entity.Ogrenci;

public class RunnerList {

	public static void main(String[] args) {

		Ogrenci ogr1 = new Ogrenci("Veysel", "Kayhan", "Basri", "555 ", 11123L, "Müdür");
		Ogrenci ogr2 = new Ogrenci("Deniz ", " Tekin ", "Demet", "0333 333 33 33", 1998L, "Müdür");
		Ogrenci ogr3 = new Ogrenci("Bahar ", "Kuş ", "Hasan", "0444 444 44 44", 1998L, "Müdür");
//		System.out.println(ogr1.toString());

		/*
		 * bir okulda 300 öğrenci var diyelim. List bir interfacedir,kendinden türeyen
		 * koleksiyonların referanslarını taşır. tanımlama yapmak için mutlaka
		 * references Data Type şeklinde sınıf kullanmalısınız.
		 * 
		 */

		List<Ogrenci> ogrenciList;
		List<String> sinifAdlari;
		List<Integer> sayiLİstesi;

		// Lİst <int> basitSayiListesi;bu tanım yapılamaz hatalıdır.Cünkü mutlaka
		// References tip olmalıdır.

		String[] adListesi = new String[5];// {null ,null ,null ,null ,null}; ilk böyle olur.

//		System.out.println(Arrays.toString(adListesi));

		String ad;
		String soyad = "";

		List<String> adListem = new ArrayList<String>();// bir array list koleksiyonu tanımlamak
		ArrayList<String> adListem2 = new ArrayList<String>();

		adListem.add("Muhammet Hoca");
		adListem.add("Canan");
		adListem.add("Hakan");
		adListem.add("Baki");
		System.out.println(adListem.toString());// [Muhammet Hoca, Canan, Hakan, Baki]
		adListem.remove(2);
		System.out.println(adListem.toString());// [Muhammet Hoca, Canan, Baki]
		adListem.add(1, "Deneme");
		System.out.println(adListem.toString());// [Muhammet Hoca, Deneme, Canan, Baki]

		System.out.println("3.kayıt...:" + adListem.get(2));// 3.kayıt...:Canan

		System.out.println("Bakinin Sırası....:" + adListem.indexOf("Baki"));
		System.out.println("Bakinin Sırası....:" + adListem.indexOf("Deniz"));

		/*
		 * Bir varlığın liste olarak kullanılması
		 * 
		 */

		ArrayList<Ogrenci> ogrencilerim = new ArrayList<Ogrenci>();
		ogrencilerim.add(ogr1);
		ogrencilerim.add(ogr2);
		ogrencilerim.add(ogr3);

		/*
		 * Soru :index numarası 1 olan öğrencinin adı nedir?
		 */

		System.out.println("1.index öğrencinin Ad bilgisi :"+ogrencilerim.get(1).getAd());// index numarası 1 olan öğrencinin adını getirir

		
		/*
		 * Özel listenin hazır hali. İçine at at at sonra ne yapmak istiyorsan..
		 * 
		 */

//		IOzelListe<Ogrenci> liste = null;
//		liste.add(ogr1);
//		liste.list();
//
//		int toplam;
//		int a = 5;
//		toplam = a + 7555;
//		toplam = a + 44;
//		toplam = a + 222;
//		toplam = a + 21;
//		toplam = a + 332277;
		/*
		 * Soru;5 değerini tek seferde nasıl değiştiririm ve bunu dinamik yani uygulama
		 * çalışırken nasıl değiştirebilirim..
		 * 
		 */

	}

}
