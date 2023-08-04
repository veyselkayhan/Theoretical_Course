package com.veysel.service;

public class SatisSistemleri {
	private double kdv = 1.08;
	private double indirimliKdv = 1.03;

	/*
	 * Alış fiyatı üzerinden bir ürünün kdv ve ötv dahil fiyatını hesapla
	 * 
	 * 
	 */

	public double genelsatisFiyati(double alisFiyati) {
		return alisFiyati * kdv;
	}

	public double bayiisatisFiyati(double alisFiyati) {
		return alisFiyati * indirimliKdv;
	}

}
