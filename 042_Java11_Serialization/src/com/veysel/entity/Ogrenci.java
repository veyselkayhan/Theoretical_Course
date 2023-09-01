package com.veysel.entity;

import java.io.Serializable;

public class Ogrenci  implements Serializable{

	Long id;
	String ad;
	String adres;
	String telefon;
	
	
	public Ogrenci( String ad, String adres, String telefon) {
		super();
		this.id=(long) 5;
		this.id = id;
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
	}
	
	
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + ", adres=" + adres + ", telefon=" + telefon + "]";
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
