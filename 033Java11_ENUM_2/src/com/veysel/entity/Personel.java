package com.veysel.entity;

import java.util.UUID;

public class Personel {

	String uuid;
	String ad;
	String adres;
	String telefon;
	String photo;
	/*
	 * 
	 * Personel ünvanlarını.
	 * Personel ünvanı->Müdür,Mühendis,Cevre Düzenleme Görevlisi,Asistan,Muhasebeci
	 * Personel ünvan no->1000,1001,1002,3000,3001
	 * 
	 */
	Unvanlar unvanlar;
	
	public Personel(String ad, String adres, String telefon, String photo, Unvanlar unvanlar) {
		super();
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
		this.photo = photo;
		this.unvanlar = unvanlar;
		this.uuid=UUID.randomUUID().toString();
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Unvanlar getUnvanlar() {
		return unvanlar;
	}
	public void setUnvanlar(Unvanlar unvanlar) {
		this.unvanlar = unvanlar;
	}
}
