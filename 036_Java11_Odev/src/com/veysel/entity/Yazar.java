package com.veysel.entity;

public class Yazar {
	
	private String ad;
	private String soyad;
	private int dogumTarihi;
	private String uyruk;
	
	
	public Yazar(String ad, String soyad, int dogumTarihi, String uyruk) {
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		this.uyruk = uyruk;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public int getDogumTarihi() {
		return dogumTarihi;
	}


	public void setDogumTarihi(int dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}


	public String getUyruk() {
		return uyruk;
	}


	public void setUyruk(String uyruk) {
		this.uyruk = uyruk;
	}


	@Override
	public String toString() {
		return "Yazar [ad=" + ad + ", soyad=" + soyad + ", dogumTarihi=" + dogumTarihi + ", uyruk=" + uyruk + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
