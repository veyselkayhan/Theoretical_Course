package com.zeynep.Ornek1.entity;

import java.util.UUID;

public class Personel {

	private String id;
	private String ad;
	private String adres;
	private String telefon;
	private Departman departman;

	@Override
	public String toString() {
		return "Personel [id=" + id + ", ad=" + ad + ", adres=" + adres + ", telefon=" + telefon + ", departman="
				+ departman + "]";
	}

	public Personel(String ad, String adres, String telefon, Departman departman) {
		super();
		this.id = UUID.randomUUID().toString();
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
		this.departman = departman;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Departman getDepartman() {
		return departman;
	}

	public void setDepartman(Departman departman) {
		this.departman = departman;
	}

	public String getId() {
		return id;
	}

}
