package com.veysel.entity;

public class Musteri {
String id;


UygulamaDili uygulamaDili;




public UygulamaDili getUygulamaDili() {
	return uygulamaDili;
}

public void setUygulamaDili(UygulamaDili uygulamaDili) {
	this.uygulamaDili = uygulamaDili;
}

MusteriPlatform platform;

OdemeSekli odemeSekli;

public OdemeSekli getOdemeSekli() {
	return odemeSekli;
}

public void setOdemeSekli(OdemeSekli odemeSekli) {
	this.odemeSekli = odemeSekli;
}

public MusteriPlatform getPlatform() {
	return platform;
}

public void setPlatform(MusteriPlatform platform) {
	this.platform = platform;
}

String ad;
//String adres;
/*
 * erkek 
 * kadın
 * belirtmek istemiyor.
 * 
 */
//int cinsiyet;
/*
 * yeni musteri
 * gumus musteri
 * bronz musteri
 * altın musteri
 * super musteri
 * 
 */
MusteriTuru musteriTuru;//data type enum oldu numaralandırma.
/*
 * aktif
 * pasif
 * banlanmış
 * dondurulmuş
 * 
 */
MusteriCinsiyet cinsiyet;
MusteriAdres adres;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getAd() {
	return ad;
}

public void setAd(String ad) {
	this.ad = ad;
}

public MusteriAdres getAdres() {
	return adres;
}

public void setAdres(MusteriAdres adres) {
	this.adres = adres;
}

public MusteriCinsiyet getCinsiyet()  {
	return cinsiyet;
}

public void setCinsiyet(MusteriCinsiyet cinsiyet) {
	this.cinsiyet = cinsiyet;
}

public MusteriTuru getMusteriTuru() {
	return musteriTuru;
}

public void setMusteriTuru(MusteriTuru musteriTuru) {
	this.musteriTuru = musteriTuru;
}

public int getAktiflik() {
	return aktiflik;
}

public void setAktiflik(int aktiflik) {
	this.aktiflik = aktiflik;
}

int aktiflik;
}
