package com.veysel.entity;

public class Kitap {

	private String ad;
	private String tur;
	private int yayimyili;
	private Yazar yazar;
	private Yazar yazar2;
	private YayinEvi yayinEvi;
	public Kitap(String ad, String tur, int yayimyili, Yazar yazar, Yazar yazar2, YayinEvi yayinEvi) {
		super();
		this.ad = ad;
		this.tur = tur;
		this.yayimyili = yayimyili;
		this.yazar = yazar;
		this.yazar2 = yazar2;
		this.yayinEvi = yayinEvi;
	}
	
	
	public Kitap(String ad, String tur, int yayimyili, Yazar yazar, YayinEvi yayinEvi) {
		super();
		this.ad = ad;
		this.tur = tur;
		this.yayimyili = yayimyili;
		this.yazar = yazar;
		this.yayinEvi = yayinEvi;
	}

	public String toString1() {
		return "Kitap [ad=" + ad + ", tur=" + tur + ", yayimyili=" + yayimyili + " " + yazar + " "
				+ " " + yayinEvi + "]";
	}

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public int getYayimyili() {
		return yayimyili;
	}
	public void setYayimyili(int yayimyili) {
		this.yayimyili = yayimyili;
	}
	public Yazar getYazar() {
		return yazar;
	}
	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}
	public Yazar getYazar2() {
		return yazar2;
	}
	public void setYazar2(Yazar yazar2) {
		this.yazar2 = yazar2;
	}
	public YayinEvi getYayinEvi() {
		return yayinEvi;
	}
	public void setYayinEvi(YayinEvi yayinEvi) {
		this.yayinEvi = yayinEvi;
	}
	@Override
	public String toString() {
		return "Kitap [ad=" + ad + ", tur=" + tur + ", yayimyili=" + yayimyili + " " + yazar + " "
				+ yazar2 + " " + yayinEvi + "]";
	}

	
	
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
}
