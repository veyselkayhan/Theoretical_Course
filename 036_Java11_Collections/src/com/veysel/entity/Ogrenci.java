package com.veysel.entity;

import java.util.UUID;

public class Ogrenci {

	String uuid;
	String ad;
	String soyad;
	String veli;
	String iletisim;
	Long kayitTarihi;
	String kayitedenid;

	
	

	
	@Override
	public String toString() {
		return "Ogrenci [uuid=" + uuid + ", ad=" + ad + ", soyad=" + soyad + ", veli=" + veli + ", iletisim=" + iletisim
				+ ", kayitTarihi=" + kayitTarihi + ", kayitedenid=" + kayitedenid + "]";
	}

	public Ogrenci() {
		super();
		this.uuid=UUID.randomUUID().toString();
		
	}
	
	public Ogrenci(String ad, String soyad, String veli, String iletisim, Long kayitTarihi, String kayitedenid) {
		super();
		this.uuid=UUID.randomUUID().toString();
		this.ad = ad;
		this.soyad = soyad;
		this.veli = veli;
		this.iletisim = iletisim;
		this.kayitTarihi = kayitTarihi;
		this.kayitedenid = kayitedenid;
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

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getVeli() {
		return veli;
	}

	public void setVeli(String veli) {
		this.veli = veli;
	}

	public String getIletisim() {
		return iletisim;
	}

	public void setIletisim(String iletisim) {
		this.iletisim = iletisim;
	}

	public Long getKayitTarihi() {
		return kayitTarihi;
	}

	public void setKayitTarihi(Long kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}

	public String getKayitedenid() {
		return kayitedenid;
	}

	public void setKayitedenid(String kayitedenid) {
		this.kayitedenid = kayitedenid;
	}
	
	

}
