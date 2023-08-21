package com.zeynep.Ornek3;

public class Urun {
	
	private String ad;
	private String urunKodu;
	private double fiyat;
	private int stok;
	
	private KategoriList kategoriList;
	
	

	public Urun(String ad, String urunKodu, double fiyat, int stok) {
		super();
		this.ad = ad;
		this.urunKodu = urunKodu;
		this.fiyat = fiyat;
		this.stok = stok;
	}

	public Urun(String ad, String urunKodu, double fiyat, int stok, KategoriList kategoriList) {
		super();
		this.ad = ad;
		this.urunKodu = urunKodu;
		this.fiyat = fiyat;
		this.stok = stok;
		this.kategoriList = kategoriList;
	}

	@Override
	public String toString() {
		return "Urun [ad=" + ad + ", urunKodu=" + urunKodu + ", fiyat=" + fiyat + ", stok=" + stok + ", kategoriList="
				+ kategoriList + "]";
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getUrunKodu() {
		return urunKodu;
	}

	public void setUrunKodu(String urunKodu) {
		this.urunKodu = urunKodu;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public KategoriList getKategoriList() {
		return kategoriList;
	}

	public void setKategoriList(KategoriList kategoriList) {
		this.kategoriList = kategoriList;
	}
	
	
	
	
	
	
	
	

}
