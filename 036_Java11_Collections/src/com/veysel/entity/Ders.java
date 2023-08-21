package com.veysel.entity;

public class Ders {

	
	private String dersAdi;
	private String OgretmenAdi;
	private String aciklama;
	
	
	
	
	
	
	public Ders(String dersAdi, String ogretmenAdi, String aciklama) {
		super();
		this.dersAdi = dersAdi;
		OgretmenAdi = ogretmenAdi;
		this.aciklama = aciklama;
	}
	
	
	
	
	public String getDersAdi() {
		return dersAdi;
	}
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}
	public String getOgretmenAdi() {
		return OgretmenAdi;
	}
	public void setOgretmenAdi(String ogretmenAdi) {
		OgretmenAdi = ogretmenAdi;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}




	@Override
	public String toString() {
		return "Ders [dersAdi=" + dersAdi + ", OgretmenAdi=" + OgretmenAdi + ", aciklama=" + aciklama + "]";
	}
	
	
	
	
	
}
