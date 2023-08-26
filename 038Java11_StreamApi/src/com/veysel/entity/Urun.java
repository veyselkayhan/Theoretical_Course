package com.veysel.entity;

import java.util.UUID;

public class Urun {

	String id;
	String ad;
	String renk;
	String still;
	
	private Kategori kategori;

	
	
	
	public Urun( String ad, String renk, String still) {
		super();
		this.id = UUID.randomUUID().toString();
		this.ad = ad;
		this.renk = renk;
		this.still = still;
	}
	
	

	public Urun( String ad, String renk, String still, Kategori kategori) {
		super();
		this.id = UUID.randomUUID().toString();
		this.ad = ad;
		this.renk = renk;
		this.still = still;
		this.kategori = kategori;
	}



	@Override
	public String toString() {
		return "Urun [id=" + id + ", ad=" + ad + ", renk=" + renk + ", still=" + still + ", kategori=" + kategori + "]";
	}



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

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getStill() {
		return still;
	}

	public void setStill(String still) {
		this.still = still;
	}

	public Kategori getKategori() {
		return kategori;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}
	
	
	
}
