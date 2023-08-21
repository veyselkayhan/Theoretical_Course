package com.veysel.entity;

public class YayinEvi {

private String ad;
private String adres;
private int kurulusYili;

public YayinEvi(String ad, String adres, int kurulusYili) {
	this.ad = ad;
	this.adres = adres;
	this.kurulusYili = kurulusYili;
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

public int getKurulusYili() {
	return kurulusYili;
}

public void setKurulusYili(int kurulusYili) {
	this.kurulusYili = kurulusYili;
}

@Override
public String toString() {
	return "YayinEvi [ad=" + ad + ", adres=" + adres + ", kurulusYili=" + kurulusYili + "]";
}





}
