package com.veysel.entity;

public class Satis {
	/**
	 * aynı paket içinde bulunan sınıflar import etmeksizin bir birlerini
	 * çağırabilirler.
	 */

	public void urunSatıs() {
		Musteri musteri = new Musteri();
		musteri.ad = "Mustafa";
		musteri.telefon = "878787";
//		musteri.yas="333";aynı pakette iken private olunca erişim iptal.
	}

	public void urunListesi() {

	}

}
