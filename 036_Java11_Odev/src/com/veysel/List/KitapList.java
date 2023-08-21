package com.veysel.List;

import java.util.ArrayList;
import java.util.List;

import com.veysel.entity.Kitap;
import com.veysel.entity.YayinEvi;
import com.veysel.entity.Yazar;

public class KitapList {
	public static void main(String[] args) {
		List<Kitap> kitapListesi = new ArrayList<Kitap>();
		Yazar yazar = new Yazar("J. K.", "Rowling", 1950, "Ingiliz");
		YayinEvi yayinEvi = new YayinEvi("Vk Yayın", "Muğla", 1998);
		Kitap kitap = new Kitap("Harry Potter", "Bilim Kurgu", 1998, yazar,yayinEvi);
		kitapListesi.add(kitap);

		Yazar yazar2 = new Yazar("J.R.R", "Tolkien", 1880, "İngiliz");
		YayinEvi yayinEvi2 = new YayinEvi("Vk Yayın", "Muğla", 1998);
		Kitap kitap2 = new Kitap("Yüzüklerin Efendisi", "Bilim Kurgu", 1954, yazar2, yayinEvi2);
		kitapListesi.add(kitap2);

		Yazar yazar3 = new Yazar("Dan", "Brown", 1964, "Amerikalı");
		YayinEvi yayinEvi3 = new YayinEvi("Vk Yayın", "Muğla", 1998);
		Kitap kitap3 = new Kitap("Da Vincinin Şifresi", "Bilim Kurgu", 2003, yazar2, null, yayinEvi2);
		kitapListesi.add(kitap3);

		Yazar yazar4 = new Yazar("Robert", "Jordan", 1948, "ABD");
		Yazar yazar42 =new Yazar("Brandom", "Sanderson", 1975, "ABD");
		YayinEvi yayinEvi4 = new YayinEvi("Vk Yayın", "Muğla", 1998);
		Kitap kitap4 = new Kitap("a", "b", 1234, yazar4,yazar42, yayinEvi4);
		kitapListesi.add(kitap4);
		

		System.out.println("------- For Dongusu ------");
		for (Kitap AliCabbar : kitapListesi) {
			if (AliCabbar.getYazar2() != null) {
				System.out.println(AliCabbar.toString());
			}
			else  {
				System.out.println(AliCabbar.toString1());
			}

		}
	}

}
