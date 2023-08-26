package com.veysel.entity;

public class Kategori {

	String id;
	String ad;
	
	
	public Kategori(String ad) {
		super();
		this.ad = ad;
	}


	@Override
	public String toString() {
		return "Kategori [id=" + id + ", ad=" + ad + "]";
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
	
	
	
	
	
	
	
	
	
	
	
	
	
}
