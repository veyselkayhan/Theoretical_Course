package com.veysel.controller;

import com.veysel.entity.Musteri;

public class MusteriController {
	/*
	 * Bir müşterinin kimlik bilgilerini dönen method yazınız. Musteri
	 * olsun.Musterinin oluşturulması ile ilgili method Bu method erişime kapalı
	 * olsun.
	 */
	Musteri musteri;

	private void musteriEkle() {// Müşteri nesnesi oluşturup içeriğin doldurulmasını erişime kapalı
		musteri = new Musteri();
		musteri.ad = "Veysel";

	}

	public Musteri getMusteri() {// müşteriyi dönen erişim açık method
		musteriEkle();
		return musteri;

	}

}
