package com.veysel.entity;

import java.util.UUID;

public class Personel {

	String id;
	String ad;
	String adres;
	String telefon;
	private Departman departman;
	
	
	
	
	public Departman getDepartman() {
		return departman;
	}

	public void setDepartman(Departman departman) {
		this.departman = departman;
	}

	@Override
	public String toString() {
		return "Personel [id=" + id + ", ad=" + ad + ", adres=" + adres + ", telefon=" + telefon + "]";
	}
	public Personel(String ad, String adres, String telefon,Departman departman) {
		super();
		this.id=UUID.randomUUID().toString();
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
		this.departman=departman;
	}

	public Personel(String ad, String adres, String telefon) {
		super();
		this.id=UUID.randomUUID().toString();
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
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
}
